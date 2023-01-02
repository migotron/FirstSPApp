package com.emonics.firstspapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    lateinit var prefHelper: PrefHelper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        prefHelper = PrefHelper(this)

        val button = findViewById<Button>(R.id.btnNext)

        prefHelper.put("NAME", "EMONICS")
        prefHelper.put("ID" , 123)
//        val sharedPreferences: SharedPreferences = this.getSharedPreferences(sharedPreferencesFile, Context.MODE_PRIVATE)
//        val editor:SharedPreferences.Editor = sharedPreferences.edit()
//        editor.putString("ID", "ABC#@1234")
//        editor.putInt("ID", 123)
//        editor.apply()

        button.setOnClickListener {
//            val strName: String = sharedPreferences.getString("NAME", "Default").toString()
            val intent = Intent(this@MainActivity, SecondActivity::class.java)
            startActivity(intent)
        }
    }
}