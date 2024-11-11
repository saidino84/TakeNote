package com.saidinosystems.uixchalange.ui.dashbord

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.BlurCircular
import androidx.compose.material.icons.filled.Cancel
import androidx.compose.material.icons.filled.Circle
import androidx.compose.material.icons.filled.Done
import androidx.compose.material.icons.outlined.Circle
import androidx.compose.material.icons.outlined.Done
import androidx.compose.material.icons.rounded.Done
import androidx.compose.material.icons.rounded.MoreHoriz
import androidx.compose.material.icons.rounded.RemoveRedEye
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.saidinosystems.uixchalange.ui.theme.GrayLight
import com.saidinosystems.uixchalange.ui.theme.darkBlack
import com.saidinosystems.uixchalange.ui.theme.onPrimary
import com.saidinosystems.uixchalange.ui.theme.secondary
import  androidx.compose.runtime.getValue
import  androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.style.TextDecoration
import androidx.lifecycle.ViewModel
import com.saidinosystems.uixchalange.ui.theme.GrayMedium
import com.saidinosystems.uixchalange.ui.theme.onSurface
import com.saidinosystems.uixchalange.ui.theme.primary
import kotlinx.coroutines.runBlocking
import org.intellij.lang.annotations.JdkConstants




class NoteItemModel : ViewModel(){



}

@Composable
fun NoteState( title: String,isDone: Boolean){
    var isFinalized by remember { mutableStateOf(isDone) }
    var title: String=title


    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(4.dp)
            .clip(RoundedCornerShape(16.dp))
            .height(32.dp)
            .background(Color(0xFF262626))
            .padding(4.dp).clickable(onClick={
                isFinalized=!isFinalized
            })
        , contentAlignment = Alignment.Center
    ) {
        Row (modifier = Modifier.fillMaxWidth().padding(start = 2.dp,end=8.dp), horizontalArrangement =Arrangement.Start, verticalAlignment = Alignment.CenterVertically){
            Box(
                modifier = Modifier.clip(shape = CircleShape).background(color = if(isFinalized) primary else onSurface)



            ){
                Icon( if (isFinalized) Icons.Filled.Done  else Icons.Filled.Circle,
                    tint = if ( isFinalized) Color.White else GrayMedium, contentDescription = "Add")
            }


        Spacer(modifier = Modifier.width(16.dp))

            Text("$title", fontSize = 12.sp, style = TextStyle(color=if (isFinalized) primary else onPrimary), textDecoration = if(isFinalized) TextDecoration.LineThrough else TextDecoration.None)
        }

    }


}

@Preview
@Composable
fun TodoUiCards(){
//    Spacer(Modifier.height(10.dp))
    Row (modifier = Modifier
        .fillMaxWidth()
        .padding(8.dp)){
         Box(modifier = Modifier
             .height(230.dp)
             .weight(1f)
             .clip(RoundedCornerShape(18.dp))
             .background(darkBlack)){
             Column(verticalArrangement = Arrangement.Bottom,modifier=Modifier.padding(5.dp), horizontalAlignment = Alignment.CenterHorizontally) {
                 Row (modifier = Modifier
                     .fillMaxWidth()
                     .padding(start = 16.dp, end = 8.dp, top = 16.dp), horizontalArrangement = Arrangement.SpaceBetween,
                     ){
                     Text("To-Do List", )
                     Icon(Icons.Rounded.MoreHoriz, contentDescription = "MoreHoriz")

                 }
                    NoteState(title = "Finalizado", isDone = true)
                    NoteState(title = "Pendente", isDone = false)
                    NoteState(title = "Cancelado", isDone = false)


                    Box(Modifier.fillMaxWidth().padding(start=8.dp), contentAlignment = Alignment.CenterStart){
                        Row(horizontalArrangement = Arrangement.SpaceBetween, modifier = Modifier.fillMaxSize(), verticalAlignment = Alignment.CenterVertically) {
                            Text("FR, 10 Oct 23",fontSize = 12.sp, color = onPrimary)
                            Icon(Icons.Rounded.RemoveRedEye, contentDescription = "View")
                        }
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