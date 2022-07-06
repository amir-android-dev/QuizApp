package com.amir.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        val tvName: TextView = findViewById(R.id.tv_name)
        val tvScore: TextView = findViewById(R.id.tv_score)
        val btnFinish: Button = findViewById(R.id.btn_finish)

        val mUserName = intent.getStringExtra(Constants.USER_NAME)
        //we pass to it a default value, if there is no value the value will be 0
        //we can instead of Constants.CORRECT_ANSWERS, write its value -->"correct_answer".
        // however is not a good practice, better to use the key
        val mCorrectAnswer = intent.getIntExtra(Constants.CORRECT_ANSWERS, 0)
        val mTotalQuestions = intent.getIntExtra(Constants.TOTAL_QUESTIONS, 0)
        tvName.text = mUserName
        tvScore.text = "Your Score is $mCorrectAnswer out of $mTotalQuestions."

        btnFinish.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}