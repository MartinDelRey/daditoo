package com.example.dadito

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    lateinit var txnumero: TextView
    lateinit var imgdado: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        txnumero = findViewById(R.id.txnumero)
        imgdado = findViewById(R.id.imgdado)
    }
    fun lanzaDado(v: View){
        Log.d("DadoApp", "lanzadado: ")
        val numeroAleatorio = Random.nextInt(6) + 1;
        val imagenAponer = when(numeroAleatorio){
            1 -> {
                txnumero.setText("1")
                R.drawable.dice_1;
            }
            2 -> {
                txnumero.setText("2")
                R.drawable.dice_2;
            }
            3 -> {
                txnumero.setText("3")
                R.drawable.dice_3;
            }
            4 -> {
                txnumero.setText("4")
                R.drawable.dice_4;
            }
            5 -> {
                txnumero.setText("5")
                R.drawable.dice_5;
            }
            else -> {
                txnumero.setText("6")
                R.drawable.dice_6;}
            }
            imgdado.setImageResource(imagenAponer)
        }
    }
