package com.example.myapplication

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import com.example.myapplication.ui.theme.TextColor

@Composable
fun GameRating(
    rating: String,
    reviews: String
) {
    Row {
        Text(text = rating, fontSize = 48.sp, color = Color.White)
        Spacer(modifier = Modifier.width(14.dp))
        Column(Modifier.padding(top = 15.dp)) {
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
                Image(painter = painterResource(R.drawable.half_star),
                    contentDescription = null,
                    Modifier.size(12.dp)
                )
            }
            Spacer(modifier = Modifier.height(9.dp))
            Text(text = reviews, fontSize = 12.sp, color = TextColor)
        }

    }
}