package com.hgecapsi.newsapptestoneproject.ui.activities.intros

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.view.WindowInsets
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.hgecapsi.newsapptestoneproject.databinding.ActivitySplashUiBinding

class SplashUIActivity : AppCompatActivity() {
   private lateinit var splashUiBinding: ActivitySplashUiBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // this to remove status bar
        @Suppress("DEPRECATION")
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            window.insetsController?.hide(WindowInsets.Type.statusBars())
        } else {
            window.setFlags(
                WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN
            )
        }

        // Handle the splash screen transition.
        val splashScreen = installSplashScreen()

        // view binding
        splashUiBinding = ActivitySplashUiBinding.inflate(layoutInflater)

        splashScreen.setKeepOnScreenCondition{true}

        // intent
        startActivity( Intent(this, IntroActivity::class.java))
        finish()

        setContentView(splashUiBinding.root)
    }
}