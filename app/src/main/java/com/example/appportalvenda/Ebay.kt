package com.example.appportalvenda

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_ebay.*

class Ebay : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ebay)

        webViewEb.webViewClient = WebViewClient();
        webViewEb.settings.javaScriptEnabled = true;
        webViewEb.settings.displayZoomControls = true;

        webViewEb.loadUrl("https://www.ebay.com");
    }
}
