package com.emonics.firstspapp

import android.content.SharedPreferences
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {

    lateinit var prefHelper: PrefHelper
//    val sharedPreferences: SharedPreferences = getSharedPreferences("MySharedPreferences", MODE_PRIVATE)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        prefHelper = PrefHelper(this)

        val textView = findViewById<TextView>(R.id.textView)
        textView.text = "${prefHelper.getString("NAME")} - ${prefHelper.getInt("ID")}"
    }
}