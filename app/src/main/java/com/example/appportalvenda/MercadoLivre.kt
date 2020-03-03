package com.example.appportalvenda

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_mercado_livre.*

class MercadoLivre : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mercado_livre)

        webViewML.loadUrl("https://www.mercadolivre.com.br");
    }
}
