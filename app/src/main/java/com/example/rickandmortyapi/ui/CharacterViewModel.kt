package com.example.rickandmortyapi.ui

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.rickandmortyapi.data.repositories.CharacterRepository
import com.example.rickandmortyapi.model.RickAndMortyResponse
import com.example.rickandmortyapi.model.character.CharacterModel

class CharacterViewModel : ViewModel() {

    private val characterRepository = CharacterRepository()

    fun fetchCharacter(): MutableLiveData<RickAndMortyResponse<CharacterModel>> {
        return characterRepository.fetchCharacter()
    }
}