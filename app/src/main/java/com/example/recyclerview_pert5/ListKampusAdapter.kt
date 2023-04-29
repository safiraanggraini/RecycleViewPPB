package com.example.recyclerview_pert5

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.recyclerviewlistt.R

class ListKampusAdapter(private val listKampus: ArrayList<Kampus>) : RecyclerView.Adapter<ListKampusAdapter
.ListViewHolder>() {
    inner class ListViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var tvNama: TextView = itemView.findViewById(R.id.tv_nama)
        var tvKota: TextView = itemView.findViewById(R.id.tv_kota)
        var ivLogo: ImageView = itemView.findViewById(R.id.civ_kampus)
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_kampus, parent, false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listKampus.size
    }

    override fun onBindViewHolder(holder: ListKampusAdapter.ListViewHolder, position: Int) {
        val kampus = listKampus[position]

        Glide.with(holder.itemView.context)
            .load(kampus.logo)
            .apply(RequestOptions().override(60, 60))
            .into(holder.ivLogo)
        holder.tvNama.text = kampus.nama
        holder.tvKota.text = kampus.kota
    }
}

