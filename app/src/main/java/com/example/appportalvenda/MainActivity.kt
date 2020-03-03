package com.example.appportalvenda

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_net_shoes.*
import kotlinx.android.synthetic.main.activity_sobre.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        picNetShoes.setOnClickListener({
            // Gravar as vezes que foi clicado
            var sh = getSharedPreferences("acessos", Context.MODE_PRIVATE);
            sh.edit().putInt("qtde", resAcesso1.text.toString().toInt()).apply();

            // Redirecionar para outra tela
            var NetShoesIntent = Intent(this, NetShoes::class.java);
            startActivity(NetShoesIntent);
        });

        picMercadoLivre.setOnClickListener({


            // Redirecionar para outra tela
            var MercadoLivreIntent = Intent(this, MercadoLivre::class.java);
            startActivity(MercadoLivreIntent);
        });

        picAmericanas.setOnClickListener({


            // Redirecionar para outra tela
            var AmericanasIntent = Intent(this, Americanas::class.java);
            startActivity(AmericanasIntent);
        })

        btnSobre.setOnClickListener({


            // Redirecionar para outra tela
            var SobreIntent = Intent(this, Sobre::class.java);
            startActivity(SobreIntent);
        })
    }
}
