package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textview: TextView = findViewById(R.id.textView)

        var firstNumber = 10
        var secondNummber: Int = 20

        if (secondNummber != null) {
            var result = firstNumber.times(secondNummber)
            textview.setText(result.toString())
        }
        else{
            var result = "String berisi null"
            textview.setText(result.toString())
        }

    }
}