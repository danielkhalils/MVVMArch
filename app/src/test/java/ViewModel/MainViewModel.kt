package ViewModel

import androidx.lifecycle.ViewModel
import models.Live
import repositories.MainRepository
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainViewModel constructor(private val repository: MainRepository): ViewModel(){

    fun getAllLives(){

        val request = repository.getAllLives()
        request.enqueue(object : Callback<List<Live>>{
            override fun onResponse(call: Call<List<Live>>, response: Response<List<Live>>) {
                TODO("Not yet implemented")
            }

            override fun onFailure(call: Call<List<Live>>, t: Throwable) {
                TODO("Not yet implemented")
            }

        }

    }

}