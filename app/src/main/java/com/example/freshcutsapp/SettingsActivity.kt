package com.example.freshcutsapp

import android.os.Bundle
import android.widget.Switch
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class SettingsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)

        val switchDarkMode = findViewById<Switch>(R.id.switchDarkMode)
        switchDarkMode.setOnCheckedChangeListener { _, isChecked ->
            val mode = if (isChecked) "Dark Mode ON" else "Dark Mode OFF"
            Toast.makeText(this, mode, Toast.LENGTH_SHORT).show()
        }
    }
}
