package com.dam.ye.examenunidad3.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.dam.ye.examenunidad3.CarModel
import com.dam.ye.examenunidad3.R
import com.dam.ye.examenunidad3.databinding.ItemCarBinding

class CarAdapter(var dataset: List<CarModel>) : RecyclerView.Adapter<CarAdapter.ViewHolder>() {

    lateinit var mContext: Context

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        val binding = ItemCarBinding.bind(view)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        mContext = parent.context

        val view = LayoutInflater.from(mContext)
            .inflate(R.layout.item_car, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val car: CarModel = dataset[position]

        holder.binding.txtModel.text = car.modelo
        holder.binding.txtBrand.text = car.marca
        holder.binding.txtYear.text = car.anio
    }

    override fun getItemCount(): Int = dataset.size
}