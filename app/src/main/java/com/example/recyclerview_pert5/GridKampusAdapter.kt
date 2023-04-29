package com.example.recyclerview_pert5

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.recyclerviewlistt.R

class GridKampusAdapter(val listKampus:ArrayList<Kampus>): RecyclerView.Adapter<GridKampusAdapter.GridViewHolder>() {
    inner class GridViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var imgLogo: ImageView = itemView.findViewById(R.id.civ_kampus_grid)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GridViewHolder {
        val view:View = LayoutInflater.from(parent.context).inflate(R.layout.item_kampus_grid, parent, false)
        return GridViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listKampus.size
    }

    override fun onBindViewHolder(holder: GridViewHolder, position: Int) {
        Glide.with(holder.itemView.context)
            .load(listKampus[position].logo)
            .apply(RequestOptions().override(350, 550))
            .into(holder.imgLogo)
    }
}
