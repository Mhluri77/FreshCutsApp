package com.example.freshcutsapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Switch
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val switchDarkMode = findViewById<Switch>(R.id.switchDarkMode)
        val btnGoLogin = findViewById<Button>(R.id.btnGoLogin)
        val btnGoSettings = findViewById<Button>(R.id.btnGoSettings)

        // Dark Mode toggle
        switchDarkMode.setOnCheckedChangeListener { _, isChecked ->
            val mode = if (isChecked) "Dark Mode ON" else "Dark Mode OFF"
            Toast.makeText(this, mode, Toast.LENGTH_SHORT).show()
        }

        // Navigate to Login screen
        btnGoLogin.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }

        // Navigate to Settings screen
        btnGoSettings.setOnClickListener {
            val intent = Intent(this, SettingsActivity::class.java)
            startActivity(intent)
        }
    }
}
