package com.example.teste.model

import com.google.gson.Gson
import okhttp3.OkHttpClient
import okhttp3.Request
import java.lang.Exception
import java.util.concurrent.TimeUnit

object ContatoHttp {
private const val URL = "http://192.168.86.52:8080/api/contatos/"
    private val client =  OkHttpClient().newBuilder()
        .readTimeout(10, TimeUnit.SECONDS)
        .connectTimeout(5, TimeUnit.SECONDS)
        .build()
    fun procuraAluno(): InfoRequest? {
        val request = Request.Builder().url(URL)
            .build()
            val response = client.newCall(request).execute()
            val json = response.body?.string()
            return Gson().fromJson(json, InfoRequest::class.java)

    }
}