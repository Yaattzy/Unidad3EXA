package com.dam.ye.examenunidad3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.dam.ye.examenunidad3.adapter.CarAdapter
import com.dam.ye.examenunidad3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        // CONFIGURACIONES DE RECYCLER VIEW
        configRecyclerView()


        // FLOATING ACTION BUTTON CLICK LISTENER
        binding.fab.setOnClickListener {
            Toast.makeText(this, "Realizar formulario de agregar.", Toast.LENGTH_LONG).show()

            // HACER INTENT PARA IR A AGREGAR ACTIVITY
        }
    }

    private fun configRecyclerView() {

        binding.rvCars.layoutManager = GridLayoutManager(this, 2)
        binding.rvCars.setHasFixedSize(true)
        binding.rvCars.adapter = CarAdapter(listOf<CarModel>())
    }
}