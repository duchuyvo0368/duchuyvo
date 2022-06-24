package com.bob.quizapp

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_quiz_choice.*

class QuizChoice: AppCompatActivity() {

    private var mUsername: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_choice)

        v_Easybtn.findViewById<TextView>(R.id.v_Easybtn)
        easybtn.findViewById<TextView>(R.id.easybtn)
        mediumbtn.findViewById<TextView>(R.id.mediumbtn)
        hardbtn.findViewById<TextView>(R.id.hardbtn)
        v_Hardbtn.findViewById<TextView>(R.id.v_Hardbtn)

        mUsername = intent.getStringExtra(Constants.USER_NAME)



        v_Easybtn.setOnClickListener {

            val intent = Intent(this, QuizQuestionsActivity::class.java)
            intent.putExtra(Constants.USER_NAME, mUsername)
            startActivity(intent)

        }

        easybtn.setOnClickListener{
            val intent = Intent(this,QuizQuestionsActivityEasy::class.java)
            intent.putExtra(Constants.USER_NAME,mUsername)
            startActivity(intent)
        }

        mediumbtn.setOnClickListener{
            val intent = Intent(this,QuizQuestionsActivityMedium::class.java)
            intent.putExtra(Constants.USER_NAME,mUsername)
            startActivity(intent)
        }

        hardbtn.setOnClickListener{
            val intent = Intent(this,QuizQuestionsActivityHard::class.java)
            intent.putExtra(Constants.USER_NAME,mUsername)
            startActivity(intent)
        }
        v_Hardbtn.setOnClickListener{
            val intent = Intent(this,QuizQuestionsActivityVHard::class.java)
            intent.putExtra(Constants.USER_NAME,mUsername)
            startActivity(intent)
        }


    }


}



