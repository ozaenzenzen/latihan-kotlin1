package com.example.helloworld

import android.app.KeyguardManager
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text
import java.security.Key

class MainActivity : AppCompatActivity(), View.OnClickListener {
//class MainActivity : AppCompatActivity(){
    private var value = 0

    lateinit var textView: TextView
    lateinit var btnAdd: Button
    lateinit var btnGrow: Button
    lateinit var btnHide: Button
    lateinit var btnTake: Button
    lateinit var btnShrink: Button
    lateinit var btnReset: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Ui Examples
        textView = findViewById(R.id.textView)

        btnAdd = findViewById(R.id.btnAdd)
        btnGrow = findViewById(R.id.btnGrow)
        btnHide = findViewById(R.id.btnHide)
        btnTake = findViewById(R.id.btnTake)
        btnShrink = findViewById(R.id.btnShrink)
        btnReset = findViewById(R.id.btnReset)

        textView.setOnClickListener(this)

        btnAdd.setOnClickListener(this)
        btnGrow.setOnClickListener(this)
        btnHide.setOnClickListener(this)
        btnTake.setOnClickListener(this)
        btnShrink.setOnClickListener(this)
        btnReset.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        val size: Float

        when (v.id) {
            R.id.btnAdd -> {
                value++
                textView.text = "$value"
            }
            R.id.btnTake -> {
                value--
                textView.text = "$value"
            }
            R.id.btnReset -> {
                value = 0
                textView.text = "$value"
            }
            R.id.btnGrow -> {
                size = textView.scaleX
                textView.scaleX = size + 1
            }
            R.id.btnShrink -> {
                size = textView.scaleX
                textView.scaleX = size - 1
            }
            R.id.btnHide -> {
                if (textView.visibility == View.VISIBLE) {
                    textView.visibility = View.INVISIBLE
                    btnHide.text = "SHOW"
                } else {
                    textView.visibility = View.VISIBLE
                    btnHide.text = "HIDE"
                }
            }
        }
    }
}