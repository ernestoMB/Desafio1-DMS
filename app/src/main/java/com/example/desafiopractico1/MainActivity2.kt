package com.example.desafiopractico1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        /*Instanciamos la clase*/
        var estudiante:Estudiante= Estudiante()


        /*Capturamos valores*/
        var nombre = findViewById<EditText>(R.id.txtNombreEstudiante)
        var nota1 = findViewById<EditText>(R.id.txtNota1)
        var nota2 = findViewById<EditText>(R.id.txtNota2)
        var nota3 = findViewById<EditText>(R.id.txtNota3)
        var nota4 = findViewById<EditText>(R.id.txtNota4)
        var nota5 = findViewById<EditText>(R.id.txtNota5)

        var promedio = findViewById<TextView>(R.id.txtvResultado)

        var calcularPromedio = findViewById<Button>(R.id.btnCalcularPromedio)





        calcularPromedio.setOnClickListener{
            if(nombre.text.toString()=="" || nota1.text.toString()=="" || nota2.text.toString()=="" || nota3.text.toString()=="" || nota4.text.toString()=="" || nota5.text.toString()==""){
                Toast.makeText(this,"Campos vacios",Toast.LENGTH_LONG).show()
            }
            else if(nota1.text.toString().toDouble()<0 || nota1.text.toString().toDouble()>10 ||
                nota2.text.toString().toDouble()<0 || nota2.text.toString().toDouble()>10 ||
                nota3.text.toString().toDouble()<0 ||nota3.text.toString().toDouble()>10 ||
                nota4.text.toString().toDouble()<0 || nota4.text.toString().toDouble()>10 ||
                nota5.text.toString().toDouble()<0 || nota5.text.toString().toDouble()>10)
            {
                Toast.makeText(this,"Valores Invalidos",Toast.LENGTH_LONG).show()
            }
            else{

                estudiante.CalcularPromedio(nombre.text.toString(), nota1.text.toString().toDouble(),nota2.text.toString().toDouble(),nota3.text.toString().toDouble(),nota4.text.toString().toDouble(),nota5.text.toString().toDouble())

                if(estudiante.PROMEDIO>=5.96){
                    promedio.text = "Felicidades "+estudiante.Nombre+", Aprobaste con: "+estudiante.PROMEDIO.toString()
                }
                else {
                    promedio.text = "Lo sentimos "+estudiante.Nombre+" , Reprobaste con: " + estudiante.PROMEDIO.toString()
                }

            }



        }

    }
}


class Estudiante{

    var Nombre:String=""
    var Nota1:Double=0.0
    var Nota2:Double=0.0
    var Nota3:Double=0.0
    var Nota4:Double=0.0
    var Nota5:Double=0.0
    var PROMEDIO:Double=0.0


    fun CalcularPromedio(nombre:String,nota1:Double,nota2:Double,nota3:Double,nota4:Double,nota5:Double){
        Nota1=nota1
        Nota2=nota2
        Nota3=nota3
        Nota4=nota4
        Nota5=nota5

        var promedio = (Nota1+Nota2+Nota3+Nota4+Nota5)/5

        PROMEDIO=promedio
        Nombre = nombre

    }


}