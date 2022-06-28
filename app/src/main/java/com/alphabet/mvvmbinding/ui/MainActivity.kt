package com.alphabet.mvvmbinding.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.alphabet.mvvmbinding.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        supportFragmentManager.beginTransaction().replace(R.id.fl_container, BindingFragment()).commit()
    }
}