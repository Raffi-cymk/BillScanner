package com.raffipasya.billscanner

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.database.FirebaseDatabase

class ScanPageActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scan)

        val btnBack = findViewById<Button>(R.id.btnBack)
        val btnSave = findViewById<Button>(R.id.btnSave)
        val etAmount = findViewById<EditText>(R.id.etAmount)

        // 🔥 Firebase reference
        val database = FirebaseDatabase.getInstance("https://billscanner-8fac6-default-rtdb.asia-southeast1.firebasedatabase.app/")
        val myRef = database.getReference("bills")

        btnBack.setOnClickListener {
            startActivity(Intent(this, Dashboard2Activity::class.java))
            finish()
        }

        btnSave.setOnClickListener {

            val input = etAmount.text.toString()

            if (input.isEmpty()) {
                etAmount.error = "Isi jumlah dulu"
                return@setOnClickListener
            }

            val bill = Bill("Pengguna", "Rp $input")

            // 🔥 Simpan ke list (tetap dipakai)
            DataHolder.billList.add(bill)

            // 🔥 Simpan ke Firebase
            val billMap = mapOf(
                "nama" to bill.nama,
                "jumlah" to bill.jumlah
            )

            myRef.push().setValue(billMap)
                .addOnSuccessListener {
                    Toast.makeText(this, "Data masuk Firebase", Toast.LENGTH_SHORT).show()
                }
                .addOnFailureListener {
                    Toast.makeText(this, "Gagal kirim ke Firebase", Toast.LENGTH_SHORT).show()
                }

            // 🔥 Pindah ke halaman detail
            val intent = Intent(this, BillPageActivity::class.java)
            intent.putExtra("nama", bill.nama)
            intent.putExtra("jumlah", bill.jumlah)

            startActivity(intent)
        }
    }
}