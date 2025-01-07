package com.example.cafeteria

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MenjarAdapter(private val platosList: List<Plato>, private val onItemClick: (plato: Plato) -> Unit) : RecyclerView.Adapter<MenjarAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.plato, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return platosList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val plato = platosList[position]
        holder.platoNombre.text = plato.nombre
        holder.platoPrecio.text = plato.precio.toString() + "€"
        holder.itemView.setOnClickListener {
            onItemClick(plato)
        }
    }
    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        val platoNombre: TextView = itemView.findViewById(R.id.nombre)
        val platoPrecio: TextView = itemView.findViewById(R.id.precio)
    }
}
