package ru.ladgertha.testapplication

import android.os.Bundle
import android.text.Spannable
import android.text.SpannableString
import android.text.style.ForegroundColorSpan
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatTextView
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val whiteButton = findViewById<AppCompatButton>(R.id.whiteButton)
        val blackButton = findViewById<AppCompatButton>(R.id.blackButton)
        val tealButton = findViewById<AppCompatButton>(R.id.tealButton)

        val greenText = "green text"
        val spannableGreenTextView = findViewById<AppCompatTextView>(R.id.spannableGreenText)
        val spannableString =
            SpannableString(getString(R.string.text_with_spannable_string, greenText))
        spannableString.setSpan(
            ForegroundColorSpan(ContextCompat.getColor(this, R.color.green)),
            spannableString.length - greenText.length,
            spannableString.length,
            Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
        )
        spannableGreenTextView.text = spannableString

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