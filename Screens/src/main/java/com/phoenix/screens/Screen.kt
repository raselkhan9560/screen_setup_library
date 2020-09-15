package com.phoenix.screens

import android.app.Activity
import android.os.Build
import android.view.View
import androidx.core.content.ContextCompat


/**
 *ScreenChange
 *Rasel Khan
 *Time: 8:48 AM
 *Date: 9/15/2020
 */
fun ChangeAll(context: Activity,barColor:Int = 0){
    val mbarColor = barColor
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) context.window!!.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
        context.window!!.statusBarColor = mbarColor
        context.window!!.navigationBarColor = mbarColor
    }
}

fun ChangeStatusBar(context: Activity,barColor:Int = 0){
    val mbarColor = barColor
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) context.window!!.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) context.window!!.statusBarColor = mbarColor
}

fun ChangeNavigationBarColor(context: Activity,barColor:Int = 0){
    val mbarColor = barColor
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) context.window!!.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) context.window!!.navigationBarColor = mbarColor
}

