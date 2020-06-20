package com.kotlin.mynewwallet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun transferBtn(view: View){
        val newIntent = Intent(this, TransferActicity::class.java).apply {
            view
        }
        startActivity(newIntent)
    }
    fun topUpBtn(view: View){
        val newIntent = Intent(this, TopUpActivity::class.java).apply {
            view
        }
        startActivity(newIntent)
    }
}
