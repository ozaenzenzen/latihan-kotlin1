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
        var countUp = 0
        while (countUp < 20) {
            countUp++
            if (countUp > 15) {
                continue
            }
            Log.i("continue", "Continue at $countUp")
        }
        Log.i("Output", "Result $countUp")

    }
}