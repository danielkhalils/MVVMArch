package repositories

import rest.RetrofitServices

class MainRepository constructor(private val retrofitServices: RetrofitServices){

    fun getAllLives() = retrofitServices.getAllLives()

}