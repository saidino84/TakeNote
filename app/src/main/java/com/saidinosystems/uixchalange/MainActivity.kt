package com.saidinosystems.uixchalange

import android.content.res.Configuration.UI_MODE_NIGHT_MASK
import android.net.Uri
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.rounded.Add
import androidx.compose.material3.Button
import androidx.compose.material3.FabPosition
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SmallFloatingActionButton
import androidx.compose.material3.SnackbarDuration
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import com.saidinosystems.uixchalange.db.provider.AppDataBase
import com.saidinosystems.uixchalange.ui.dashbord.CategoryList
import com.saidinosystems.uixchalange.ui.dashbord.ListNote
import com.saidinosystems.uixchalange.ui.dashbord.SearchSection
import com.saidinosystems.uixchalange.ui.dashbord.TodoUiCards
import com.saidinosystems.uixchalange.ui.dashbord.WorkFlowCardUi
import com.saidinosystems.uixchalange.ui.theme.UixChalangeTheme
import com.saidinosystems.uixchalange.ui.theme.darkBlack
import com.saidinosystems.uixchalange.ui.theme.primary
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            UixChalangeTheme {
                SetBarColor(Color.Black)
                HomeDashBoard()

        }
    }
}

@Composable
fun SetBarColor(color:Color){
    val systemUiColor=rememberSystemUiController()
    SideEffect {
        systemUiColor.setSystemBarsColor(
            color=color
        )
    }

}}
@Preview(showSystemUi =true )
@Composable
fun HomeDashBoard() {

    val snackbarHostState = remember{ SnackbarHostState() }
    val context=LocalContext.current
    val scope =rememberCoroutineScope()
    Scaffold(modifier = Modifier.background(darkBlack),
        floatingActionButtonPosition = FabPosition.Center,
        floatingActionButton = {FloatingActionButton(
            onClick = {
                ->
                var sucess=  AppDataBase().saveSomeThingTest()
                Toast.makeText(context,"Request fetching was :#$sucess", Toast.LENGTH_LONG).show()
            scope.launch{
                      snackbarHostState.showSnackbar(
                          message = "This is a toaste",
                          duration = SnackbarDuration.Long
                      )
                      }},
            containerColor = primary,
//                    contentColor = MaterialTheme.colorScheme.secondary

        ) {
            Icon(Icons.Filled.Add, contentDescription = "add")
        }}

        ){ padding ->
        Column (
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Black)
                .padding(padding)){


                SearchSection()
                CategoryList()
                WorkFlowCardUi()
//                TodoUiCards()

//                Row(horizontalArrangement = Arrangement.Center) {
//                    TodoUiCards()
//                }
            Box (modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()){

                LazyColumn {
                    TodoUiCards()
                    ListNote()


                }

            }




        }
    }

}



/**

@Composable
fun ImageGallery(images: List<Uri>) {
    LazyVerticalGrid(
        columns = GridCells.Fixed(2), // 2 columns
        verticalArrangement = Arrangement.spacedBy(0.dp), // no gaps
        contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp)
    ) {
        items(images) { uri ->
            ImageGalleryage(
                uri = uri,
                contentScale = ContentScale.Fit,
                modifier = Modifier
                    .fillMaxWidth()
                    .aspectRatio(1f) // maintain aspect ratio
                    .height(IntrinsicSize.Max) // let the image determine its height
            )
        }
    }
}
        */