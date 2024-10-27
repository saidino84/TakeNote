package com.saidinosystems.uixchalange.ui.dashbord

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.MoreHoriz
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.saidinosystems.uixchalange.ui.theme.GrayLight
import com.saidinosystems.uixchalange.ui.theme.darkBlack
import com.saidinosystems.uixchalange.ui.theme.onPrimary
import com.saidinosystems.uixchalange.ui.theme.secondary

@Preview
@Composable
fun TodoUiCards(){
//    Spacer(Modifier.height(10.dp))
    Row (modifier = Modifier
        .fillMaxWidth()
        .padding(16.dp)){
         Box(modifier = Modifier
             .height(280.dp)
             .weight(1f)
             .clip(RoundedCornerShape(28.dp))
             .background(darkBlack)){
             Column(verticalArrangement = Arrangement.Bottom,modifier=Modifier.padding(8.dp)) {
                 Row (modifier = Modifier
                     .fillMaxWidth()
                     .padding(start = 16.dp, end = 8.dp), horizontalArrangement = Arrangement.SpaceBetween,
                     ){
                     Text("To-Do List")
                     Icon(Icons.Rounded.MoreHoriz, contentDescription = "Add")

                 }
                 Box {
                     LazyColumn(modifier = Modifier.height(180.dp)) {
                         items(10) {
                             Box(
                                 modifier = Modifier
                                     .fillMaxWidth()
                                     .padding(8.dp)
                                     .clip(RoundedCornerShape(20.dp))
                                     .height(42.dp)
                                     .background(Color(0xFF262626))
                                     .padding(4.dp)
                                 , contentAlignment = Alignment.Center
                             ) { Text("Roll Royce", fontSize = 12.sp, color = onPrimary) }
                         }
                     }
                 }
                 Box(contentAlignment = Alignment.Center,
                     ) {
                     Text("FR, 10 Oct 23",fontSize = 12.sp, color = onPrimary)
                 }
             }
         }

        Spacer(Modifier.width(10.dp))
        Box(modifier = Modifier
            .height(310.dp)
            .weight(1f)
            .clip(RoundedCornerShape(28.dp))
            .background(secondary))


    }
}

@Composable
fun TodoBoxUi(){
    Box(modifier = Modifier
        .height(280.dp)
        .clip(RoundedCornerShape(28.dp))
        .background(secondary)){
        Column {
            Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceAround) {
                Text("To-Do List")
                Text("See All")
            }
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(
                        RoundedCornerShape(28.dp)

                    )
            )
        }
    }

}