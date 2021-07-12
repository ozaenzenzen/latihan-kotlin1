package com.example.helloworld

import android.app.KeyguardManager
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import android.widget.Toast
import java.security.Key

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(this, "OnCreate function", Toast.LENGTH_LONG)
        Log.i("info", "onCreate Function Executed!")
    }

    //single line kotlin
//
//    override fun onStart() {
//        super.onStart()
//        Toast.makeText(this, "OnStart function", Toast.LENGTH_LONG)
//        Log.i("info", "OnStart Function Executed!")
//    }
    //multiline comment kotlin
    override fun onResume() {
        super.onResume()
        Toast.makeText(this, "OnResume function", Toast.LENGTH_LONG)
        Log.i("info", "OnResume Function Executed!")
    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(this, "onPause function", Toast.LENGTH_LONG)
        Log.i("info", "onPause Function Executed!")
    }

    override fun onStop() {
        super.onStop()
        Toast.makeText(this, "onStop function", Toast.LENGTH_LONG)
        Log.i("info", "onStop Function Executed!")
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this, "onDestroy function", Toast.LENGTH_LONG)
        Log.i("info", "onDestroy Function Executed!")
    }


}