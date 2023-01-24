package com.example.configchangeskotlin

import android.content.res.Configuration
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private val TAG = "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG,"onCreate")
    }


    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)
        Log.d(TAG, "onConfigurationChanged")

        if(newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE){
            Log.d(TAG,"Orientation Landscape")
        }
        if(newConfig.orientation == Configuration.KEYBOARDHIDDEN_NO){
            Log.d(TAG,"Keyboard Hidden No")
        }
    }
}



