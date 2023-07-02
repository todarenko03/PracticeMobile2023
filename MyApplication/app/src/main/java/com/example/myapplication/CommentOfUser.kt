package com.example.myapplication

import android.graphics.Bitmap
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.TextColor

@Composable
fun CommentOfUser(
    image: ImageBitmap,
    name: String,
    date: String,
    comment: String
) {
    Column() {
        Row() {
            Image(bitmap = image,
                contentDescription = null,
                modifier = Modifier.size(36.dp))
            Spacer(modifier = Modifier.width(9.dp))
            Column() {
                Text(text = name, fontSize = 16.sp, color = Color.White)
                Spacer(modifier = Modifier.height(3.dp))
                Text(text = date, fontSize = 12.sp, color = TextColor)
            }
        }
        Spacer(modifier = Modifier.height(14.dp))
        Text(text = comment, fontSize = 12.sp, color = TextColor, lineHeight = 19.sp)
    }
}
