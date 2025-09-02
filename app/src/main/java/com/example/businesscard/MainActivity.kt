package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BusinessCardTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    BackgroundImage()
                }
            }
        }
    }
}

@Composable
fun MainText(modifier: Modifier = Modifier) {
    Column (
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
    ) {
        Text(
            text = "</>",
            textAlign = TextAlign.Center,
            color = colorResource(R.color.cadmiumOrange),
            fontSize = 150.sp
        )
        Text(
            text = "Alejandro Jiménez Zabala",
            textAlign = TextAlign.Center,
            color = colorResource(R.color.androidGreen),
            fontSize = 25.sp
        )
        Text(
            text = "Programmer",
            textAlign = TextAlign.Center,
            color = colorResource(R.color.androidGreen),
            fontSize = 15.sp
        )
    }
}

@Composable
fun ContactText(modifier: Modifier = Modifier) {
    Column (
        verticalArrangement = Arrangement.Bottom,
        modifier = modifier
            .padding(
                start = 50.dp,
                bottom = 30.dp
            )
    ) {
        Text(
            text = "(+57) 315 722 5866",
            textAlign = TextAlign.Left,
            color = colorResource(R.color.androidGreen),
            fontSize = 18.sp,
            lineHeight = 25.sp
        )
        Text(
            text = "github.com/alejojimenezz",
            textAlign = TextAlign.Left,
            color = colorResource(R.color.androidGreen),
            fontSize = 18.sp,
            lineHeight = 25.sp
        )
        Text(
            text = "alejandro.jz1312@gmail.com",
            textAlign = TextAlign.Left,
            color = colorResource(R.color.androidGreen),
            fontSize = 18.sp,
            lineHeight = 25.sp
        )
    }
}

@Composable
fun BackgroundImage(modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.purplebackground)
    Box(modifier) {
        Image(
            painter = image,
            contentDescription = null,
            contentScale = ContentScale.Crop
        )
        MainText(
            modifier = Modifier
                .fillMaxSize()
        )
        ContactText(
            modifier = Modifier
                .fillMaxSize()
                .padding(25.dp)
        )
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun CardPreview() {
    BusinessCardTheme {
        BackgroundImage()
    }
}