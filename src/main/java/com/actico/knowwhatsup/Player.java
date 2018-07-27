package com.actico.knowwhatsup;

import com.actico.knowwhatsup.ui.Paddle;

public class Player {


    private String name;
    private Paddle paddle;
    private int score;

    Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    void setScore(int score) {
        this.score = score;
    }

    public Paddle getPaddle() {
        return paddle;
    }

    void setPaddle(Paddle paddle) {
        this.paddle = paddle;
    }
}
