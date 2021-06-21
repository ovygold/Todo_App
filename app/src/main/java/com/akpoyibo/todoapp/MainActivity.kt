package com.akpoyibo.todoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.google.android.material.bottomnavigation.BottomNavigationItemView

class MainActivity : AppCompatActivity() {
    val username : String= "admin"
    val password : String= "admin"
   private lateinit var usernameInput : EditText
   private lateinit var passwordInput : EditText
   private lateinit var buttonInput : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

}