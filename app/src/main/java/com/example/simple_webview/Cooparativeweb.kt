package com.example.simple_webview

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class Cooparativeweb : AppCompatActivity() {
    private lateinit var mycop:WebView
    @SuppressLint("MissingInflatedId", "SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cooparativeweb)
        mycop = findViewById(R.id.my_copz)
        val webSettings = mycop.settings
        webSettings.javaScriptEnabled=true
        mycop.loadUrl("https://google.com")
    }
}