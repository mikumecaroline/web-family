package com.example.simple_webview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class Familyweb : AppCompatActivity() {
    private lateinit var myFamily:WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_familyweb)
        myFamily = findViewById(R.id.my_familyz)
        val webSettings = myFamily.settings
        webSettings.javaScriptEnabled=true
        myFamily.loadUrl("https://google.com")
    }

    }
