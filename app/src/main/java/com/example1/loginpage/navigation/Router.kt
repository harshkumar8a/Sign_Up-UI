package com.example1.loginpage.navigation

sealed class Router(val router : String) {

    data object SignUp : Router("sign_up")
    data object Login : Router("login")

}