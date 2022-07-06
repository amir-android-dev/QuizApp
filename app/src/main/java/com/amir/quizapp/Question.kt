package com.amir.quizapp

//this is a model class of individual question
/*what we need for every different question: i need question itself, img and different options for answers
this is a good practice as well, to have an id, to know which question we are it
 */
data class Question(
//the img is integer, because is the place of images in our res
    //int because if the answer is f.e. option 1
    val id: Int,
    val question: String,
    val image: Int,
    val optionOne: String,
    val optionTwo: String,
    val optionThree: String,
    val optionFour: String,
    val correctAnswer: Int  //int because if the answer is f.e. option 1


)
