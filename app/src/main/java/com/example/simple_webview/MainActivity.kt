package com.example.simple_webview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btn_cop :Button
    lateinit var btn_Family:Button
    lateinit var btn_KBC:Button
    lateinit var btn_Equity:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_cop = findViewById(R.id.btn_cop)
        btn_Family = findViewById(R.id.btn_Family)
        btn_KBC = findViewById(R.id.btn_KBC)
        btn_Equity = findViewById(R.id.btn_Equity)

    }
}