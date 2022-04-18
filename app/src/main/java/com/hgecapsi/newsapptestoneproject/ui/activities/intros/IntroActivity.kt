package com.hgecapsi.newsapptestoneproject.ui.activities.intros

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import com.hgecapsi.newsapptestoneproject.ui.activities.MainActivity
import com.hgecapsi.newsapptestoneproject.databinding.ActivityIntroBinding

class IntroActivity : AppCompatActivity() {
    private lateinit var introActivityIntroBinding: ActivityIntroBinding
    private val INTRO_UI_TIME_OUT:Long = 6000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        introActivityIntroBinding = ActivityIntroBinding.inflate(layoutInflater)

        // delay the UI for <SPLASH_UI_TIME_OUT> milliseconds
        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }, INTRO_UI_TIME_OUT)

        setContentView(introActivityIntroBinding.root)
    }
}

