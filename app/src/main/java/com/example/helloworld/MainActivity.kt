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

        // statement and conditions
        val textView: TextView = findViewById(R.id.textView)

        var x = 10
        var y = 20

        var largest = "XY"

        if (x > y)
            textView.setText("X")
        else
            textView.setText("Y")


    }
}