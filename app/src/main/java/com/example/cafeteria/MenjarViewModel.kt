package com.example.cafeteria

import androidx.lifecycle.ViewModel

class MenjarViewModel: ViewModel() {
    fun getPlatos(): List<Plato> {
        return DataSource.platosList()
    }

}