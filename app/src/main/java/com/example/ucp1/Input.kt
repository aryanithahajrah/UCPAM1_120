package com.example.ucp1

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material3.Icon
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Preview(showBackground = true)
@Composable
fun Input (modifier: Modifier = Modifier){

    var destinasi by remember { mutableStateOf("") }
    var tujuan by remember { mutableStateOf("") }


    var dataClass = listOf("Ekonomi", "Bussiness")

    var confDestinasi by remember { mutableStateOf("") }
    var confTujuan by remember { mutableStateOf("") }

    Column (
        modifier = modifier.fillMaxSize().padding(16.dp)
    ){
        TextField(
            value = destinasi,
            onValueChange = {destinasi = it},
            label = {
                Text(text = "Destinasi")
            },
            placeholder = {
                Text(text = "Isi")
            },
            modifier = Modifier.fillMaxWidth()
        )
        Row (modifier = Modifier.fillMaxWidth()) {
            dataClass.forEach{
                selectedClass->
                Row (verticalAlignment = Alignment.CenterVertically){
                    RadioButton(
                        selected = class == selectedClass,
                        onClick = {class = selectedClass}
                    )
                    Text(text = selectedClass)}
        }
    }
        TextField(
            value = tujuan,
            onValueChange = {tujuan = it},
            label = {
                Text(text = "Tujuan")
            },
            placeholder = {
                Text(text = "Isi")
            },
        )
}

@Composable
fun TampilanSection(modifier: Modifier = Modifier){
    Column (
        modifier = Modifier.padding(14.dp)
            .fillMaxHeight()
    ){
        Text(text = "Good Afternoon,",
            style = TextStyle(color = Color.LightGray))
        Text(text = "Indra Al Fauzan",
            style = TextStyle(fontSize = 20.sp,
                fontWeight = FontWeight.Bold)
        )
        Icon(
            Icons.Filled.Notifications,
            contentDescription = null
        )
    }
}

@Composable
fun TampilData(
    param: String,
    argum: String
){
    Column (
        modifier = Modifier.padding(16.dp)
    ){
        Row (
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ){
            Text(text = param,
                modifier = Modifier.weight(0.8f))
            Text(text = ":",
                modifier = Modifier.weight(0.2f))
            Text(text = argum,
                modifier = Modifier.weight(2f))
        }
    }
}

