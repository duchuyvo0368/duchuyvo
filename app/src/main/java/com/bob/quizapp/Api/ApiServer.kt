package com.bob.quizapp.Api

class ApiServer {
    companion object {
        private const val base_url = "http://voduchuy.freecluster.eu/QuizApp/"
        fun getService(): Dataservice {
            return ApiRetrofit.getClient(base_url)!!.create(Dataservice::class.java)
        }
    }
}