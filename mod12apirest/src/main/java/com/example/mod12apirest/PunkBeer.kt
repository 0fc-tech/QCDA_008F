package com.example.mod12apirest

data class PunkBeer (
    val name:String,
    val description:String,
    //Higher the better
    val abv: Double,
    val tagline: String,
    val ibu: Double
)