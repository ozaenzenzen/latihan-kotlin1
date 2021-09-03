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

        //function 2 kotlin
        val ans: Int = getASum(2, 3)
        Log.i("Tag: ", ans.toString())
    }

    fun getASum(a: Int, b: Int): Int {
        return a + b
    }

}