package com.seokjoo.webviewksp

import android.os.Bundle
import android.webkit.WebView
import androidx.appcompat.app.AppCompatActivity
import com.seokjoo.ksp.webviewksp.WebViewBuilder

class MainActivity : AppCompatActivity() {
    @WebViewBuilder(
        url = "https://www.google.com",
        autoSet = true
    )
    lateinit var webView1: WebView

    @com.seokjoo.ksp.webviewksp.WebViewBuilder(
        url = "https://www.naver.com",
        autoSet = false
    )
    lateinit var webView2: WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
