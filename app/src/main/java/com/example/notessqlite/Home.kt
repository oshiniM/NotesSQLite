package com.example.notessqlite

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home)

        Handler().postDelayed({
            // Create an intent to navigate to the next activity
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish() // Optional: Close the current activity if needed
        }, 3000L)
    }
}
