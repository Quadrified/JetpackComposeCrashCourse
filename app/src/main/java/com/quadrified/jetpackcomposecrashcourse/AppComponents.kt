package com.quadrified.jetpackcomposecrashcourse

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun HelloWorld(name: String = "World") {
    TextComponent(
        value = "Hello, $name! ",
        size = 24.sp,
        colorValue = Color.Magenta,
        fontWeight = FontWeight.Bold,
        fontStyle = FontStyle.Italic,
        maxLinesValue = 5
    )
}

@Composable
fun TextComponent(
    value: String,
    size: TextUnit = 18.sp,
    colorValue: Color = Color.Magenta,
    fontWeight: FontWeight = FontWeight.Normal,
    fontStyle: FontStyle = FontStyle.Normal,
    maxLinesValue: Int? = null,
    backgroundColor: Color = Color.White,
) {
    Text(
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight(align = Alignment.Top)
            .padding(18.dp),
//            .clip(shape = RoundedCornerShape(20.dp))
//            .background(backgroundColor)
//            .border(
//                width = 2.dp,
//                color = Color.Magenta,
//                shape = RoundedCornerShape(20.dp)
//            )
        text = value,
        fontSize = size,
        color = colorValue,
        fontWeight = fontWeight,
        fontStyle = fontStyle,
        maxLines = maxLinesValue ?: Int.MAX_VALUE,
        overflow = TextOverflow.Ellipsis,
    )
}

//@Preview(showSystemUi = true, showBackground = true)
@Composable
fun TextComponentPreview(name: String = "World") {
    TextComponent(value = "Omer")
}


@Composable
fun SimpleButton() {
    Button(
        modifier = Modifier
            .fillMaxWidth()
            .height(68.dp),
        shape = RoundedCornerShape(12.dp),
        onClick = {
            Log.d("SimpleButton", "Clicked")
        }) {
        NormalText(value = "Click Here!")
    }
}

//@Preview(showSystemUi = true)
@Composable
fun SimpleButtonPreview() {
    SimpleButton()
}

@Composable
fun NormalText(value: String) {
    Text(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
        text = value,
        textAlign = TextAlign.Center
    )
}


@Composable
fun TextFieldComponent() {
    var text by remember { mutableStateOf("") }

    TextField(
        modifier = Modifier.fillMaxWidth(),
        label = {
            Text(text = "Your Name")
        },
        placeholder = {
            Text(text = "Please Enter Your Name", fontSize = 16.sp)
        },
        textStyle = TextStyle(
            fontSize = 21.sp,
            fontWeight = FontWeight.SemiBold
        ),
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
        value = text, onValueChange = { newText ->
            text = newText
        })
}

//@Preview(showSystemUi = true)
@Composable
fun TextFieldComponentPreview() {
    TextFieldComponent()
}

@Composable
fun ImageComponent() {
    Image(
        painter = painterResource(id = R.drawable.profile),
        contentDescription = "App Logo",
        modifier = Modifier
            .size(108.dp)
            .clip(shape = CircleShape),
        contentScale = ContentScale.Crop
    )
}

@Preview(showSystemUi = true)
@Composable
fun ImageComponentPreview() {
    ImageComponent()
}

@Composable
fun MixList() {
    Column(
        modifier = Modifier.background(Color.LightGray),
    ) {
        HorizontalList()
        ListExample()
    }
}