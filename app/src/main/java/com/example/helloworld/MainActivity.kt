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

//        Toast.makeText(this, "OnCreate function", Toast.LENGTH_LONG)
//        Log.i("info", "onCreate Function Executed!")

        var carBrand = "Toyota"
        var carName = "Fortuner"
        val year = 2005
        val yearNow = 2021

        //additional operator
        var total = carBrand + carName + year.toString()

        //assignment operator
        carBrand = carName

        //subtract operator
        var totalYear = "The car is " + (yearNow - year) + " years old"

        //division operator
        var divisionResult = yearNow / year

        //multipliction operator
        var mulResult = yearNow * year

        //increment operator
        var incrementResult = 2000
        incrementResult++

        //decrement operator
        var decrementResult = 1000
        decrementResult--
        decrementResult--

        //show output to log
        Log.i("LOG", total)

        val textView: TextView = findViewById(R.id.textView)

        textView.setText(decrementResult.toString())
    }
}