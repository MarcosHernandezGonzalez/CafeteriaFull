package com.example.cafeteria

import androidx.lifecycle.ViewModel

class PostresViewModel: ViewModel() {
    fun getPostres(): List<Plato> {
        return DataSource.postresList()
    }
}