package com.example.aplikasi_responsi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        supportActionBar?.hide()
    }

    fun registerBtn(view: View) {
        val intent = android.content.Intent(this, HomeActivity::class.java)
        startActivity(intent)
    }
}