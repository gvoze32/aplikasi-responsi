package com.example.aplikasi_responsi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()
    }

    fun login(View: View) {
        val login = android.content.Intent(this, HomeActivity::class.java)
        startActivity(login)
    }

    fun intentForgotPassword(View: View) {
        val forgot = android.content.Intent(this, RecoveryActivity::class.java)
        startActivity(forgot)
    }

    fun intentRegister(View: View) {
        val register = android.content.Intent(this, RegisterActivity::class.java)
        startActivity(register)
    }
}