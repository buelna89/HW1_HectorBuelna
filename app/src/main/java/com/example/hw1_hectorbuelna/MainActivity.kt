package com.example.hw1_hectorbuelna


import android.content.Intent
import android.widget.Button

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.grades).setOnClickListener {
            startActivity(Intent(this, grades::class.java))
        }

        findViewById<Button>(R.id.cButton).setOnClickListener{
                startActivity(Intent(this, coupons::class.java))
            }

    }
}