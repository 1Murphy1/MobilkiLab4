package com.example.roomdagger

import android.app.Application
import com.example.roomdagger.di.DaggerAppComponent

class MyApplication : Application() {

    val appComponent = DaggerAppComponent.create()

    override fun onCreate() {
        super.onCreate()
        appComponent.inject(this)  
    }
}
