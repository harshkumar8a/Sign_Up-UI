package com.example1.loginpage.Presentation.screen

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example1.loginpage.navigation.Router

@Composable
fun Login(
    modifier: Modifier = Modifier,
    navController: NavController

) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Spacer(modifier = Modifier.height(100.dp))


        Text(
            text = "Login ",
            fontSize = 40.sp,
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(50.dp))

        TextFieldComponent(labelName = "Email", image = Icons.Default.Email)
        Spacer(modifier = Modifier.height(20.dp))

        TextFieldComponent(labelName = "Password", image = Icons.Default.Lock)
        Spacer(modifier = Modifier.height(60.dp))

        ButtonCreate(buttonName = "Sign Up")

        Spacer(modifier = Modifier.height(40.dp))


        HorizontalDivider(thickness = 2.dp, color = Color.LightGray)
        Spacer(modifier = Modifier.height(50.dp))


        Row (
            modifier = Modifier
                .padding(8.dp)
        ){

            Text(
                text = "Create a new Account  ",
                fontSize = 16.sp,
                letterSpacing = TextUnit.Unspecified
            )
            Text(
                text = "New Account",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Gray,
                modifier = Modifier
                    .clickable {
                        navController.navigate(Router.SignUp.router)
                    }
            )

        }



    }

}