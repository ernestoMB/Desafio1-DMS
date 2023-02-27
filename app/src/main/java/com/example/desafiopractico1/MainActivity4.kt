package com.example.desafiopractico1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        var calculadora:Calculadora=Calculadora()


        var numero1 = findViewById<EditText>(R.id.txtnumero1)
        var numero2 = findViewById<EditText>(R.id.txtnumero2)
        var btnSumar = findViewById<Button>(R.id.btnSumar)
        var btnRestar = findViewById<Button>(R.id.btnRestar)
        var btnMultiplicar = findViewById<Button>(R.id.btnMultiplicar)
        var btnDividir = findViewById<Button>(R.id.btnDividir)
        var resultadoOperacion = findViewById<TextView>(R.id.txtvResultadoOperacion)




        btnSumar.setOnClickListener{
            if(numero1.text.toString()==""|| numero2.text.toString()==""){
                Toast.makeText(this, "Campos vacios", Toast.LENGTH_SHORT).show()
            }
            else{
                calculadora.Sumar(numero1.text.toString().toFloat(),numero2.text.toString().toFloat())
                resultadoOperacion.text = "Resultado: "+calculadora.resultado.toString()
            }
        }

        btnRestar.setOnClickListener {
            if(numero1.text.toString()==""|| numero2.text.toString()==""){
                Toast.makeText(this, "Campos vacios", Toast.LENGTH_SHORT).show()
            }
            else{
                calculadora.Restar(numero1.text.toString().toFloat(),numero2.text.toString().toFloat())
                resultadoOperacion.text = "Resultado: "+calculadora.resultado.toString()
            }
        }

        btnMultiplicar.setOnClickListener {
            if(numero1.text.toString()==""|| numero2.text.toString()==""){
                Toast.makeText(this, "Campos vacios", Toast.LENGTH_SHORT).show()
            }
            else{
                calculadora.Multiplicar(numero1.text.toString().toFloat(),numero2.text.toString().toFloat())
                resultadoOperacion.text = "Resultado: "+calculadora.resultado.toString()
            }
        }

        btnDividir.setOnClickListener {
            if(numero1.text.toString()==""|| numero2.text.toString()=="" || numero2.text.toString().toFloat()==0F){
                Toast.makeText(this, "Campos vacios o invalidos", Toast.LENGTH_SHORT).show()
            }
            else{
                calculadora.Dividir(numero1.text.toString().toFloat(),numero2.text.toString().toFloat())
                resultadoOperacion.text = "Resultado: "+calculadora.resultado.toString()
            }
        }


    }


}




class Calculadora{

    var Numero1:Float= 0.0f
    var Numero2:Float = 0.0f
    var resultado:Float=0.0f


    fun Sumar(numero1:Float, numero2:Float){
        Numero1=numero1
        Numero2=numero2

        var operacion = numero1+numero2
        resultado=operacion

    }
    fun Restar(numero1:Float, numero2:Float){
        Numero1=numero1
        Numero2=numero2

        var operacion = numero1-numero2
        resultado=operacion

    }
    fun Multiplicar(numero1:Float, numero2:Float){
        Numero1=numero1
        Numero2=numero2

        var operacion = numero1*numero2
        resultado=operacion

    }
    fun Dividir(numero1:Float, numero2:Float){
        Numero1=numero1
        Numero2=numero2

        var operacion = numero1/numero2
        resultado=operacion

    }



}