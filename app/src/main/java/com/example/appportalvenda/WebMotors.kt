package com.example.appportalvenda

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_web_motors.*

class WebMotors : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_motors)

        webViewWM.webViewClient = WebViewClient();
        webViewWM.settings.javaScriptEnabled = true;
        webViewWM.settings.displayZoomControls = true;

        webViewWM.loadUrl("https://www.webmotors.com.br");
    }
}
