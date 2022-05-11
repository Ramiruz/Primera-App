package com.example.desarrollodesoftware

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val boton: Button = findViewById(R.id.btn)
        boton.setOnClickListener{
            val intent: Intent = Intent(this, MainActivity2:: class.java)
            startActivity(intent)
        }
    }
}