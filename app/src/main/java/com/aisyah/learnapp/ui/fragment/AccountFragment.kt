package com.aisyah.learnapp.ui.fragment

import android.app.Activity
import android.content.Context.MODE_PRIVATE
import android.content.Intent
import android.content.SharedPreferences
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.activity.result.ActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatDelegate
import com.aisyah.learnapp.R
import com.aisyah.learnapp.SplashScreen
import com.aisyah.learnapp.account.AboutAppActivity
import com.aisyah.learnapp.account.EditAccountActivity
import com.aisyah.learnapp.error.ErrorActivity
import com.github.dhaval2404.imagepicker.ImagePicker
import kotlinx.android.synthetic.main.fragment_account.*


class AccountFragment : Fragment() {

    private var mProfileUri: Uri? = null

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
            val intent = Intent(context, ErrorActivity::class.java)
            startActivity(intent)
        }

        btn_aboutapp.setOnClickListener {
            val intent = Intent(context, AboutAppActivity::class.java)
            startActivity(intent)
        }

        btn_bookmarkmodules.setOnClickListener {
            val intent = Intent(context, ErrorActivity::class.java)
            startActivity(intent)
        }

        btn_favstudents.setOnClickListener {
            val intent = Intent(context, ErrorActivity::class.java)
            startActivity(intent)
        }

        switch1.setOnCheckedChangeListener{ _, isChecked ->
            if (switch1.isChecked) {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)

                val editor: SharedPreferences.Editor = requireActivity().getSharedPreferences("DarkMode", MODE_PRIVATE).edit()
                editor.putBoolean("DarkMode", true)
                editor.apply()
            } else {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)

                val editor: SharedPreferences.Editor = requireActivity().getSharedPreferences("DarkMode", MODE_PRIVATE).edit()
                editor.putBoolean("DarkMode", false)
                editor.apply()
            }

        }

        val sharedPrefs: SharedPreferences = requireActivity().getSharedPreferences("DarkMode", MODE_PRIVATE)
        switch1.setChecked(sharedPrefs.getBoolean("DarkMode", true))

        ivProfile.setOnClickListener {
            ImagePicker.with(this)
                .compress(1024) //Final image size will be less than 1 MB(Optional)
                .maxResultSize(1080, 1080)
                .cropSquare()	//Final image resolution will be less than 1080 x 1080(Optional)
                .start()
        }

        btn_logout.setOnClickListener {
            val intent = Intent(context, SplashScreen::class.java)
            startActivity(intent)
        }

    }

    //pick image
    private val startForProfileImageResult =
        registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result: ActivityResult ->
            val resultCode = result.resultCode
            val data = result.data

            if (resultCode == Activity.RESULT_OK) {
                //Image Uri will not be null for RESULT_OK
                val fileUri = data?.data!!

                mProfileUri = fileUri
                ivProfile.setImageURI(fileUri)
            } else if (resultCode == ImagePicker.RESULT_ERROR) {
                Toast.makeText(context, ImagePicker.getError(data), Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(context, "Task Cancelled", Toast.LENGTH_SHORT).show()
            }
        }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (resultCode == Activity.RESULT_OK) {
            //Image Uri will not be null for RESULT_OK
            val uri: Uri = data?.data!!

            // Use Uri object instead of File to avoid storage permissions
            ivProfile.setImageURI(uri)
        } else if (resultCode == ImagePicker.RESULT_ERROR) {
            Toast.makeText(context, ImagePicker.getError(data), Toast.LENGTH_SHORT).show()
        } else {
            Toast.makeText(context, "Task Cancelled", Toast.LENGTH_SHORT).show()
        }
    }



}