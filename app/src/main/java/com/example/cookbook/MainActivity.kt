package com.example.cookbook

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.setContent
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyAppContent()
        }
    }

}

@Composable
fun MyAppContent() {
    Column(modifier = Modifier.fillMaxSize()) {

        TopAppBar(title = {
            Text("ComposableCookBook")
        })

        RecipeList(defaultRecipes)
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MyAppContent()
}