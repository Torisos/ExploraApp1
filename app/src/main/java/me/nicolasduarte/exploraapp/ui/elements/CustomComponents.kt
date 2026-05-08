package me.nicolasduarte.exploraapp.ui.elements

import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.layout.fillMaxWidth

@Composable
fun CustomLabel(text: String) {
    Text(
        text = text,
        fontSize = 13.sp,
        fontWeight = FontWeight.SemiBold,
        color = Color.Gray
    )
}

@Composable
fun CustomTextField(
    placeholder: String,
    minLines: Int = 1
) {
    var value by remember { mutableStateOf("") }
    OutlinedTextField(
        value = value,
        onValueChange = { value = it },
        placeholder = { Text(placeholder) },
        minLines = minLines,
        modifier = Modifier.fillMaxWidth()
    )
}