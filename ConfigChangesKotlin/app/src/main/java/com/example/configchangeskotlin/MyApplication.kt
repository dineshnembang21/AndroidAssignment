package com.example.configchangeskotlin

import android.app.Application
import android.content.res.Configuration
import android.util.Log

class MyApplication : Application() {
    private val singleton: MyApplication? = null
    private val TAG = "MyApplication"
    fun getInstance(): MyApplication? {
        return Companion.singleton
    }

    companion object {
        val singleton: MyApplication? = null
    }

    override fun onCreate() {
        super.onCreate()
        Log.d(TAG,"onCreate")
    }

    override fun onLowMemory() {
        super.onLowMemory()
        Log.d(TAG,"onLowMemory")
    }

    override fun onTrimMemory(level: Int) {
        super.onTrimMemory(level)
        Log.d(TAG,"onTrimMemory")
    }

    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)
        Log.d(TAG,"onConfigurationChanged")
    }
}