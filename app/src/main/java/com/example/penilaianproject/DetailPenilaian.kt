package com.example.penilaianproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_detail_penilaian.*

class DetailPenilaian : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_penilaian)

        val bundle = intent.extras
        val nim = bundle?.get("ID_NIM")
        val nama = bundle?.get("ID_NAMA")
        val nilai = bundle?.get("ID_NILAI")
        val keterangan = bundle?.get("ID_KTR")
        tv_Nim.text=nim.toString()
        tv_Nama.text=nama.toString()
        tv_Nilai.text=nilai.toString()
        tv_Keterangan.text=keterangan.toString()
    }
}
