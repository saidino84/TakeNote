package com.saidinosystems.uixchalange.ui.dashbord

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview
@Composable
fun SearchSection (){
    Row(modifier = Modifier.fillMaxWidth().padding(16.0.dp), horizontalArrangement = Arrangement.SpaceBetween) {
        Text("TakeNotes", fontWeight = FontWeight.ExtraLight, fontSize = 32.sp)
        Icon(Icons.Default.Search, contentDescription = "Add", Modifier.size(38.dp))
    }
}