package com.example.myapplication

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val name=findViewById<EditText>(R.id.firstEdit)
//        name.error="error"
        val email=findViewById<EditText>(R.id.seconEdit)
//        email.error="error"
        val bottom=findViewById<Button>(R.id.save)

        val localStorage=getSharedPreferences("user",Context.MODE_PRIVATE).edit()



        bottom.setOnClickListener {

            val intent=Intent(this,HomeActivity::class.java)


            localStorage.putString("userName",name.text.toString())
            localStorage.putString("userEmail",email.text.toString()).apply()

            startActivity(intent)


        }




    }


}