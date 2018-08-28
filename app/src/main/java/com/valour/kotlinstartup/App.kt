package com.valour.kotlinstartup

import android.app.Application
import android.support.multidex.MultiDex
import com.blankj.utilcode.util.Utils

open class App : Application() {

    override fun onCreate() {
        super.onCreate()

        MultiDex.install(this)
        Utils.init(this)
    }


}