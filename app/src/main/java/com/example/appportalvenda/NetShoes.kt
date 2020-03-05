package com.example.appportalvenda

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_net_shoes.*
import kotlinx.android.synthetic.main.activity_sobre.*

class NetShoes : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_net_shoes)

        webViewNS.loadUrl("https://www.netshoes.com.br");
        
    }
}
