package com.aisyah.learnapp.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Html
import androidx.lifecycle.ViewModelProviders
import com.aisyah.learnapp.MainActivity
import com.aisyah.learnapp.R
import com.aisyah.learnapp.login.state.LoginState
import com.aisyah.learnapp.login.state.ScreenState
import com.aisyah.learnapp.login.viewmodel.LoginViewModel
import com.aisyah.learnapp.onboarding.AppPrefs
import com.aisyah.learnapp.onboarding.OnBoardingActivity
import com.aisyah.learnapp.onboarding.hide
import com.aisyah.learnapp.onboarding.show
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    private lateinit var viewModel: LoginViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        // Check if the app is launched before
        if (AppPrefs(this).isFirstTimeLaunch()) {
            startActivity(Intent(this, OnBoardingActivity::class.java))
            finish()
        }
        setContentView(R.layout.activity_login)

        init()
        interactions()
    }

    private fun init() {
        viewModel = ViewModelProviders.of(
            this,
            LoginViewModel.LoginViewModelFactory(LoginInteractor())
        )[LoginViewModel::class.java]
        viewModel.loginState.observe(::getLifecycle, ::updateUi)

    }

    private fun interactions() {
        loginBtn.setOnClickListener {
            viewModel.onLoginBtnClicked(
                usernameEt.editText?.text.toString(),
                passwordEt.editText?.text.toString()


            )
        }
    }

    private fun updateUi(screenState: ScreenState<LoginState>?) {
        when (screenState) {
            ScreenState.Loading -> loading.show()
            is ScreenState.Render -> processLoginState(screenState.renderState)
        }
    }

    private fun processLoginState(renderState: LoginState) {
        loading.hide()
        when (renderState) {
            LoginState.SUCCESS -> {
                startActivity(Intent(this, MainActivity::class.java))
                finish()
            }
            LoginState.WRONG_USERNAME ->
                usernameEt.error = resources.getString(R.string.invalid_username)
            LoginState.WRONG_PASSWORD ->
                passwordEt.error = resources.getString(R.string.invalid_password)
        }
    }
}