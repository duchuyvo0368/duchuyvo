package com.bob.quizapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Intent


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       btn_start.setOnClickListener{
           if (et_name.text.toString().isEmpty()){
               Toast.makeText(this, "Please Enter Your Name", Toast.LENGTH_SHORT).show()
           }else{
               val intent = Intent(this, QuizChoice::class.java)
               intent.putExtra(Constants.USER_NAME, et_name.text.toString())
               startActivity(intent)
               finish()

           }


       }


    }
}