package com.example.clase_1_jetpack_compose.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Devices

import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.clase_1_jetpack_compose.R

@Composable
fun Practica_1 () {
    Box(modifier = Modifier.fillMaxSize()){
        Content()
    }
}
@Composable
fun Content (){
    Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.SpaceAround) {
        Filas(img = R.drawable.ic_mensaje,
            descript = "######")

        Text(
            text = "hola mundo",
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp),
            textAlign = TextAlign.Center,
            fontSize = 30.sp
        )
        Button(onClick = { /*TODO*/ }) {
            Text(text = "hola", fontSize = 25.sp)
        }
        Filas(img = R.drawable.ic_launcher_mvc,
            descript = "#####")

    }
}
@Composable
fun Filas(
    img: Int,
    descript : String,
    modifier: Modifier = Modifier.fillMaxWidth(),
    imgmodifier: Modifier = Modifier
){
    Row(modifier = modifier,
        horizontalArrangement = Arrangement.Center) {
        Image(painter = painterResource(id = img), contentDescription = descript, modifier = Modifier
            .width(300.dp)
            .height(200.dp))
    }
}



@Preview(showSystemUi = true, device = Devices.DEFAULT)
@Composable
private fun PreviewPractica_1() {
    Practica_1()
}
