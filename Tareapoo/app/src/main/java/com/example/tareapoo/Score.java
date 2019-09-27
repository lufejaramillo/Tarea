package com.example.tareapoo;

public class Score {

    int score; //Declaración de la variable
    int level; //Declaración de la variable
    int count; //Declaración de la variable
    Score(){
        inti();
    }
    void inti(){
        score=0;
        level=1;
        count=0;
    }
    void update (boolean a) {
        if (a==true) {
            score=score +100;
            count ++;
            if (count % 10 == 0) {
                level++;
            }
        }
        else
            score=score-50;
    }



}
