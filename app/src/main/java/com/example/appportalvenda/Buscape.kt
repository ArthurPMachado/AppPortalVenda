package com.example.appportalvenda

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_buscape.*

class Buscape : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_buscape)

        webViewB.webViewClient = WebViewClient();
        webViewB.settings.javaScriptEnabled = true;
        webViewB.settings.displayZoomControls = true;

        webViewB.loadUrl("https://www.buscape.com.br");
    }
}
