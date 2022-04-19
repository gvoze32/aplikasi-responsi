package com.example.aplikasi_responsi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.fragment.app.Fragment
import com.example.aplikasi_responsi.history.HistoryFragment
import com.example.aplikasi_responsi.home.HomeFragment
import com.example.aplikasi_responsi.payment.PaymentFragment
import com.example.aplikasi_responsi.setting.SettingFragment

class HomeActivity : AppCompatActivity() {

    private lateinit var btn1 : ImageView
    private lateinit var btn2 : ImageView
    private lateinit var btn3 : ImageView
    private lateinit var btn4 : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        supportActionBar?.hide()

        btn1 = findViewById(R.id.btnHome)
        btn2 = findViewById(R.id.btnPayment)
        btn3 = findViewById(R.id.btnHistory)
        btn4 = findViewById(R.id.btnSetting)

        btn1.setOnClickListener {
            loadFragment(HomeFragment())
        }
        btn2.setOnClickListener{
            loadFragment(PaymentFragment())
        }
        btn3.setOnClickListener{
            loadFragment(HistoryFragment())
        }
        btn4.setOnClickListener{
            loadFragment(SettingFragment())
        }
}

private fun loadFragment(fragment: Fragment) {
    supportFragmentManager.beginTransaction()
        .replace(R.id.frameLayout, fragment)
        .commitNow()
}
}