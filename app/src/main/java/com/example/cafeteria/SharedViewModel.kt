package com.example.cafeteria

import android.widget.Toast
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SharedViewModel: ViewModel() {
    private val _pedido: MutableLiveData<MutableList<Plato>> = MutableLiveData(mutableListOf())
    val pedido: LiveData<MutableList<Plato>> get() = _pedido

    var _total: MutableLiveData<Double> = MutableLiveData(0.0)
    val total: MutableLiveData<Double> get() = _total

    fun add(plato: Plato) {
        val listaActual = _pedido.value ?: mutableListOf()
        listaActual.add(plato)
        _pedido.value = listaActual

        val nuevoTotal = listaActual.sumOf { it.precio }
        _total.value = nuevoTotal

        println("Pedido: $listaActual")
        println("Total: $nuevoTotal")
    }
    fun getPedido(): List<Plato>? {
        return _pedido.value
    }
    fun pagar(): Boolean {
        _pedido.value = mutableListOf()
        _total.value = 0.0
        return true
    }

}