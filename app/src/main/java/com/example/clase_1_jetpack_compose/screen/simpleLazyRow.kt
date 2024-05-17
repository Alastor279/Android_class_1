package com.example.clase_1_jetpack_compose.screen

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun simpleLazyRow() {
    val items = listOf("item1", "item2", "item3", "item4")

    LazyRow(modifier = Modifier.fillMaxWidth()) {
        items(items){item -> Text(text = item, modifier = Modifier.padding(16.dp))}

    }
}

@Preview
@Composable
private fun Result() {
    simpleLazyRow()
}