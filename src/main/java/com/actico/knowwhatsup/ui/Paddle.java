package com.actico.knowwhatsup.ui;

import javax.swing.*;
import java.awt.*;

public class Paddle extends JLabel {
    private final int positionX;
    private int positionY;
    private final int paddleWidth;
    private final int paddleHeight;

    public Paddle(int x) {
        super();
        positionX = x;
        positionY = 185;
        paddleWidth = 25;
        paddleHeight = 150;
    }
    void draw(Graphics graphics){
        graphics.fillRect(positionX, positionY, paddleWidth, paddleHeight);
    }

    public int getPositionY() {
        return positionY;
    }

    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }

    public int getPositionX() {
        return positionX;
    }
}
