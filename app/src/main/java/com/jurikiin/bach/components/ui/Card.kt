package com.jurikiin.bach.components.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.jurikiin.bach.ui.theme.Dun

@Composable
fun Card(title: String = "", content: @Composable () -> Unit = {}) {
        Column(
            Modifier
                .padding(16.dp)
                .clip(RoundedCornerShape(8.dp))
                .background(Dun)
                .fillMaxSize()
                .padding(16.dp)
        ) {
            H3(title)
            content()
        }
}

@Preview
@Composable
fun Card_Preview() {
    Card("Title") {
        H3("Title")
    }
}
