package com.example.cafeteria

import android.widget.Toast
import com.example.cafeteria.Users

class RegisterViewModel {
    fun registerUser(user: User): Boolean {
        val users = Users.userList()
        if (users.contains(user)){
            return false
        } else {
            Users.addUser(user)
            return true
        }
    }
}