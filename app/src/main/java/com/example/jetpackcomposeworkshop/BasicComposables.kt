package com.example.jetpackcomposeworkshop

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcomposeworkshop.ui.theme.JetpackComposeWorkshopTheme

@Preview(showBackground = true)
@Composable
fun ComposablePreview() {
	//Composable we want to preview here

}

//Text Composable
@Composable
fun TextComposable() {
	//Text View
	Text(text = "My text")

	//Modifiers
	Text(
		text = "Modified Text",
		color = Color.Blue,
		fontSize = 30.sp,
		modifier = Modifier
			.background(Color.Gray)
			.padding(20.dp)
	)
}

//Button Composable
@Composable
fun ButtonComposable() {
	//Buttons
	Button(
		onClick = {
		//Do Something
	},
		modifier = Modifier.padding(20.dp)
	) {
		Text(text = "My Button")
	}
}

//TextField Composable
@Composable
fun TextFieldComposable() {
	//TextField
	TextField(
		//When the user hasn't entered something
		placeholder = {
			Text(text = "Hint")
		},
		//Value of the textField entry
		value = "",
		//Define what happens when you type something
		onValueChange = {
			//Do something
		}
	)
}

//States w/ Composable
@Composable
fun TextFieldStateComposable() {
	//Variable w/ state
	var textVariable by remember {
		mutableStateOf("")
	}
	TextField(
		value = textVariable,
		onValueChange = {
				text ->
			textVariable = text
		}
	)
}



