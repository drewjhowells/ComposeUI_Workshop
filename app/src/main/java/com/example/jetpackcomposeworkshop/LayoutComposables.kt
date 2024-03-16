package com.example.jetpackcomposeworkshop

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Button
import androidx.compose.material3.Divider
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
fun LayoutPreview() {
	//Layout we want to preview here

}

//Box & Alignment
@Composable
fun BoxComposable() {
	Box (
		modifier = Modifier.size(200.dp)
	){
		Text(
			text = "Some text",
			modifier = Modifier.align(Alignment.BottomEnd)
		)
		Text(
			text = "More text",
			modifier = Modifier.align(Alignment.CenterStart)
		)
	}
}

//Row
@Composable
fun RowComposable() {
	//Rows- Row of items to display (i.e. Text, Button, etc)
	Row (

	){
		Button(onClick = { /*TODO*/ }) {
			Text(text = "Button 1")
		}
		Button(onClick = { /*TODO*/ }) {
			Text(text = "Button 2")
		}
		Button(onClick = { /*TODO*/ }) {
			Text(text = "Button 3")
		}
	}
}

//Column
@Composable
fun ColumnComposable() {
	Column {
		TextComposable()
		ButtonComposable()
		Divider()
		TextFieldStateComposable()
	}
}

//Lazy Column/Row
@Composable
fun LazyColumnComposable() {
	LazyColumn {

	}
}

//Scaffold
@Composable
fun Scaffolding() {
	//Scaffold
	Scaffold (
		//Overlay (scaffolding) items for the app
		floatingActionButton = {
			FloatingActionButton(onClick = {
				//Do Something
			}) {
				Icon(Icons.Default.Add, contentDescription = "Description when hovered over")
			}
		},
		bottomBar = {
			BottomAppBar (

			){

			}
		}
	) {paddingValues ->
		Surface (
			modifier = Modifier
				.fillMaxSize()
				.padding(paddingValues),
			color = Color.LightGray
		){
			//Stuff goes here
			ColumnComposable()
		}
	}
}
