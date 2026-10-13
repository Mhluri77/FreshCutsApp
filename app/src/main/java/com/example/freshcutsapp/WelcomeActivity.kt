package com.example.freshcutsapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class WelcomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        val btnContinue = findViewById<Button>(R.id.btnContinue)

        btnContinue.setOnClickListener {
            // Navigate to MainActivity (your hub with Dark Mode + navigation buttons)
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish() // closes WelcomeActivity so user doesn’t come back when pressing back
        }
    }
}
