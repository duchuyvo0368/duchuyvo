package com.voduchuy.quizapp



object Constants {

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_question"
    const val CORRECT_ANSWERS: String = "correct_answers"

//List of questions
    fun getQuestions(): ArrayList<Question>{
        val questionsList = ArrayList<Question>()

        val que1 = Question(0, "What is 2+2 ?",
            R.drawable.mathspng,
            optionOne = "4",
            optionTwo = "2",
            optionThree = "8",
            optionFour = "10",
            correctAnswer = 1
        )
        questionsList.add(que1)

        val que2 = Question(1, "What is 4+4 ?",
            R.drawable.mathspng,
            optionOne = "2",
            optionTwo = "10",
            optionThree = "8",
            optionFour = "9",
            correctAnswer = 3
        )
        questionsList.add(que2)

        val que3 = Question(2, "What is 5+1 ?",
            R.drawable.mathspng,
            optionOne = "10",
            optionTwo = "6",
            optionThree = "12",
            optionFour = "8",
            correctAnswer = 2
        )
        questionsList.add(que3)

        val que4 = Question(3, "What is 7+3 ?",
            R.drawable.mathspng,
            optionOne = "15",
            optionTwo = "9",
            optionThree = "12",
            optionFour = "10",
            correctAnswer = 4
        )
        questionsList.add(que4)

        val que5 = Question(4, "What is 3+3 ?",
            R.drawable.mathspng,
            optionOne = "6",
            optionTwo = "7",
            optionThree = "9",
            optionFour = "12",
            correctAnswer = 1
        )
        questionsList.add(que5)

        val que6 = Question(5, "What is 9+1 ?",
            R.drawable.mathspng,
            optionOne = "0",
            optionTwo = "15",
            optionThree = "12",
            optionFour = "10",
            correctAnswer = 4
        )
        questionsList.add(que6)

        val que7 = Question(6, "What is 4+4 ?",
            R.drawable.mathspng,
            optionOne = "9",
            optionTwo = "7",
            optionThree = "8",
            optionFour = "6",
            correctAnswer = 3
        )
        questionsList.add(que7)

        val que8 = Question(7, "What is 2+7 ?",
            R.drawable.mathspng,
            optionOne = "8",
            optionTwo = "9",
            optionThree = "10",
            optionFour = "12",
            correctAnswer = 2
        )
        questionsList.add(que8)

        val que9 = Question(8, "What is 5+10 ?",
            R.drawable.mathspng,
            optionOne = "15",
            optionTwo = "12",
            optionThree = "17",
            optionFour = "14",
            correctAnswer = 1
        )
        questionsList.add(que9)

        val que10 = Question(9, "What is 12+12 ?",
            R.drawable.mathspng,
            optionOne = "20",
            optionTwo = "25",
            optionThree = "21",
            optionFour = "24",
            correctAnswer = 4
        )
        questionsList.add(que10)




        return questionsList
    }
    //List of questions for EASY
    fun getQuestionsEasy(): ArrayList<Question>{
        val questionsList = ArrayList<Question>()

        val que1 = Question(0, "What is 10+10 ?",
            R.drawable.mathspng,
            optionOne = "25",
            optionTwo = "20",
            optionThree = "30",
            optionFour = "40",
            correctAnswer = 2
        )
        questionsList.add(que1)

        val que2 = Question(1, "What is 6+10 ?",
            R.drawable.mathspng,
            optionOne = "16",
            optionTwo = "26",
            optionThree = "10",
            optionFour = "30",
            correctAnswer = 1
        )
        questionsList.add(que2)

        val que3 = Question(2, "What is 15+5 ?",
            R.drawable.mathspng,
            optionOne = "25",
            optionTwo = "30",
            optionThree = "20",
            optionFour = "22",
            correctAnswer = 3
        )
        questionsList.add(que3)

        val que4 = Question(3, "What is 9+6 ?",
            R.drawable.mathspng,
            optionOne = "10",
            optionTwo = "13",
            optionThree = "19",
            optionFour = "15",
            correctAnswer = 4
        )
        questionsList.add(que4)

        val que5 = Question(4, "What is 7+7 ?",
            R.drawable.mathspng,
            optionOne = "14",
            optionTwo = "18",
            optionThree = "13",
            optionFour = "20",
            correctAnswer = 1
        )
        questionsList.add(que5)

        val que6 = Question(5, "What is 8-3 ?",
            R.drawable.mathspng,
            optionOne = "8",
            optionTwo = "3",
            optionThree = "11",
            optionFour = "5",
            correctAnswer = 4
        )
        questionsList.add(que6)

        val que7 = Question(6, "What is 9+9 ?",
            R.drawable.mathspng,
            optionOne = "15",
            optionTwo = "24",
            optionThree = "18",
            optionFour = "19",
            correctAnswer = 3
        )
        questionsList.add(que7)

        val que8 = Question(7, "What is 3+3+3 ?",
            R.drawable.mathspng,
            optionOne = "6",
            optionTwo = "9",
            optionThree = "3",
            optionFour = "12",
            correctAnswer = 2
        )
        questionsList.add(que8)

        val que9 = Question(8, "What is 10+7 ?",
            R.drawable.mathspng,
            optionOne = "17",
            optionTwo = "27",
            optionThree = "7",
            optionFour = "19",
            correctAnswer = 1
        )
        questionsList.add(que9)

        val que10 = Question(9, "What is 14+6 ?",
            R.drawable.mathspng,
            optionOne = "10",
            optionTwo = "20",
            optionThree = "40",
            optionFour = "16",
            correctAnswer = 2
        )
        questionsList.add(que10)




        return questionsList
    }
    //List of questions for EASY
    fun getQuestionsMedium(): ArrayList<Question>{
        val questionsList = ArrayList<Question>()

        val que1 = Question(0, "What is 5x1 ?",
            R.drawable.mathspng,
            optionOne = "1",
            optionTwo = "10",
            optionThree = "5",
            optionFour = "25",
            correctAnswer = 3
        )
        questionsList.add(que1)

        val que2 = Question(1, "What is 2x2 ?",
            R.drawable.mathspng,
            optionOne = "8",
            optionTwo = "10",
            optionThree = "12",
            optionFour = "4",
            correctAnswer = 4
        )
        questionsList.add(que2)

        val que3 = Question(2, "What is 4x4 ?",
            R.drawable.mathspng,
            optionOne = "16",
            optionTwo = "22",
            optionThree = "26",
            optionFour = "8",
            correctAnswer = 1
        )
        questionsList.add(que3)

        val que4 = Question(3, "What is 10+12+15 ?",
            R.drawable.mathspng,
            optionOne = "39",
            optionTwo = "37",
            optionThree = "32",
            optionFour = "29",
            correctAnswer = 2
        )
        questionsList.add(que4)

        val que5 = Question(4, "What is 7x7 ?",
            R.drawable.mathspng,
            optionOne = "50",
            optionTwo = "38",
            optionThree = "44",
            optionFour = "49",
            correctAnswer = 4
        )
        questionsList.add(que5)

        val que6 = Question(5, "What is 5+10-5 ?",
            R.drawable.mathspng,
            optionOne = "10",
            optionTwo = "5",
            optionThree = "15",
            optionFour = "20",
            correctAnswer = 1
        )
        questionsList.add(que6)

        val que7 = Question(6, "What is 5x5 ?",
            R.drawable.mathspng,
            optionOne = "20",
            optionTwo = "25",
            optionThree = "50",
            optionFour = "35",
            correctAnswer = 2
        )
        questionsList.add(que7)

        val que8 = Question(7, "What is 8x2 ?",
            R.drawable.mathspng,
            optionOne = "14",
            optionTwo = "18",
            optionThree = "16",
            optionFour = "12",
            correctAnswer = 3
        )
        questionsList.add(que8)

        val que9 = Question(8, "What is 7x10 ?",
            R.drawable.mathspng,
            optionOne = "70",
            optionTwo = "50",
            optionThree = "77",
            optionFour = "57",
            correctAnswer = 1
        )
        questionsList.add(que9)

        val que10 = Question(9, "What is 50x2 ?",
            R.drawable.mathspng,
            optionOne = "50",
            optionTwo = "100",
            optionThree = "150",
            optionFour = "99",
            correctAnswer = 2
        )
        questionsList.add(que10)




        return questionsList
    }
    //List of questions for EASY
    fun getQuestionsHard(): ArrayList<Question>{
        val questionsList = ArrayList<Question>()

        val que1 = Question(0, "What is 6x6 ?",
            R.drawable.mathspng,
            optionOne = "36",
            optionTwo = "44",
            optionThree = "23",
            optionFour = "66",
            correctAnswer = 1
        )
        questionsList.add(que1)

        val que2 = Question(1, "What is 12x12 ?",
            R.drawable.mathspng,
            optionOne = "124",
            optionTwo = "104",
            optionThree = "94",
            optionFour = "144",
            correctAnswer = 4
        )
        questionsList.add(que2)

        val que3 = Question(2, "What is 34x2 ?",
            R.drawable.mathspng,
            optionOne = "60",
            optionTwo = "68",
            optionThree = "72",
            optionFour = "78",
            correctAnswer = 2
        )
        questionsList.add(que3)

        val que4 = Question(3, "What is 10x10-10 ?",
            R.drawable.mathspng,
            optionOne = "100",
            optionTwo = "110",
            optionThree = "90",
            optionFour = "80",
            correctAnswer = 3
        )
        questionsList.add(que4)

        val que5 = Question(4, "What is 30x3+10 ?",
            R.drawable.mathspng,
            optionOne = "80",
            optionTwo = "100",
            optionThree = "60",
            optionFour = "90",
            correctAnswer = 2
        )
        questionsList.add(que5)

        val que6 = Question(5, "What is 5x5+25 ?",
            R.drawable.mathspng,
            optionOne = "50",
            optionTwo = "100",
            optionThree = "75",
            optionFour = "36",
            correctAnswer = 1
        )
        questionsList.add(que6)

        val que7 = Question(6, "What is 7+7x10 ?",
            R.drawable.mathspng,
            optionOne = "150",
            optionTwo = "140",
            optionThree = "200",
            optionFour = "195",
            correctAnswer = 2
        )
        questionsList.add(que7)

        val que8 = Question(7, "What is 8x25 ?",
            R.drawable.mathspng,
            optionOne = "250",
            optionTwo = "180",
            optionThree = "200",
            optionFour = "150",
            correctAnswer = 3
        )
        questionsList.add(que8)

        val que9 = Question(8, "What is 60+60x2 ?",
            R.drawable.mathspng,
            optionOne = "240",
            optionTwo = "150",
            optionThree = "120",
            optionFour = "300",
            correctAnswer = 1
        )
        questionsList.add(que9)

        val que10 = Question(9, "What is 100x10+1000 ?",
            R.drawable.mathspng,
            optionOne = "5000",
            optionTwo = "2000",
            optionThree = "1000",
            optionFour = "9000",
            correctAnswer = 2
        )
        questionsList.add(que10)




        return questionsList
    }
    //List of questions for EASY
    fun getQuestionsVHard(): ArrayList<Question>{
        val questionsList = ArrayList<Question>()

        val que1 = Question(0, "What is 66x10 ?",
            R.drawable.mathspng,
            optionOne = "660",
            optionTwo = "500",
            optionThree = "1600",
            optionFour = "66",
            correctAnswer = 1
        )
        questionsList.add(que1)

        val que2 = Question(1, "What is 55x6 ?",
            R.drawable.mathspng,
            optionOne = "550",
            optionTwo = "1055",
            optionThree = "330",
            optionFour = "300",
            correctAnswer = 3
        )
        questionsList.add(que2)

        val que3 = Question(2, "What is 19x52 ?",
            R.drawable.mathspng,
            optionOne = "960",
            optionTwo = "988",
            optionThree = "952",
            optionFour = "911",
            correctAnswer = 2
        )
        questionsList.add(que3)

        val que4 = Question(3, "What is 1000x10 ?",
            R.drawable.mathspng,
            optionOne = "10000",
            optionTwo = "100000",
            optionThree = "5000",
            optionFour = "15000",
            correctAnswer = 1
        )
        questionsList.add(que4)

        val que5 = Question(4, "What is 30x30+10 ?",
            R.drawable.mathspng,
            optionOne = "80",
            optionTwo = "100",
            optionThree = "120",
            optionFour = "300",
            correctAnswer = 2
        )
        questionsList.add(que5)

        val que6 = Question(5, "What is 25x25 ?",
            R.drawable.mathspng,
            optionOne = "250",
            optionTwo = "425",
            optionThree = "600",
            optionFour = "625",
            correctAnswer = 4
        )
        questionsList.add(que6)

        val que7 = Question(6, "What is 44x5 ?",
            R.drawable.mathspng,
            optionOne = "220",
            optionTwo = "320",
            optionThree = "400",
            optionFour = "440",
            correctAnswer = 1
        )
        questionsList.add(que7)

        val que8 = Question(7, "What is 55x2+100 ?",
            R.drawable.mathspng,
            optionOne = "300",
            optionTwo = "220",
            optionThree = "210",
            optionFour = "265",
            correctAnswer = 3
        )
        questionsList.add(que8)

        val que9 = Question(8, "What is 600x2-200?",
            R.drawable.mathspng,
            optionOne = "1000",
            optionTwo = "2000",
            optionThree = "4000",
            optionFour = "6000",
            correctAnswer = 1
        )
        questionsList.add(que9)

        val que10 = Question(9, "What is 5x99+5 ?",
            R.drawable.mathspng,
            optionOne = "600",
            optionTwo = "500",
            optionThree = "599",
            optionFour = "495",
            correctAnswer = 2
        )
        questionsList.add(que10)




        return questionsList
    }




}