package com.dam.ye.examenunidad3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.dam.ye.examenunidad3.adapter.AlumnoAdapter
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

        binding.rvAlumnos.layoutManager = LinearLayoutManager(this)
        binding.rvAlumnos.setHasFixedSize(true)
        binding.rvAlumnos.adapter = AlumnoAdapter(listOf<AlumnoModel>())
    }
}