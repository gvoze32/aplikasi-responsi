package com.example.aplikasi_responsi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.fragment.app.Fragment
import com.example.aplikasi_responsi.databinding.ActivityHomeBinding
import com.example.aplikasi_responsi.history.HistoryFragment
import com.example.aplikasi_responsi.home.HomeFragment
import com.example.aplikasi_responsi.payment.PaymentFragment
import com.example.aplikasi_responsi.setting.SettingFragment

class HomeActivity : AppCompatActivity() {
    private var _binding: ActivityHomeBinding? = null
    private val binding get() = _binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding?.root)
        supportActionBar?.hide()
        binding?.apply {
            btnHome.setOnClickListener {
                loadFragment(HomeFragment())
            }
        }
        binding?.btnHistory?.setOnClickListener {
            loadFragment(HistoryFragment())
        }
        binding?.btnPayment?.setOnClickListener {
            loadFragment(PaymentFragment())
        }
        binding?.btnSetting?.setOnClickListener {
            loadFragment(SettingFragment())
        }
    }

    private fun loadFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.container, fragment)
            .commitNow()
    }
}