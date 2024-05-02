package com.quadrified.jetpackcomposecrashcourse

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun HorizontalScreen() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(200.dp),
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically
    ) {
        TextComponent(value = "Text 1")
        TextComponent(value = "Text 2")
        TextComponent(value = "Text 3")
        TextComponent(value = "Text 4")
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun HorizontalScreenPreview() {
    HorizontalScreen()
}