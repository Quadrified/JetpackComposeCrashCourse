package com.quadrified.jetpackcomposecrashcourse

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun HorizontalList() {
    // LazyColumn Example
    val fruits = listOf(
        "Apple",
        "Banana",
        "Orange",
        "Mango",
        "Pineapple",
        "Watermelon",
        "Cherry",
        "Strawberry",
        "Grapes",
        "Peach",
        "Pear",
        "Lemon", "Pineapple",
        "Watermelon",
        "Cherry",
        "Strawberry",
        "Grapes",
        "Peach",
        "Pear",
        "Lemon", "Pineapple",
        "Watermelon",
        "Cherry",
        "Strawberry",
        "Grapes",
        "Peach",
        "Pear",
        "Lemon",
    )

    LazyRow {
        items(fruits) { item: String ->
            Row(
                modifier = Modifier.height(60.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                TextComponent(value = item)
                Spacer(
                    modifier = Modifier
                        .width(1.dp)
                        .height(40.dp)
                        .background(Color.Black)
                )
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun HorizontalListPreview() {
    HorizontalList()
}