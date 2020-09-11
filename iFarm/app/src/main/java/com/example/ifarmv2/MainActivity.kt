package com.example.ifarmv2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mudarParaActivityHome()
    }

    private fun mudarParaActivityHome() {
        val intent = Intent(this, HomeActivity::class.java)

        Handler().postDelayed({
            intent.change()
        }, 3000)
    }

    fun Intent.change() {
        startActivity(this)
        finish()
    }
}