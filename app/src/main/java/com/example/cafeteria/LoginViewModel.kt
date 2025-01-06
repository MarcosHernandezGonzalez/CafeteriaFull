package com.example.cafeteria

import com.example.cafeteria.Users

class LoginViewModel {
    fun login(user: User): Boolean {
        val loginCheck: Boolean = Users.userList().contains(user)
        if (loginCheck){
            return true
        } else {
            return false
        }
    }
}