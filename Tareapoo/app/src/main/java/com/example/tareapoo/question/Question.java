package com.example.tareapoo.question;

import android.view.View;

abstract public class Question {
    public int questionA; //Declaración de la variable
    public int questionB; //Declaración de la variable
    protected int correctAnswer; //Declaración de la variable
    public int Answer1; //Declaración de la variable
    public int Answer2; //Declaración de la variable
    public int Answer3; //Declaración de la variable

    abstract public void init();

    public boolean check(int a) { // a debe ser el valor de la casilla al tocar el boton
        return a == correctAnswer;
    }
}
