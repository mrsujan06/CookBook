package com.example.cookbook.model

import androidx.annotation.DrawableRes

data class Recipe(
    @DrawableRes val image: Int,
    val title: String,
    val ingredients: List<String>

)