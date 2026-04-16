package com.raffipasya.billscanner

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class BillPageActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bill_detail)

        val nama = intent.getStringExtra("nama")
        val jumlah = intent.getStringExtra("jumlah")

        val tvName = findViewById<TextView>(R.id.tvName)
        val tvAmount = findViewById<TextView>(R.id.tvAmount)
        val btnPay = findViewById<Button>(R.id.btnPay)

        tvName.text = nama
        tvAmount.text = jumlah

        btnPay.setOnClickListener {
            val intent = Intent(this, PaymentSuccessActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}