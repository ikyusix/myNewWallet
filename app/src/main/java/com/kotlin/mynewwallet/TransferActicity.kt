package com.kotlin.mynewwallet

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class TransferActicity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_transfer)
    }

    fun homeBtn(view: View){
        finish()
    }
    fun topUpBtn(view: View){
        val newIntent = Intent(this, TopUpActivity::class.java).apply {
            view
        }
        startActivity(newIntent)
    }
}