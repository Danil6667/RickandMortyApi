package com.example.rickandmortyapi.data.model

import com.google.gson.annotations.SerializedName

data class Oregin(
    @SerializedName("name")
    val name: String,
    @SerializedName("url")
    val url: String
)