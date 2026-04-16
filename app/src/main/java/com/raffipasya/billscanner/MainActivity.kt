package com.raffipasya.billscanner

import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bottomAction = findViewById<LinearLayout>(R.id.bottomAction)

        bottomAction.setOnClickListener {
            startActivity(Intent(this, Splash2Activity::class.java))
            finish()
        }
    }
}
