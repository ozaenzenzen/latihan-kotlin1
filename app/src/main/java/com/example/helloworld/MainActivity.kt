package com.example.helloworld

import android.app.KeyguardManager
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import java.security.Key

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textview: TextView = findViewById(R.id.textView)
        //type casting - as
        val keyMgr =  getSystemService(Context.KEYGUARD_SERVICE) as? KeyguardManager
        if(keyMgr is KeyguardManager){
            //do something
        }

//        textview.setText(result.toString())
    }
}