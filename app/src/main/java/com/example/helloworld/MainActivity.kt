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

        var x = 14
        var y = 20

        when (x) {
            9 -> textView.setText("9 Lower than 10")
            10 -> textView.setText("10 same with 10")
            11 -> textView.setText("11 Greater than 10")
            12 -> textView.setText("12 Greater than 10")

            else -> textView.setText("Out of if statement")
        }

    }
}