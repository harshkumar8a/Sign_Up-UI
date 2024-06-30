package com.example1.loginpage.Presentation.viewmodal

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.example1.loginpage.Presentation.event.UIEvent
import com.example1.loginpage.Presentation.state.UIState
import kotlinx.coroutines.flow.MutableStateFlow

class SignUpViewModel :ViewModel() {

    val state = mutableStateOf(UIState())

    fun onEvent(event : UIEvent){
        when(event){
            is UIEvent.EmailChanged -> {
                state.value = state.value.copy(
                    emailName = event.email
                )
            }
            is UIEvent.FirstNameChanged -> {
                state.value = state.value.copy(
                    firstName = event.firstName
                )
            }
            is UIEvent.LastNameChanged -> {
                state.value = state.value.copy(
                    lastName = event.lastName
                )
            }
            is UIEvent.PasswordChanged -> {
                state.value = state.value.copy(
                    password = event.password
                )
            }
            is UIEvent.PhoneNumberChanged -> {
                state.value = state.value.copy(
                    phoneNumber = event.phoneNumber
                )

            }

            UIEvent.Button -> {

            }
        }
    }

}