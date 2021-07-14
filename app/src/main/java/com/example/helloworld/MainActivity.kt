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

        // while, do-while, for

        val rangeNumber = 1..10
        val anotherRangeNumber = listOf<Int>(1,2,3,4)

        for(i in rangeNumber){
            Log.i("LOOPING", "Current value now $i")
        }


    }
}