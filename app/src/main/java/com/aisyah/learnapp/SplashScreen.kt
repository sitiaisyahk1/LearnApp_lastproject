package com.aisyah.learnapp

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import com.aisyah.learnapp.onboarding.OnBoardingActivity

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        supportActionBar?.hide()

        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, OnBoardingActivity::class.java)
            startActivity(intent)
            finish()
        }, 5000)
    }
}