package com.example1.loginpage.Presentation.screen

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TextFieldComponent(
    modifier: Modifier = Modifier,
    labelName : String,
    image : ImageVector,
    onTextSelected:(String)-> Unit
) {

    val textValue = remember {
        mutableStateOf("")
    }

    OutlinedTextField(
        modifier = Modifier
            .fillMaxWidth()
            ,

        leadingIcon = {
            Icon(
                imageVector = image,
                contentDescription = null
            )
        },
        value = textValue.value,
        label = { Text(labelName) },
        onValueChange = {
            textValue.value = it
            onTextSelected(it)
        },
        keyboardOptions = KeyboardOptions.Default,
        shape = RoundedCornerShape(8.dp)

    )
}


@Composable
fun ButtonCreate(
    modifier: Modifier = Modifier,
    buttonName : String
) {

    Button(
        modifier = Modifier
            .width(280.dp)
            .height(65.dp),
        onClick = {

        },
        elevation =  ButtonDefaults.elevatedButtonElevation(
        defaultElevation = 10.dp,
        pressedElevation = 15.dp,
        disabledElevation = 0.dp
        ),
        colors = ButtonDefaults.buttonColors(
            Color.Gray
        ),
        shape = RoundedCornerShape(10.dp)
    ) {
        Text(
            text = buttonName,
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold
        )
    }


}