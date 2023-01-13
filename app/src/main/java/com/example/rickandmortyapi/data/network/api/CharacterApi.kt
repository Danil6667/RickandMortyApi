package com.example.rickandmortyapi.data.network.api

import com.example.rickandmortyapi.model.RickAndMortyResponse
import com.example.rickandmortyapi.model.character.CharacterModel
import retrofit2.Call
import retrofit2.http.GET

interface CharacterApi {

    @GET("api/character")
    fun fetchCharacter(): Call<RickAndMortyResponse<CharacterModel>>
}