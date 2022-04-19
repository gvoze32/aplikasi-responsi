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

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        supportActionBar?.hide()

}

    fun btnHome(view: ImageView) {
        loadFragment(HomeFragment())
    }

    fun btnHistory(view: ImageView) {
        loadFragment(HistoryFragment())
    }

    fun btnPayment(view: ImageView) {
        loadFragment(PaymentFragment())
    }

    fun btnSetting(view: ImageView) {
        loadFragment(SettingFragment())
    }

    private fun loadFragment(fragment: Fragment) {
    supportFragmentManager.beginTransaction()
        .replace(R.id.container, fragment)
        .commitNow()
}
}