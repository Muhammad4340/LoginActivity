package com.example.loginactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.loginactivity)
        //instance
        val btnLogin : Button = findViewById(R.id.ButtonLogin)
        //event btn login di-klik
        btnLogin.setOnClickListener{

            //coll home activity
            val intentHome = Intent(this,LoginActivity::class.java)
            startActivity(intentHome)
        }
    }
}