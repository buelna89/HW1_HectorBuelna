package com.example.hw1_hectorbuelna

import android.os.Build
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity

class grades : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.R)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_grades)
        findViewById<Button>(R.id.button).setOnClickListener()
        {
            val myGrade = findViewById<EditText>(R.id.editTextTextPersonName).text.toString()
            val display = findViewById<TextView>(R.id.textView2)
            if (myGrade >= "90") {
                display.text = "Your Grade is a A"
            } else {
                if (myGrade >= "80" && myGrade <= "89") {
                    display.text = "Your Grade is a B"
                }
                else {
                    if (myGrade >= "70" && myGrade <= "79") {
                        display.text = "Your Grade is a C"
                    } else {
                        if (myGrade >= "60" && myGrade <= "69") {
                            display.text = "Your Grade is a D"
                        } else {
                            display.text = "Your Grade is an F"
                            //this is just to see if it lets me commit back to the repo
                        }
                    }
                }
            }

        }

    }
}