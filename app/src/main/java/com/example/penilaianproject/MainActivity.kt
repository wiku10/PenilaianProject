package com.example.penilaianproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        BTN_PRS.setOnClickListener{ intent = Intent(this, DetailPenilaian::class.java)
            intent.putExtra("ID_NIM", ID_NIM.text)
            intent.putExtra("ID_NAMA", ID_NAMA.text)
            intent.putExtra("ID_NILAI", ID_NILAI.text)
            if (ID_NILAI.text.toString().toInt()>=80){
                intent.putExtra("ID_KTR","A")
            }
            else if (ID_NILAI.text.toString().toInt()>=60){
                intent.putExtra("ID_KTR","B")
            }
            else if (ID_NILAI.text.toString().toInt()>=40){
                intent.putExtra("ID_KTR","C")
            }
            else if (ID_NILAI.text.toString().toInt()>=20){
                intent.putExtra("ID_KTR","D")
            }
            else if (ID_NILAI.text.toString().toInt()>=0){
                intent.putExtra("ID_KTR","E")
            }
            startActivity(intent)
        }
    }
}
