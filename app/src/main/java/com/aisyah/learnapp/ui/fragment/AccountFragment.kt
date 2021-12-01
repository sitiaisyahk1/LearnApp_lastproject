package com.aisyah.learnapp.ui.fragment

import android.app.Activity.RESULT_OK
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.provider.MediaStore
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatDelegate
import com.aisyah.learnapp.R
import com.aisyah.learnapp.SplashScreen
import com.aisyah.learnapp.account.AboutAppActivity
import com.aisyah.learnapp.account.EditAccountActivity
import kotlinx.android.synthetic.main.fragment_account.*
import java.io.File
import java.io.FileOutputStream
import java.io.IOException
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter


class AccountFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_account, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btn_editprofile.setOnClickListener {
            val intent = Intent(context, EditAccountActivity::class.java)
            startActivity(intent)
        }

        btn_aboutapp.setOnClickListener {
            val intent = Intent(context, AboutAppActivity::class.java)
            startActivity(intent)
        }

        switch1.setOnCheckedChangeListener{ _, isChecked ->
            if (isChecked) {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
            } else {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
            }
        }

        btn_logout.setOnClickListener {
            val intent = Intent(context, SplashScreen::class.java)
            startActivity(intent)
        }

    }



}