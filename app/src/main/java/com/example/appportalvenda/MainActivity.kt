package com.example.appportalvenda

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_net_shoes.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        picNetShoes.setOnClickListener({
            var NetShoesIntent = Intent(this, NetShoes::class.java);
            startActivity(NetShoesIntent);
        });

        picMercadoLivre.setOnClickListener({
            var MercadoLivreIntent = Intent(this, MercadoLivre::class.java);
            startActivity(MercadoLivreIntent);
        });

        picAmericanas.setOnClickListener({
            var AmericanasIntent = Intent(this, Americanas::class.java);
            startActivity(AmericanasIntent);
        })
    }
}
