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
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.Divider
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.example1.loginpage.Presentation.event.UIEvent
import com.example1.loginpage.Presentation.viewmodal.SignUpViewModel
import com.example1.loginpage.navigation.Router

@Composable
fun SignUp(
    modifier: Modifier = Modifier,
    navController: NavController,
    signUpViewModel: SignUpViewModel = viewModel()

) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(30.dp),
        horizontalAlignment = Alignment.CenterHorizontally

    ) {

        Spacer(modifier = Modifier.height(100.dp))


        Text(
            text = "Sign Up",
            fontSize = 40.sp,
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(50.dp))

        TextFieldComponent(
            labelName = "First Name",
            image = Icons.Default.Person,
            onTextSelected = {
                signUpViewModel.onEvent(UIEvent.FirstNameChanged(it))
            }
        )
        Spacer(modifier = Modifier.height(20.dp))

        TextFieldComponent(
            labelName = "Last Name",
            image = Icons.Default.Person,
            onTextSelected = {
                signUpViewModel.onEvent(UIEvent.LastNameChanged(it))
            }
        )
        Spacer(modifier = Modifier.height(20.dp))

        TextFieldComponent(
            labelName = "Email",
            image = Icons.Default.Email,
            onTextSelected = {
                signUpViewModel.onEvent(UIEvent.EmailChanged(it))
            }
        )
        Spacer(modifier = Modifier.height(20.dp))

        TextFieldComponent(
            labelName = "Password",
            image = Icons.Default.Lock,
            onTextSelected = {
                signUpViewModel.onEvent(UIEvent.PasswordChanged(it))
            }
        )
        Spacer(modifier = Modifier.height(20.dp))

        TextFieldComponent(
            labelName = "Phone Number",
            image = Icons.Default.Phone,
            onTextSelected = {
                signUpViewModel.onEvent(UIEvent.PhoneNumberChanged(it))
            }
        )

        Spacer(modifier = Modifier.height(50.dp))

        ButtonCreate(buttonName = "Sign Up")

        Spacer(modifier = Modifier.height(20.dp))


        HorizontalDivider(thickness = 2.dp, color = Color.LightGray)

        Row (
            modifier = Modifier
                .padding(8.dp)
        ){

            Text(text = "Login an Account    ")
            Text(
                text = "Login",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Gray,
                modifier = Modifier
                    .clickable {
                        navController.navigate(Router.Login.router)
                    }
            )

        }




    }

}