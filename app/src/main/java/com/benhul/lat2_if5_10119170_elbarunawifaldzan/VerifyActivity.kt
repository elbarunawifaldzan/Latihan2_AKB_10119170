package com.benhul.lat2_if5_10119170_elbarunawifaldzan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class VerifyActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var btnverify : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_verify)

        btnverify = findViewById(R.id.button4)

        btnverify.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.button4 ->{
                val intenBiasa4 = Intent(this@VerifyActivity, HomeActivity::class.java)
                startActivity(intenBiasa4)
            }
        }
    }
}