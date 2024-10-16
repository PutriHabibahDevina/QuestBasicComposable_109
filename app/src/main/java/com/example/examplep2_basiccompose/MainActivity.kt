package com.example.examplep2_basiccompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.examplep2_basiccompose.ui.theme.Examplep2_BasicComposeTheme
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.layout.Column
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.text.TextStyle

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Examplep2_BasicComposeTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    BasicLayout(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }

    @Composable
    fun BasicLayout(modifier: Modifier = Modifier) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier.fillMaxSize()
        ) {
            Text(
                text = "Login", style = TextStyle(
                    fontSize = 50.sp,
                    fontWeight = FontWeight.Bold
                )
            )
            Text(text = "Ini adalah halaman login")

            //Gambar 1
            Image(
                painter = painterResource(id = R.drawable.logo_umy), //R itu resource
                contentDescription = null,
                modifier = Modifier
                    .padding(top = 20.dp) //Memberikan jarak antara tulisan dengan gambar
                    .size(250.dp)
            )

            Text(text = "Nama", modifier = Modifier.padding(top = 30.dp), fontWeight = FontWeight.Bold)
            Text(text = "Putri Habibah Devina Maharani", color = Color.Red,
                fontWeight = FontWeight.Bold)
            Text(text = "20220140109", style = TextStyle(fontSize = 25.sp), fontWeight = FontWeight.Bold)

            //Gambar 2
            Image(
                painter = painterResource(id = R.drawable.foto), //R itu resource
                contentDescription = null,
                modifier = Modifier
                    .padding(top = 40.dp) //Memberikan jarak antara tulisan dengan gambar
                    .size(300.dp)
                    .clip(RoundedCornerShape(100.dp)) // Membuat sudut melengkung
            )

        }
    }


    @Preview(showBackground = true)
    @Composable
    fun GreetingPreview() {
        Examplep2_BasicComposeTheme {
            BasicLayout()
        }
    }
}