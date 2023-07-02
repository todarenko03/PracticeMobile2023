package com.example.myapplication.game_screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Divider
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.CommentOfUser
import com.example.myapplication.GameInfoUI.GameInfoUI
import com.example.myapplication.GameRating
import com.example.myapplication.GamesCategory.GamesCategoriesList
import com.example.myapplication.GamesLogo.GamesLogo
import com.example.myapplication.R
import com.example.myapplication.ui.theme.Background
import com.example.myapplication.ui.theme.TextColor


@Composable
@Preview
fun GameScreen () {
    val maskImage = ImageBitmap.imageResource(id = R.drawable.mask_group)
    var paddingContent = (maskImage.height - 20).dp
    Box(modifier = Modifier
        .background(Background)
        .verticalScroll(rememberScrollState())
    )
    {
        Image(
            bitmap = maskImage,
            contentDescription = "",
            modifier = Modifier.fillMaxWidth(),
            contentScale = ContentScale.FillWidth
        )
        Column(modifier = Modifier.fillMaxSize()) {
            Spacer(modifier = Modifier.height(paddingContent))
            Box(
                modifier = Modifier
                    .background(Background)
                    .clip(RoundedCornerShape(14.dp))
            ) {
                Column(Modifier.padding(horizontal = 24.dp)) {
                    GameInfoUI(
                        title = "DoTA 2",
                        rating = 4.9f,
                        countOfDownloads = "70M",
                        modifier = Modifier.padding(start = 100.dp, top = 12.dp)
                    )
                    Spacer(modifier = Modifier.height(22.dp))
                    GamesCategoriesList(
                        gamesCategories = listOf("MOBA", "MULTIPLAYER", "STRATEGY")
                    )
                    Spacer(modifier = Modifier.height(24.dp))
                    Text(
                        text = "Dota 2 is a multiplayer online battle arena (MOBA) game which has " +
                                "two teams of five players compete to collectively destroy a large " +
                                "structure defended by the opposing team known as the \"Ancient\", " +
                                "whilst defending their own.",
                        fontSize = 12.sp,
                        color = TextColor,
                        lineHeight = 19.sp
                    )
                }
            }
            Spacer(modifier = Modifier.height(24.dp))
            Row(
                Modifier
                    .padding(start = 24.dp)
                    .clip(RoundedCornerShape(14.dp))) {
                Image(
                    painter = painterResource(R.drawable.games_image_1),
                    contentDescription = "",
                    Modifier.size(width = 245.dp, height = 130.dp)
                )
                Spacer(modifier = Modifier.width(12.dp))
                Image(
                    painter = painterResource(R.drawable.games_image_2),
                    contentDescription = "",
                    Modifier.size(width = 200.dp, height = 130.dp)
                )
            }
            Spacer(modifier = Modifier.height(24.dp))
            Box(
                modifier = Modifier
                    .background(Background)
                    .clip(RoundedCornerShape(14.dp))
            ) {
                Column(Modifier.padding(horizontal = 24.dp)) {
                    Text(text = "Review & Ratings", fontSize = 16.sp, color = Color.White)
                    Spacer(modifier = Modifier.height(14.dp))
                    GameRating(rating = "4.9", reviews = "70M Reviews")
                    Spacer(modifier = Modifier.height(24.dp))
                    CommentOfUser(image = ImageBitmap.imageResource(R.drawable.avatar1),
                        name = "Auguste Conte",
                        date = "February 14, 2019",
                        comment = "“Once you start to learn its secrets, there’s a wild and " +
                                "exciting variety of play here that’s unmatched, even by " +
                                "its peers.”")
                    Spacer(modifier = Modifier.height(12.dp))
                    Divider(color = Color(0xFF1A1F29),
                            thickness = 1.dp,
                            modifier = Modifier
                                .fillMaxSize()
                                .padding(19.dp)
                    )
                    Spacer(modifier = Modifier.height(12.dp))
                    CommentOfUser(image = ImageBitmap.imageResource(R.drawable.avatar2),
                        name = "Jang Marcelino",
                        date = "February 14, 2019",
                        comment = "“Once you start to learn its secrets, there’s a wild and " +
                                "exciting variety of play here that’s unmatched, even by " +
                                "its peers.”")
                    Spacer(modifier = Modifier.height(24.dp))
                    IconButton(
                        onClick = { /* Install an app */ },
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(115.dp)
                    ) {
                            Image(
                                painter = painterResource(R.drawable.install),
                                contentDescription = null,
                                contentScale = ContentScale.Crop,
                                modifier = Modifier
                                    .fillMaxSize()
                            )
                    }
                    Spacer(modifier = Modifier.height(5.dp))
                }
            }
        }
        GamesLogo (
            gameLogoId = R.drawable.icon,
            modifier = Modifier
                .padding(
                    top = paddingContent - 35.dp
                )
                .size(142.dp)
        )
        Image(
            painter = painterResource(R.drawable.ellipse),
            contentDescription = "",
            modifier = Modifier
                .size(48.dp)
                .offset(120.dp, 571.dp)
        )
        Image(
            painter = painterResource(R.drawable.arrow),
            contentDescription = "",
            modifier = Modifier
                .size(24.dp)
                .offset(132.dp, 583.dp)
        )
    }
}
