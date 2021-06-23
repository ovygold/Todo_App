package com.akpoyibo.todoapp

import android.content.Intent
import android.icu.number.NumberFormatter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class HomeActivity : AppCompatActivity() {
    private lateinit var userDisplay : TextView
    private lateinit var profileButton : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        userDisplay = findViewById(R.id.usernameDisplay)
        profileButton = findViewById(R.id.profileButton)

        userDisplay.text=intent.getStringExtra("username")
        profileButton.setOnClickListener {
            openProfilePage()
        }
    }
    private fun openProfilePage(){
        val intent = Intent(this,ProfileActivity::class.java)
        startActivity(intent)
    }

}