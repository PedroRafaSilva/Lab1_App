package com.example.lab1_app

import android.content.Intent
import android.content.res.Configuration
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import java.util.Locale

class LanguageActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_language)

        val btnGoBack: Button = findViewById(R.id.btnGoBack)
        btnGoBack.setOnClickListener {
            val intent = Intent(this, Activity1::class.java)
            startActivity(intent)
        }

        val englishButton: Button = findViewById(R.id.englishButton)
        val portugueseButton: Button = findViewById(R.id.portugueseButton)
        val frenchButton: Button = findViewById(R.id.frenchButton)
        val spanishButton: Button = findViewById(R.id.spanishButton)

        englishButton.setOnClickListener {
            setLocale("en")
            restartActivity()
        }

        portugueseButton.setOnClickListener {
            setLocale("pt")
            restartActivity()
        }

        frenchButton.setOnClickListener {
            setLocale("fr")
            restartActivity()
        }

        spanishButton.setOnClickListener {
            setLocale("es")
            restartActivity()
        }
    }

    private fun setLocale(languageCode: String) {
        val locale = Locale(languageCode)
        Locale.setDefault(locale)
        val configuration = Configuration(resources.configuration)
        configuration.setLocale(locale)
        baseContext.resources.updateConfiguration(configuration, baseContext.resources.displayMetrics)
    }

    private fun restartActivity() {
        val intent = Intent(this, LanguageActivity::class.java)
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK)
        startActivity(intent)
        finish()
    }
}
