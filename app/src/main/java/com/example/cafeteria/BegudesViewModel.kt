package com.example.cafeteria

import androidx.lifecycle.ViewModel

class BegudesViewModel: ViewModel() {
    fun getBebidas(): List<Plato> {
        return DataSource.bebidasList()
    }
}