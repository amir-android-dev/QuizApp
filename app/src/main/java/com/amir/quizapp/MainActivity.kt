package com.amir.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.widget.AppCompatEditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnStart: Button = findViewById(R.id.btn_start)
        val etName: EditText = findViewById(R.id.et_name)
        btnStart.setOnClickListener {
            if (etName.text.isEmpty()) {
                Toast.makeText(this, "Please Enter Your Name", Toast.LENGTH_LONG).show()
            } else {
                //Toast.makeText(this,"ok tnx",Toast.LENGTH_LONG).show()
                //this is a java class so we have to say where we are moving
                val intent = Intent(this, QuizQuestionsActivity::class.java)
                //here we send the data to quizactivity
                //instead of Constants.USER_NAME, we can write its value. better practice is the key
                //first parameter which will store the value, second one the value
                intent.putExtra(Constants.USER_NAME, etName.text.toString())
                startActivity(intent)
                finish()
            }


        }
    }
}