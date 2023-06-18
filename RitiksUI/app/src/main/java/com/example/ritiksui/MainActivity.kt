package com.example.ritiksui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnReport=findViewById<Button>(R.id.btnReport)
        btnReport.setOnClickListener{
            Toast.makeText(this, "Reported", Toast.LENGTH_SHORT).show()
        }

    }
}