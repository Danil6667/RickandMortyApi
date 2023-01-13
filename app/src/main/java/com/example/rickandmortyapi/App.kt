package com.example.rickandmortyapi

import android.app.Application
import com.example.rickandmortyapi.data.network.RetrofitClient
import com.example.rickandmortyapi.data.network.api.CharacterApi


class App : Application() {

    companion object {
        private val retrofitClient = RetrofitClient()
        var characterApi: CharacterApi? = null
    }

    override fun onCreate() {
        super.onCreate()
        characterApi = retrofitClient.provideCharacterApiService()
    }
}