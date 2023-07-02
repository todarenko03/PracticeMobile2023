package com.example.myapplication

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun GamesCategoriesList(
    gamesCategories: List<String>,
    modifier: Modifier = Modifier
){
    LazyRow(
        modifier = Modifier,
        horizontalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        items(gamesCategories) { category ->
            GamesCategory(gamesCategory = category)
        }
    }
}
