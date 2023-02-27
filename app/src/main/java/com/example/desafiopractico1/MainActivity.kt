package com.example.desafiopractico1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {

        val inflater = menuInflater
        inflater.inflate(R.menu.menu_muestra,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val Act1:Intent= Intent(this, MainActivity2::class.java)
        val Act2:Intent= Intent(this, MainActivity3::class.java)
        val Act3:Intent= Intent(this, MainActivity4::class.java)
        when(item.itemId){

            R.id.ejercicio1 -> startActivity(Act1)
        }
        when(item.itemId){
            R.id.ejercicio2->startActivity(Act2)
        }
        when(item.itemId){
            R.id.ejercicio3->startActivity(Act3)
        }
        return super.onOptionsItemSelected(item)
    }

}