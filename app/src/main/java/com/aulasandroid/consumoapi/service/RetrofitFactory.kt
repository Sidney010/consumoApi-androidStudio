package com.aulasandroid.consumoapi.service

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitFactory {
    private val BASE_URL = "https://viacep.com.br/ws/"


    // Conversao padrao
    private val retrofitFactory = Retrofit
        .Builder() // Configuracao basica
        .addConverterFactory(GsonConverterFactory.create()) // Adiciona, uma transformacao em um objeto
        .baseUrl(BASE_URL)
        .build()

    fun getEnderecoService(): EnderecoService {
        return retrofitFactory
            .create(EnderecoService::class.java)

    }
}