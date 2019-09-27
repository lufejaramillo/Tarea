package com.example.tareapoo;

public class ScoreEasy{
    int score; //Declaración de la variable
    int level; //Declaración de la variable
    int count;
    OnUpdateListener tonotify;
    ScoreEasy() {
        init();
    }
    void init(){
        score = 0;
        level = 1;
        count=0;
    }
    void setOnUpdateListener(OnUpdateListener pOnUpdateListener){
        tonotify= pOnUpdateListener;
    }



     void update(boolean a) {
        if (a == true) {
            score = score + 200;
            count++;
            if (count % 10 == 0) {
                level++;
            }
        }
    }
    void somework(){
        tonotify.onUpdate();
    }

}
