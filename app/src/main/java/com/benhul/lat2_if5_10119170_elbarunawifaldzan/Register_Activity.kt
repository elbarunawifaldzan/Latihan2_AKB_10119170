package com.benhul.lat2_if5_10119170_elbarunawifaldzan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class Register_Activity : AppCompatActivity(), View.OnClickListener {

    private lateinit var btnregister : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        btnregister = findViewById(R.id.button3)

        btnregister.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.button3 ->{
                val intenBiasa2 = Intent(this@Register_Activity, AlmostActivity::class.java)
                startActivity(intenBiasa2)
            }
        }
    }
}