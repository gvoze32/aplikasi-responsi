package com.example.aplikasi_responsi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class RecoveryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recovery)
        supportActionBar?.hide()
    }

    fun backRecovery(view: View) {
        val intent = android.content.Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}