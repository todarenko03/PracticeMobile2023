package com.example.myapplication

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.Border

@Composable
fun GameInfoUI(
    title: String,
    rating: Float,
    countOfDownloads: String,
    modifier: Modifier = Modifier
) {
    Column (modifier = modifier) {
        Text(text = title, fontSize = 20.sp, color = Color.White)
        Spacer(modifier = Modifier.height(6.dp))
        Row {
            Image(painter = painterResource(R.drawable.star),
                contentDescription = null,
                Modifier.size(12.dp)
            )
            Spacer(modifier = Modifier.width(3.dp))
            Image(painter = painterResource(R.drawable.star),
                contentDescription = null,
                Modifier.size(12.dp)
            )
            Spacer(modifier = Modifier.width(3.dp))
            Image(painter = painterResource(R.drawable.star),
                contentDescription = null,
                Modifier.size(12.dp)
            )
            Spacer(modifier = Modifier.width(3.dp))
            Image(painter = painterResource(R.drawable.star),
                contentDescription = null,
                Modifier.size(12.dp)
            )
            Spacer(modifier = Modifier.width(3.dp))
            Image(painter = painterResource(R.drawable.star),
                contentDescription = null,
                Modifier.size(12.dp)
            )
            Spacer(modifier = Modifier.width(10.dp))
            Text(text = countOfDownloads, fontSize = 12.sp, color = Border)
        }
    }
}

@Composable
private fun GameInfoUI() {
    GameInfoUI(
        title = "DoTA 2",
        countOfDownloads = "70M",
        rating = 5.0f
    )
}