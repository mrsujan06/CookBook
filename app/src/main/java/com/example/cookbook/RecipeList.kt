package com.example.cookbook

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumnFor
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.cookbook.model.Recipe

@Composable
fun RecipeList(recipes: List<Recipe>) {
    LazyColumnFor(items = recipes) {
        RecipeCard(it, Modifier.padding(16.dp))
    }
}