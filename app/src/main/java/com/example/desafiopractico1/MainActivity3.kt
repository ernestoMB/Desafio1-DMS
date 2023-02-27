package com.example.desafiopractico1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        var empleado:Empleado = Empleado()


        var nombreEmpleado = findViewById<EditText>(R.id.txtNombreEmpleado)
        var salarioBase = findViewById<EditText>(R.id.txtSalario)
        var btnCalcularSalario = findViewById<Button>(R.id.btnCalcularSalario)

        var salarioNeto = findViewById<TextView>(R.id.txtvSalarioNeto)



        btnCalcularSalario.setOnClickListener{

            if(nombreEmpleado.text.toString()=="" || salarioBase.text.toString()=="" || salarioBase.text.toString().toDouble()<0)
            {
                Toast.makeText(this,"Campos Invalidos", Toast.LENGTH_LONG).show()
            }
            else{

                empleado.CalcularSalario(nombreEmpleado.text.toString(), salarioBase.text.toString().toDouble())

                salarioNeto.text= empleado.nombreEmpleado+" Tu salario neto es: $"+empleado.salarioNeto.toString()
            }


        }


    }
}



class Empleado{

    var nombreEmpleado:String=""
    var salarioEmpleado:Double=0.0
    var salarioNeto:Double=0.0

    fun CalcularSalario(nombre:String, salarioBase:Double){
        var afp= salarioBase*0.04
        var isss=salarioBase*0.03
        var renta = salarioBase*0.05

        nombreEmpleado=nombre
        salarioEmpleado=salarioBase

        salarioNeto = salarioEmpleado - (afp+isss+renta)


    }



}