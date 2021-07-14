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

        var a = 10
        var b = 20

        while (a < 100 || b < 100) {
            Log.i("a dan b = ", "nilai a dan nilai b saat ini $a & $b")
            a++
            b++
        }

        var x = 20

        do {
            x++
            Log.i("x = ", "Nilai x saat ini $x")
        } while (x < 100)
    }
}