package com.example.ifarmv2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_home.*
import kotlinx.android.synthetic.main.activity_main.*

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val bundle: Bundle? = intent.extras

        val id = bundle?.get("id")
        val nome = bundle?.get("nome")

        Toast.makeText(applicationContext, "ID: " + id.toString() + " NOME:" + nome,
            Toast.LENGTH_LONG).show()

        button4.setOnClickListener() {
            intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

    }
}