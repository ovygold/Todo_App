package com.akpoyibo.todoapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ProfileActivity : AppCompatActivity() {
    private lateinit var homeButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        homeButton = findViewById(R.id.homeButton)
        backToHomePage()
    }
    private fun backToHomePage(){
        val intent = Intent(this,HomeActivity::class.java)
        startActivity(intent)
    }
}