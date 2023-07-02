package com.example.myapplication

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.BackgroundCategoryColor
import com.example.myapplication.ui.theme.CategoryColor

@Composable
fun GamesCategory (
    gamesCategory: String,
    modifier: Modifier = Modifier
) {
    Box(modifier = modifier
        .clip(CircleShape)
        .background(BackgroundCategoryColor)
    ) {
        Text(
            text = gamesCategory,
            fontSize = 10.sp,
            color = CategoryColor,
            modifier = Modifier.padding(vertical = 5.dp, horizontal = 10.dp)
        )
    }
}

@Composable
fun GamesCategory () {}
