package com.quadrified.jetpackcomposecrashcourse

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun ListExample() {
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

    LazyColumn(
        modifier = Modifier
            .background(Color.White)
    ) {
        items(fruits) { item: String ->
            TextComponent(value = item)
            Spacer(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(1.dp)
                    .background(Color.Black)
            )
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun ListExamplePreview() {
    ListExample()
}