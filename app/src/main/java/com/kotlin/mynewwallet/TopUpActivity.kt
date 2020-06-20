package com.kotlin.mynewwallet

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class TopUpActivity :AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_topup)
    }

    fun homeBtn(view: View){
        finish()
    }
    fun transferBtn(view: View){
        val newIntent = Intent(this, TransferActicity::class.java).apply {
            view
        }
        startActivity(newIntent)
    }
}