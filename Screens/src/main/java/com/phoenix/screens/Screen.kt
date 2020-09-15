package com.phoenix.screens

import android.app.Activity
import android.os.Build
import android.view.View
import android.view.Window
import android.view.WindowManager
import androidx.annotation.RequiresApi


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

fun fullScreen(activity: Activity){
    activity.requestWindowFeature(Window.FEATURE_NO_TITLE)
    activity.window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
    activity.window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
}


@RequiresApi(Build.VERSION_CODES.KITKAT)
fun hideTopBar(activity: Activity){
    activity.requestWindowFeature(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
}

