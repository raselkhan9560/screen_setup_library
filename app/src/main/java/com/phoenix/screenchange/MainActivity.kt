package com.phoenix.screenchange

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.phoenix.screens.ChangeNavigationBarColor
import com.phoenix.screens.ChangeStatusBar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ChangeStatusBar(this,resources.getColor(R.color.white))
        ChangeNavigationBarColor(this,resources.getColor(R.color.colorPrimary))
        setContentView(R.layout.activity_main)
    }
}