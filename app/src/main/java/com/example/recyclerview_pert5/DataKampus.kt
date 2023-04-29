package com.example.recyclerview_pert5

import com.example.recyclerviewlistt.R

object DataKampus {
    private val namaKampus = arrayOf(
        "Universitas Gadjah Mada",
        "Universitas Brawijaya",
        "Universitas Indonesia",
        "Institut Teknologi Bandung",
        "Institut Teknologi Telkom Purwokerto",
        "Universitas Negeri Jakarta",
        "Universitas Padjadjaran"
    )

    private val kotaKampus = arrayOf(
        "Jogjakarta",
        "Malang",
        "DKI Jakarta",
        "Bandung",
        "Purwokerto",
        "DKI Jakarta",
        "Bandung"
    )

    private val logoKampus = intArrayOf(
        R.drawable.ugm,
        R.drawable.ub,
        R.drawable.ui,
        R.drawable.itb,
        R.drawable.ittp,
        R.drawable.unj,
        R.drawable.unpad
    )

    val listData: ArrayList<Kampus>
        get() {
            val listKampus = arrayListOf<Kampus>()
            for(position in namaKampus.indices){
                val kampus = Kampus()
                kampus.nama = namaKampus[position]
                kampus.kota = kotaKampus[position]
                kampus.logo = logoKampus[position]
                listKampus.add(kampus)
            }
            return listKampus
        }
}