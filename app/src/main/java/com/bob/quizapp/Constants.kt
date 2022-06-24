package com.bob.quizapp

import android.util.Log
import com.bob.quizapp.Api.ApiServer
import com.bob.quizapp.Api.Dataservice
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

object Constants {

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_question"
    const val CORRECT_ANSWERS: String = "correct_answers"

    //List of questions
    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()
        val apiService: Dataservice = ApiServer.getService()
        val call: Call<Quiz> = apiService.getData()
        call.enqueue(object : Callback<Quiz> {
            override fun onResponse(call: Call<Quiz>, response: Response<Quiz>) {
                val result: ArrayList<Quiz> = response.body()!!.results as ArrayList<Quiz>
                Log.d("AAA", "$result")
            }

            override fun onFailure(call: Call<Quiz>, t: Throwable) {
                Log.d("TAG", "Response = $t")
            }
        })
        return questionsList
    }

}