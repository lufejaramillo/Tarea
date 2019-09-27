package com.example.tareapoo.question;

import java.util.Random;

public class QuestionAdd extends Question{
    public QuestionAdd(){
        init();
    }
    public void init() {
        int orden;  // Declaración de una variable para cambiar el orden de las respuestas
        Random A = new Random();
        questionA=A.nextInt(10); // Inicialización de la variable questionA
        questionB=A.nextInt(10); // Inicialización de la variable questionB
        orden = A.nextInt(3);
        correctAnswer= questionA + questionB; // Inicialización de la variable temporal "a"

        if (orden==1) {
            Answer1 = correctAnswer- 1;
            Answer2 = correctAnswer;
            Answer3 = correctAnswer + 1;
        }

        else if(orden==2) {
            Answer1= correctAnswer+ 1;
            Answer2 = correctAnswer-1;
            Answer3 = correctAnswer;
        }
        else  {
            Answer1 = correctAnswer;
            Answer2 = correctAnswer - 1;
            Answer3 = correctAnswer + 1;
        }

    }
}
