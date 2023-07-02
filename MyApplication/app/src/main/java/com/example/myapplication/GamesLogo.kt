package com.example.myapplication

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.myapplication.ui.theme.Border

@Composable
fun GamesLogo(
    gameLogoId: Int,
    modifier: Modifier = Modifier
) {
    val borderWidth = 2.dp
    Image (
        painter = painterResource(id = gameLogoId),
        contentDescription = null,
        contentScale = ContentScale.Crop,
        modifier = modifier
            .size(126.dp)
//            .border(
//                BorderStroke(borderWidth, Border),
//                RoundedCornerShape(3.dp)
//            )
//            .padding(borderWidth)
//            .clip(RoundedCornerShape(4.dp))
    )
}
