package com.raffipasya.billscanner

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class BillAdapter(private val list: List<Bill>) :
    RecyclerView.Adapter<BillAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val tvName: TextView = view.findViewById(R.id.tvItemName)
        val tvAmount: TextView = view.findViewById(R.id.tvItemAmount)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_bill, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val bill = list[position]

        holder.tvName.text = bill.nama
        holder.tvAmount.text = bill.jumlah

        // 👉 KLIK ITEM → BUKA DETAIL
        holder.itemView.setOnClickListener {
            val context = holder.itemView.context
            val intent = Intent(context, BillPageActivity::class.java)
            intent.putExtra("nama", bill.nama)
            intent.putExtra("jumlah", bill.jumlah)
            context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int = list.size
}