package com.example.roomdagger.di

import com.example.roomdagger.MyApplication
import com.example.roomdagger.ui.MainActivity
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [DatabaseModule::class])
interface AppComponent {
    fun inject(activity: MainActivity)
    fun inject(application: MyApplication)
}
