package ru.ladgertha.testapplication

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val whiteButton = findViewById<AppCompatButton>(R.id.whiteButton)
        val blackButton = findViewById<AppCompatButton>(R.id.blackButton)
        val tealButton = findViewById<AppCompatButton>(R.id.tealButton)


        whiteButton.setOnClickListener {
            blackButton.visibility = View.GONE
            tealButton.visibility = View.VISIBLE
        }

        blackButton.setOnClickListener {
            tealButton.visibility = View.GONE
            whiteButton.visibility = View.VISIBLE
        }

        tealButton.setOnClickListener {
            blackButton.visibility = View.VISIBLE
            whiteButton.visibility = View.GONE
        }
    }
}