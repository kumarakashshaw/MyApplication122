package com.example.myapplication

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        val localStorage=getSharedPreferences("user", Context.MODE_PRIVATE)

        val getName=localStorage.getString("userName","Not found")
        val getEmail=localStorage.getString("userEmail","Not found")

        val show=findViewById<TextView>(R.id.showText)
        val showEmail=findViewById<TextView>(R.id.showEmail)

        show.text=getName
        showEmail.text=getEmail

    }
}