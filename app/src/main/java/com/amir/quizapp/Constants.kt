package com.amir.quizapp

object Constants {
    //whenever we send data from one activity,it'S go to store the name at
    //which we stored the details that we want to have in an constant
/*these are just going to be the keys, on the which we are storing.
    //which we are storing the details that we can retrieve them
    when we are moving data from one activity to another
 */
    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"


    fun getQuestions(): ArrayList<Question> {
        //the questions can be an xml file or another file. here we will hardcode
        val questionsList = ArrayList<Question>()

        val que1 = Question(
            id = 1, "What country does this flag belong to?",
            R.drawable.img_argantina,
            "Argentina", "Australia", "Armenia", "Austria",
            1

        )
        questionsList.add(que1)
        val que2 = Question(
            id = 2, "What country does this flag belong to?",
            R.drawable.img_england,
            "Argentina", "Australia", "England", "Austria",
            3

        )
        questionsList.add(que2)
        val que3 = Question(
            id = 3, "What country does this flag belong to?",
            R.drawable.img_belgium,
            "Iraq", "Belgium", "Iran", "Austria",
            2

        )
        questionsList.add(que3)
        val que4 = Question(
            id = 4, "What country does this flag belong to?",
            R.drawable.img_germany,
            "Germany", "Belgium", "France", "Austria",
            1

        )
        questionsList.add(que4)
        val que5 = Question(
            id = 5, "What country does this flag belong to?",
            R.drawable.img_brazil,
            "Brazil", "Fiji", "Kuwait", "Germany",
            1

        )
        questionsList.add(que5)
        val que6 = Question(
            id = 6, "What country does this flag belong to?",
            R.drawable.img_denmark,
            "USA", "Canada", "Kuwait", "Denmark",
            4

        )
        questionsList.add(que6)
        val que7 = Question(
            id = 7, "What country does this flag belong to?",
            R.drawable.img_newzealand,
            "Argentina", "NewZealand", "England", "Dubai",
            2

        )
        questionsList.add(que7)
        val que8 = Question(
            id = 8, "What country does this flag belong to?",
            R.drawable.img_fiji,
            "Argentina", "Australia", "Fiji", "England",
            3

        )
        questionsList.add(que8)
        val que9 = Question(
            id = 9, "What country does this flag belong to?",
            R.drawable.img_kuwait,
            "Iraq", "Serbia", "Fiji", "Kuwait",
            4

        )
        questionsList.add(que9)
        val que10 = Question(
            id = 10, "What country does this flag belong to?",
            R.drawable.img_india,
            "China", "India", "Fiji", "England",
            2

        )
        questionsList.add(que10)


        return questionsList
    }
}