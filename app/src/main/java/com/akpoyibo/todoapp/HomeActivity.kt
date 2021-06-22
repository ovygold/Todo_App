package com.akpoyibo.todoapp

import android.icu.number.NumberFormatter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class HomeActivity : AppCompatActivity() {
    private lateinit var userDisplay : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        userDisplay = findViewById(R.id.usernameDisplay)

        userDisplay.text= "Hello human beings"
    }

}