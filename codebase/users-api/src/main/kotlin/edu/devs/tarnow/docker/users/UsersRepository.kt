package edu.devs.tarnow.docker.users

import retrofit2.Call
import retrofit2.http.GET

data class User(val id: String, val firstName: String, val lastName: String, val age: Int)

interface UsersRepository {

    @GET("/user")
    fun list(): Call<List<User>>


}