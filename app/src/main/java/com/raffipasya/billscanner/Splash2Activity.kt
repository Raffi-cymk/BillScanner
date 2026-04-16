package com.raffipasya.billscanner

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity

class Splash2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_2)

        // PINDAH KE LOGIN SETELAH DELAY
        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this@Splash2Activity, LoginActivity::class.java)
            startActivity(intent)
            finish()
        }, 1000) // 1 detik
    }
}
