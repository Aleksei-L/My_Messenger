package com.example.mymessenger

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main2)

		val myIntent = intent
		val myMessage = myIntent.getStringExtra("message")
		val text: TextView = findViewById(R.id.message)

		text.text = myMessage
	}
}
