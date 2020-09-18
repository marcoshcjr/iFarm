package com.example.ifarmv2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener() {
            intent = Intent(this, HomeActivity::class.java)
            intent.putExtra("id", 1)
            intent.putExtra("nome", "José")
            startActivity(intent)
        }


    }
}