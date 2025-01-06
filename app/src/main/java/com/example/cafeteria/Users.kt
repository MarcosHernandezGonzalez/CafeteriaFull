package com.example.cafeteria

object Users {
    var users: MutableList<User> = mutableListOf(
        User("Pepe", "1234"),
        User("Juan", "4321"),
        User("Marcos", "1234")
        )
    fun addUser( user: User){
        users.add(user)
        println(users)
        println(users.size)
    }
    fun userList(): MutableList<User> {
        return users
    }
}