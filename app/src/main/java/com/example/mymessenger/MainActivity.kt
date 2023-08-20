package com.example.mymessenger

import android.content.ActivityNotFoundException
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)

		val sendButton: Button = findViewById(R.id.send)
		val sendWithButton: Button = findViewById(R.id.send_with)
		sendButton.setOnClickListener { onSendMessage() }
		sendWithButton.setOnClickListener { onSendWithMessage() }
	}

	private fun onSendMessage() {
		val message: TextView = findViewById(R.id.message)
		val myIntent = Intent(this, MainActivity2::class.java)

		myIntent.putExtra("message", message.text.toString())
		startActivity(myIntent)
	}

	private fun onSendWithMessage() {
		val message: TextView = findViewById(R.id.message)
		val myIntent = Intent(Intent.ACTION_SEND)

		intent.type = "text/plain"
		myIntent.putExtra(Intent.EXTRA_TEXT, message.text.toString())
		try {
			startActivity(myIntent)
		} catch (e: ActivityNotFoundException) {
			Toast.makeText(this, "You don't have an app to start!", Toast.LENGTH_SHORT).show()
		}
	}
}
