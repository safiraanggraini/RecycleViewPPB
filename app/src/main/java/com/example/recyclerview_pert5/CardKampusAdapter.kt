package com.example.recyclerview_pert5

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.recyclerviewlistt.R

class CardKampusAdapter(private val listKampus: ArrayList<Kampus>) : RecyclerView.Adapter<CardKampusAdapter.CardViewHolder>() {
    inner class CardViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var tvNama: TextView = itemView.findViewById(R.id.tv_nama)
        var tvKota: TextView = itemView.findViewById(R.id.tv_kota)
        var ivLogo: ImageView = itemView.findViewById(R.id.civ_kampus)
        var btnPindah: Button = itemView.findViewById(R.id.btn_send)
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): CardViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_kampus_card, parent, false)
        return CardViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listKampus.size
    }

    override fun onBindViewHolder(holder: CardKampusAdapter.CardViewHolder, position: Int) {
        val kampus = listKampus[position]

        Glide.with(holder.itemView.context)
            .load(kampus.logo)
            .apply(RequestOptions().override(60, 60))
            .into(holder.ivLogo)
        holder.tvNama.text = kampus.nama
        holder.tvKota.text = kampus.kota
        holder.btnPindah.setOnClickListener {
            val intent = Intent(holder.itemView.context, MainActivity2::class.java)
            val bundle = Bundle()
            bundle.putString("data1", kampus.nama)
            intent.putExtras(bundle)
            holder.itemView.context.startActivity(intent)
        }
    }
}

