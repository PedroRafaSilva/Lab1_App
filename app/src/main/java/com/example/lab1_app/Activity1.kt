package com.example.lab1_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Activity1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_1)

        val btnGoToActivity2: Button = findViewById(R.id.btnGoBackToActivity2)
        btnGoToActivity2.setOnClickListener {
            val intent = Intent(this, Activity2::class.java)
            startActivity(intent)
        }

        val btnGoToLanguage: Button = findViewById(R.id.btnGoToLanguage)
        btnGoToLanguage.setOnClickListener {
            val intent = Intent(this, LanguageActivity::class.java)
            startActivity(intent)
        }
    }

}