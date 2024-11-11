package com.saidinosystems.uixchalange

import android.content.res.Configuration.UI_MODE_NIGHT_MASK
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import com.saidinosystems.uixchalange.ui.dashbord.CategoryList
import com.saidinosystems.uixchalange.ui.dashbord.SearchSection
import com.saidinosystems.uixchalange.ui.dashbord.TodoUiCards
import com.saidinosystems.uixchalange.ui.dashbord.WorkFlowCardUi
import com.saidinosystems.uixchalange.ui.theme.UixChalangeTheme
import com.saidinosystems.uixchalange.ui.theme.darkBlack

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
    Scaffold(modifier = Modifier.background(darkBlack)){ padding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Black)
                .padding(padding)){

            SearchSection()
            CategoryList()
            WorkFlowCardUi()
            TodoUiCards()
        }
    }
}