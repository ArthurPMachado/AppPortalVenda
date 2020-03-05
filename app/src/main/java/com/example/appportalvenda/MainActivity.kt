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
        });

        picWebMotors.setOnClickListener {


            // Redirecionar para outra tela
            var WebMotorsIntent = Intent(this, WebMotors::class.java);
            startActivity(WebMotorsIntent);
        }

        picBuscape.setOnClickListener {


            // Redirecionar para outra tela
            var BuscapeIntent = Intent(this, Buscape::class.java);
            startActivity(BuscapeIntent);
        }

        picEbay.setOnClickListener{


            // Redirecionar para outra tela
            var EbayIntent = Intent(this, Ebay::class.java);
            startActivity(EbayIntent);
        }

        picMagalu.setOnClickListener {


            // Redirecionar para outra tela
            var MagaluIntent = Intent(this, Magalu::class.java);
            startActivity(MagaluIntent);
        }

        picSubmarino.setOnClickListener {


            // Redirecionar para outra tela
            var SubmarinoIntent = Intent(this, Submarino::class.java);
            startActivity(SubmarinoIntent);
        }

        btnSobre.setOnClickListener({


            // Redirecionar para outra tela
            var SobreIntent = Intent(this, Sobre::class.java);
            startActivity(SobreIntent);
        });
    }
}
