package rest

import models.Live
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface RetrofitServices {

    @GET("lista-lives.json")
    fun getAllLives(): Call<List<Live>>

    companion object {

        private val retrofitServices: RetrofitServices by lazy{

             val retrofit = Retrofit.Builder()
                 .baseUrl("https://d3c0cr0sze1oo6.cloudfront.net/")
                 .addConverterFactory(GsonConverterFactory.create())
                 .build()

            retrofit.create(RetrofitServices::class.java)
        }

        fun getInstance() : RetrofitServices{
            return retrofitServices;
        }

    }

}