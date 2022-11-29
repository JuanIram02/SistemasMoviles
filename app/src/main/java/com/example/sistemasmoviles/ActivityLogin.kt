package com.example.sistemasmoviles

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.content.Intent


class ActivityLogin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)


    }

    fun onClickAbReg(view: View) { //cambiar a pantalla de registro
        val change = Intent(this,ActivityRegister::class.java)
        startActivity(change)
    }
}