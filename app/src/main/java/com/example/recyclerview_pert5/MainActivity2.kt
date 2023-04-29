package com.example.recyclerview_pert5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.recyclerviewlistt.R

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        var tvTampil: TextView = findViewById(R.id.tv_tampil)
        val bundle = intent.extras
        if (bundle != null) {
            tvTampil.setText(bundle.getString("data1"))
        }


    }
}