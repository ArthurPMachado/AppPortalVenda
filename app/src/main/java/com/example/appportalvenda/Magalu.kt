package com.example.appportalvenda

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_magalu.*

class Magalu : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_magalu)

        webViewM.webViewClient = WebViewClient();
        webViewM.settings.javaScriptEnabled = true;
        webViewM.settings.displayZoomControls = true;

        webViewM.loadUrl("https://www.magazineluiza.com.br");
    }
}
