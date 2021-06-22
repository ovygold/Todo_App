package com.akpoyibo.todoapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.android.material.bottomnavigation.BottomNavigationItemView

class MainActivity : AppCompatActivity() {
    val validUsername : String= "admin"
    val validPassword : String= "admin"


    //layout variables
   private lateinit var usernameInput : EditText
   private lateinit var passwordInput : EditText
   private lateinit var submitbutton : Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        usernameInput = findViewById(R.id.UsernameInput)
        passwordInput = findViewById(R.id.passwordInput)
        submitbutton = findViewById(R.id.submitButton)

        submitbutton.setOnClickListener {
            val username = usernameInput.text.toString()
            val password =passwordInput.text.toString()

            login(username, password)
        }
    }
   fun login (username : String,password: String){
       if (isValidCredential(username, password)){
           val intent: Intent=Intent (this,HomeActivity::class.java)
           intent.putExtra("username",username)
           startActivity(intent)
       }else{
           Toast.makeText(applicationContext,"login error",Toast.LENGTH_SHORT).show()
       }
   }

    private fun isValidCredential(username: String,password: String) : Boolean{
        if (username == validUsername && password == validPassword)return true
        return false
    }
}