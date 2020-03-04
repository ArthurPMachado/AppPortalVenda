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

        var sh = getSharedPreferences("valores", Context.MODE_PRIVATE);
        var contador = arrayOf(0,0,0,0,0,0,0,0);

        picNetShoes.setOnClickListener({
            // Gravar as vezes que foi clicado
            contador[0] += 1;
            sh.edit().putInt("qtde", contador[0]);

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
