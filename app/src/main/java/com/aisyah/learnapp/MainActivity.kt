package com.aisyah.learnapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.NavHostFragment
import com.aisyah.learnapp.fragment.HomeFragment
import com.aisyah.learnapp.utils.onNavDestinationSelected
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        val defaultMainView = HomeFragment.defaultFragment()
        addFragment(defaultMainView)

        val navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        val navController = navHostFragment.navController


        bubbleTabBar.addBubbleListener{ id ->
            onNavDestinationSelected(id, navController)

        }

        navController.addOnDestinationChangedListener { _, destination, _ ->
            bubbleTabBar.setSelectedWithId(destination.id, false)
        }
    }

    private fun addFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.nav_host_fragment, fragment, fragment::class.java.simpleName)
            .addToBackStack(null).commit()
    }
}