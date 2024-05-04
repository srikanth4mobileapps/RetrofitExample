package com.sri.memeapp.data

import com.sri.memeapp.models.AllMemeData
import retrofit2.Response
import retrofit2.http.GET

interface ApiInterface {
    @GET("get_memes")
    suspend fun getMemesList(): Response<AllMemeData>
}