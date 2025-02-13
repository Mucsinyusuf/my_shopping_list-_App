package com.example.my_shopping_app

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

// data class helps us to hold the items at one place
data class ShoppingItem(
    val id: Int,
    var name: String,
    var quantity: Int,
    var isEditing: Boolean
)

@Composable
fun ShoppingList(){
    // creating an object with the properties of our data class and put it as state
    var sItems by remember {
        mutableStateOf(listOf<ShoppingItem>())
    }
    // the column holds the Button
    Column (
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center
    ){
        // Button Starts here
        Button(onClick = { /*TODO*/ },
            modifier = Modifier.align(Alignment.CenterHorizontally)
        ) {
            Text("Add Item")

        }
        // Adding a lazy column
        // lazy column or Roe renders only visible items on the screen

        LazyColumn(
            // this pushes the button on the top by default
            // because the lazy column even though it is empty will take the whole page
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        ){
            items(sItems){


            }

        }


    }
}