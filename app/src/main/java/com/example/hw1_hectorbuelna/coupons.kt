package com.example.hw1_hectorbuelna

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Build


import androidx.annotation.RequiresApi

//import android.content.Intent
import android.widget.Button

import android.widget.EditText
import android.widget.TextView
//import android.widget.Toast

//import android.view.View

class Coupons : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.R)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_coupons)
        findViewById<Button>(R.id.button3).setOnClickListener()
        {
            val variable = findViewById<TextView>(R.id.textView3)
            if (variable == variable){
                variable.text = "va"
            }
        }


    }
}