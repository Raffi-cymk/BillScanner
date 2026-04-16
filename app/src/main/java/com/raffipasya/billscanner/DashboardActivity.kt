package com.raffipasya.billscanner

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import android.widget.TextView 

class DashboardActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        // LIST
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerViewBill)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = BillAdapter(DataHolder.billList)

        val tvTotal = findViewById<TextView>(R.id.tvTotal)

        var total = 0

        for (bill in DataHolder.billList) {
            val amount = bill.jumlah.replace("Rp ", "").toInt()
            total += amount
        }

        tvTotal.text = "Total: Rp $total"

        // BUTTON SCAN
        val btnScan = findViewById<Button>(R.id.btnScan)
        btnScan.setOnClickListener {
            startActivity(Intent(this, ScanPageActivity::class.java))
        }
    }
}