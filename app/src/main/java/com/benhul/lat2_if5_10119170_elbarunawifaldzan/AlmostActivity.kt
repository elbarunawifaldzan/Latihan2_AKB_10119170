package com.benhul.lat2_if5_10119170_elbarunawifaldzan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class AlmostActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var btnalmost : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_almost_there)

        btnalmost = findViewById(R.id.button4)

        btnalmost.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.button4 ->{
                val intenBiasa3 = Intent(this@AlmostActivity, VerifyActivity::class.java)
                startActivity(intenBiasa3)
            }
        }
    }
}