package com.saidinosystems.uixchalange.ui.dashbord

import android.R.attr.onClick
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ChipColors
import androidx.compose.material3.Icon
import androidx.compose.material3.InputChip
import androidx.compose.material3.InputChipDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.saidinosystems.uixchalange.ui.theme.GrayMedium
import com.saidinosystems.uixchalange.ui.theme.OrangeVibrant
import com.saidinosystems.uixchalange.ui.theme.background
import com.saidinosystems.uixchalange.ui.theme.darkBlack
import com.saidinosystems.uixchalange.ui.theme.onPrimary
import com.saidinosystems.uixchalange.ui.theme.secondary
import java.nio.file.WatchEvent

data class NoteCategory(
    val name: String,
    val qty:Int,
    var id:Int?=null

)

var categories=listOf(
    NoteCategory(name = "All Notes", qty = 20),
    NoteCategory(name = "#Work", qty = 20),
    NoteCategory(name = "#Personal", qty = 20),
    NoteCategory(name = "#Bussines", qty = 20),
    NoteCategory(name = "#Programming", qty = 20),
    NoteCategory(name = "#Life Style", qty = 20),
    NoteCategory(name = "#Family ", qty = 20),



)

@Preview
@Composable
fun CategoryList(){

    LazyRow (modifier = Modifier.fillMaxWidth().padding(16.dp)){
        items(categories.size){index ->
            CategoryItem(id= index)
        }


    }

}

@Composable
fun CategoryItem(id: Int){
    val chipInterationSource = remember { MutableInteractionSource() }
    val _category=categories.get(index = id)
    var isSelected by remember { mutableStateOf(false) }
    Row(modifier = Modifier.padding(start=10.dp)) {
       InputChip(selected = isSelected,
           onClick = { isSelected =!isSelected },
           label = { Text(text = _category.name) },
           modifier = Modifier
               .height(43.dp),
               colors = InputChipDefaults.inputChipColors(
                   selectedContainerColor = onPrimary,
                   selectedLabelColor = Color.Black,
                   containerColor = secondary,
                   disabledLabelColor = Color.White
               ), shape = RoundedCornerShape(50.dp), border = null,


trailingIcon={
    Box (modifier = Modifier.clip(CircleShape).background(Color.Gray).padding(3.dp)){
        Text("${_category.qty}")}

    }
//               .padding(start=16.dp, end = 1.dp)
       )
    }


}