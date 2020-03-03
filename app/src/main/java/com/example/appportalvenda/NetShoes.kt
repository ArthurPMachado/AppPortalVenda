package com.example.appportalvenda

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_net_shoes.*

class NetShoes : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_net_shoes)

        webView.loadUrl("https://www.netshoes.com.br");
    }
}
