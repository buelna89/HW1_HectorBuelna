package com.example.hw1_hectorbuelna

import android.content.Intent
import android.os.Build

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.widget.Button
import android.widget.EditText
import android.widget.TextView

import android.widget.Toast
import androidx.annotation.RequiresApi

class grades : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.R)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_grades)
        findViewById<Button>(R.id.button).setOnClickListener()
        {
            val myGrade = findViewById<EditText>(R.id.editTextTextPersonName).text.toString()
            val display = findViewById<TextView>(R.id.textView2)
            if (myGrade < "60")
            {
                display.text = "Your Grade is an F"
            }
            else if (myGrade < "70")
            {
                display.text = "Your Grade is a D"
            }
            else if (myGrade < "80")
            {
                display.text = "Your Grade is a C"
            }
            else if (myGrade < "90")
            {
                display.text = "Your Grade is a B"
            }
            else if (myGrade < "100")
            {
                display.text = "Your Grade is a A"
            }
        }

    }
}