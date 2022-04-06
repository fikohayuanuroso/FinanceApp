package com.paymu.financeapp

import android.net.wifi.hotspot2.pps.HomeSp
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import com.paymu.financeapp.ui.home.HomeFragment
import com.paymu.financeapp.ui.profile.ProfileFragment
import com.paymu.financeapp.ui.setting.SettingFragment

class MainActivity : AppCompatActivity() {
    private lateinit var btnHome: Button
    private lateinit var btnProfile : Button
    private lateinit var btnSetting: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnHome = findViewById(R.id.btn_Home)
        btnProfile = findViewById(R.id.btn_Profile)
        btnSetting = findViewById(R.id.btn_Setting)

        handlefFragment()

    }

    private fun handlefFragment() {
        val homeFragment = HomeFragment()
        val profileFragment = ProfileFragment ()
        val settingFragment = SettingFragment ()


        btnHome.setOnClickListener {
            loadFragment(homeFragment)
        }

        btnProfile.setOnClickListener {
            loadFragment(profileFragment)
        }

        btnSetting.setOnClickListener {
            loadFragment(settingFragment)
        }


    }

    private fun loadFragment(fragment: Fragment){
      supportFragmentManager.beginTransaction()
          .replace(R.id.container, fragment)
          .commitNow()

    }
}