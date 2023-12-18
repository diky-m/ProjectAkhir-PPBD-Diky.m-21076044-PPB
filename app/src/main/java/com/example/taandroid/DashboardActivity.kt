package com.example.taandroid

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView

class DashboardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        val buttonLogout = findViewById<Button>(R.id.btnLogout)
        buttonLogout.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        val materi = findViewById<CardView>(R.id.cvTeori)
        materi.setOnClickListener {
            val intent = Intent(this, MateriActivity::class.java)
            startActivity(intent)
        }
    }
}