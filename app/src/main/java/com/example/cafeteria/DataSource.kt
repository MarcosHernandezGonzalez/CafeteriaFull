package com.example.cafeteria

object DataSource {
    val platos = listOf(
        Plato("Pan", 10.0),
        Plato("Entrecot", 20.0),
        Plato("Pollo", 150.0)
        )
    val bebidas = listOf(
        Plato("Agua", 142.0),
        Plato("Cerveza", 3.0),
        Plato("Vino", 32.0)
        )
    val postres = listOf(
        Plato("Tiramisu", 56.0),
        Plato("Flan", 23.0),
        Plato("Helado", 3.0)
        )
    fun platosList(): List<Plato> {
        return platos
    }
    fun bebidasList(): List<Plato> {
        return bebidas
    }
    fun postresList(): List<Plato> {
        return postres
    }
}