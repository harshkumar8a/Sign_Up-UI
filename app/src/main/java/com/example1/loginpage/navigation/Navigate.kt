package com.example1.loginpage.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example1.loginpage.Presentation.screen.Login
import com.example1.loginpage.Presentation.screen.SignUp

@Composable
fun Navigate(
    modifier: Modifier = Modifier
) {

    val navController = rememberNavController()


    NavHost(navController = navController, startDestination = Router.SignUp.router) {

        composable(route = Router.SignUp.router){
            SignUp(navController = navController)
        }

        composable(route = Router.Login.router){
            Login(navController = navController)
        }
    }

}