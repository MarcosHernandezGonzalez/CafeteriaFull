package com.example.cafeteria

import android.widget.Toast
import androidx.lifecycle.ViewModel
import com.example.cafeteria.Users

class RegisterViewModel: ViewModel() {
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