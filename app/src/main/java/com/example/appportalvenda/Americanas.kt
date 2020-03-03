package com.example.appportalvenda

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_americanas.*

class Americanas : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_americanas)

        webViewAM.loadUrl("https://www.americanas.com.br");
    }
}
