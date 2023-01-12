package com.example.rickandmortyapi.data.repositories

import androidx.lifecycle.MutableLiveData
import com.example.rickandmortyapi.App
import com.example.rickandmortyapi.model.RickAndMortyResponse
import com.example.rickandmortyapi.model.character.CharacterModel
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class CharacterRepository {

    val data: MutableLiveData<RickAndMortyResponse<CharacterModel>> = MutableLiveData()

    fun fetchCharacter(): MutableLiveData<RickAndMortyResponse<CharacterModel>> {
        App.characterApi?.fetchCharacter()
            ?.enqueue(object : Callback<RickAndMortyResponse<CharacterModel>> {
                override fun onResponse(
                    call: Call<RickAndMortyResponse<CharacterModel>>,
                    response: Response<RickAndMortyResponse<CharacterModel>>
                ) {
                    data.value = response.body()
                }

                override fun onFailure(
                    call: Call<RickAndMortyResponse<CharacterModel>>,
                    t: Throwable
                ) {
                }
            })

        return data
    }
}