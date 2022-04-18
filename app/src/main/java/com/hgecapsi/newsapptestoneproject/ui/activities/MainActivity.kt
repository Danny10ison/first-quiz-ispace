package com.hgecapsi.newsapptestoneproject.ui.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.hgecapsi.newsapptestoneproject.R
import com.hgecapsi.newsapptestoneproject.databinding.ActivityMainBinding
import com.hgecapsi.newsapptestoneproject.ui.fragments.AllDevsFragment
import com.hgecapsi.newsapptestoneproject.ui.fragments.FavouriteDevFragment
import com.hgecapsi.newsapptestoneproject.ui.fragments.FeedbackFragment
import com.hgecapsi.newsapptestoneproject.ui.fragments.SearchDevFragment

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var bottomNavigationView: BottomNavigationView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //        switching between fragments
        bottomNavigationView = findViewById(R.id.nav_view)

        bottomNavigationView.setOnNavigationItemSelectedListener{
            it.isChecked = true

            when(it.itemId){
                R.id.action_all_devs -> switchFragment(AllDevsFragment(),it.title.toString())
                R.id.action_search_dev -> switchFragment(SearchDevFragment(),it.title.toString())
                R.id.action_favourite_dev -> switchFragment(FavouriteDevFragment(),it.title.toString())
                R.id.action_give_feedback -> switchFragment(FeedbackFragment(),it.title.toString())
            }
            true
        }
    }

    private fun switchFragment(fragment: Fragment,title: String) {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.nav_host_fragment,fragment)
        fragmentTransaction.commit()
        setTitle(title)
    }

}