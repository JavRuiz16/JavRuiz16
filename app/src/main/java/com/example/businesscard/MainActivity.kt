package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinessCardTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    BusinessCardText("Javier Ruiz", "Android Developer Student")
                }
            }
        }
    }
}
@Composable
fun BusinessCardTextCentered(message: String, from: String, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize() // Fill the entire screen
            .padding(16.dp), // Add some padding
        verticalArrangement = Arrangement.Center, // Center vertically
        horizontalAlignment = Alignment.CenterHorizontally // Center horizontally
    ) {
        BusinessCardText(message, from)
    }
}

@Composable
fun BusinessCardText(message: String, from: String) {
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.padding(8.dp)
    ) {
        Text(
            text = message,
            fontSize = 30.sp,
            lineHeight = 30.sp,
            textAlign = TextAlign.Center
        )
        Text(
            text = from,
            fontSize = 15.sp,
            textAlign = TextAlign.Center,
        )
    }
}


@Composable
fun BusinessCard() {
    Column(
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth()
            .background(color = Color.DarkGray)
        ,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        val image = painterResource(id = R.drawable.homework1image)
        Image(painter = image, contentDescription = null, modifier = Modifier
            .height(120.dp)
            .width(150.dp))
    }
    Column(
        modifier = Modifier

            .fillMaxWidth()
            .padding(top = 50.dp)
            .padding(bottom = 70.dp)

        ,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center

    ){
        Row(
            modifier = Modifier

                .fillMaxWidth().padding(start = 40.dp),

            ){
            val icon = painterResource(id = R.drawable.null)
            Icon(painter = icon, contentDescription = null, modifier = Modifier.padding(start = 60.dp), Color(0xFF3ddc84)
            )
            Text(text = stringResource(R.string.phone_number), modifier = Modifier.padding(start = 25.dp),color = Color.White)

        }
        Row(
            modifier = Modifier

                .fillMaxWidth().padding(start = 40.dp),
        ){
            val icon2 = painterResource(id = R.drawable.null)
            Icon(painter = icon2, contentDescription = null,  modifier = Modifier.padding(start = 60.dp),Color(0xFF3ddc84))
            Text(text = stringResource(R.string.email_text), modifier = Modifier.padding(start = 25.dp),color = Color.White)
        }
        Row(
            modifier = Modifier

                .fillMaxWidth().padding(start = 40.dp),
        ){
            val icon3 = painterResource(id = R.drawable.null)
            Icon(painter = icon3, contentDescription = null, modifier = Modifier.padding(start = 60.dp),Color(0xFF3ddc84) )
            Text(text = stringResource(R.string.share_text), modifier = Modifier.padding(start = 25.dp),color = Color.White)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun BusinessCardPreview() {
    BusinessCardTheme {
        Surface{
            BusinessCard()
        }

    }
}