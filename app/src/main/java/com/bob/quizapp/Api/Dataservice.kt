package com.bob.quizapp.Api



import com.bob.quizapp.Api.Dataservice
import com.bob.quizapp.Question
import com.bob.quizapp.Quiz
import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.GET
import retrofit2.http.Query


interface Dataservice {
    @GET("QuizApp.php")
    fun getData(): Call<Quiz>


}