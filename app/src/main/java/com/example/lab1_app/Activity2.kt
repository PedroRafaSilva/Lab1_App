package com.example.lab1_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Activity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)

        val btnGoBackToActivity1: Button = findViewById(R.id.btnGoBackToActivity1)
        btnGoBackToActivity1.setOnClickListener {
            finish()
        }
    }
}