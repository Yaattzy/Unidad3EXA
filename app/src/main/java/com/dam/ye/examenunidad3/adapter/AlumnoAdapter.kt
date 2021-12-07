package com.dam.ye.examenunidad3.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.dam.ye.examenunidad3.AlumnoModel
import com.dam.ye.examenunidad3.R
import com.dam.ye.examenunidad3.databinding.ItemAlumnoBinding

class AlumnoAdapter(var dataset: List<AlumnoModel>)
    : RecyclerView.Adapter<AlumnoAdapter.ViewHolder>(){

    lateinit var mContext: Context

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        val binding = ItemAlumnoBinding.bind(view)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        mContext = parent.context

        val view = LayoutInflater.from(mContext)
            .inflate(R.layout.item_alumno, parent, false)

        return ViewHolder(view)
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val alumno: AlumnoModel = dataset[position]

        holder.binding.txtNombre.text = alumno.nombre
        holder.binding.txtMatricula.text = alumno.matricula
        holder.binding.txtCarrera.text = alumno.carrera
        holder.binding.txtPromedio.text = alumno.promedio
    }

    override fun getItemCount(): Int = dataset.size

}