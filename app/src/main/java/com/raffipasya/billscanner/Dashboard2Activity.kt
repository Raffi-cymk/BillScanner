package com.raffipasya.billscanner

import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Dashboard2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard2)

        // SESUAI XML
        val btnScan = findViewById<LinearLayout>(R.id.btnScan)
        val tvHome = findViewById<TextView>(R.id.tvHome)

        // 👉 KE LAYER 6 (SCAN PAGE)
        btnScan.setOnClickListener {
            val intent = Intent(this, ScanPageActivity::class.java)
            startActivity(intent)
        }

        // 👉 BALIK KE DASHBOARD 1
        tvHome.setOnClickListener {
            val intent = Intent(this, DashboardActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}
