package com.example.appportalvenda

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_submarino.*

class Submarino : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_submarino)

        webViewS.webViewClient = WebViewClient();
        webViewS.settings.javaScriptEnabled = true;
        webViewS.settings.displayZoomControls = true;

        webViewS.loadUrl("https://www.submarino.com.br");
    }
}
