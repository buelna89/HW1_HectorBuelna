package com.example.hw1_hectorbuelna

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class coupons : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_coupons)

        findViewById<Button>(R.id.button3).setOnClickListener()
        {
            val display = findViewById<TextView>(R.id.textView3)

            display.text = "Discont created"


        }
    }
}