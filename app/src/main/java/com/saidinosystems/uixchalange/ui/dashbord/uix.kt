package com.saidinosystems.uixchalange.ui.dashbord

import android.widget.GridView
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.rounded.CheckCircle
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun UixBuilder(){

//    val box= genNewBox(h = 120.dp)
    LazyVerticalStaggeredGrid(columns = StaggeredGridCells.Fixed(2), verticalItemSpacing = 8.dp
   , horizontalArrangement= Arrangement.spacedBy(8.dp)
    ) {
        item{genNewBox(h = 120.dp
                , index = 1)
        }
        item{genNewBox(h = 189.dp
            , index = 1)
        }
        item{genNewBox(h = 89.dp
            , index = 1)
        }
        item{genNewBox(h = 150.dp
            , index = 1)
        }

    }



}

@Composable
fun genNewBox(h:Dp,index: Int) {

    val box = Box(
        modifier = Modifier
            .height(h)
            .width(100.dp)
            .background(color = Color.Green.copy(alpha =0.6f )).clip(RoundedCornerShape(8.dp))

    ) {

        Text("Box ${index}", modifier = Modifier.align(Alignment.Center))
        Icon(Icons.Rounded.CheckCircle, contentDescription = "Verified", tint = Color.White)
    }
}