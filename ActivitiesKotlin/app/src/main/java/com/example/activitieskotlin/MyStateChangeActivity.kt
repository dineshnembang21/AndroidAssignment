package com.example.activitieskotlin

import android.app.Activity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log

class MyStateChangeActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("MyStateChangeActivity", "onCreate()");
    }

    override fun onRestoreInstanceState(
        savedInstanceState: Bundle?,
        persistentState: PersistableBundle?
    ) {
        super.onRestoreInstanceState(savedInstanceState, persistentState)
        Log.d("MyStateChangeActivity", "onRestoreInstanceState")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("MyStateChangeActivity", "onRestart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("MyStateChangeActivity", "onResume")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.d("MyStateChangeActivity", "onSaveInstanceState")
    }

    override fun onPause() {
        super.onPause()
        Log.d("MyStateChangeActivity", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("MyStateChangeActivity", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("MyStateChangeActivity", "onDestroy")
    }
}
