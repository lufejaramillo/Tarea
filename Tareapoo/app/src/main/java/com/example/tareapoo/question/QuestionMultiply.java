package com.example.tareapoo.question;

import java.util.Random;

public class QuestionMultiply extends Question {

    public QuestionMultiply(){
        init();
        }
     public void init() {
        int orden;
        Random A = new Random();
        orden = A.nextInt(3);
        questionA = A.nextInt(10);
        questionB = A.nextInt(10);
        correctAnswer = questionA * questionB;

        if (orden==1) {
            Answer1 = correctAnswer - 1;
            Answer2 =correctAnswer;
            Answer3 = correctAnswer + 1;
        }

        else if(orden==2) {
            Answer1 = correctAnswer + 1;
            Answer2 = correctAnswer - 1;
            Answer3 =correctAnswer;
        }
        else  {
            Answer1 = correctAnswer ;
            Answer2 =correctAnswer-1;
            Answer3 = correctAnswer + 1;

        }

    }

    }



