package com.example.sudokuapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RelativeLayout
import android.widget.Toast
import java.lang.Exception

class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splashscreen)

        val background = object : Thread() {
            override fun run() {
                try {
                    Thread.sleep(7000)
                    val intent = Intent(baseContext, MainActivity::class.java)
                    startActivity(intent)
                } catch (e: Exception) {
                    e.printStackTrace()
                }

            }
        }
        background.start()
        val r = findViewById<RelativeLayout>(R.id.main)
        r.setOnClickListener{
            val intent = Intent(baseContext, MainActivity::class.java)
            startActivity(intent)
        }
    }
}