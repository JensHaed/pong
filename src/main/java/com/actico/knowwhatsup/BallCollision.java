package com.actico.knowwhatsup;

import com.actico.knowwhatsup.ui.Frame;

import java.util.Timer;
import java.util.TimerTask;

class BallCollision {

    private final Ball ball;
    private final Frame frame;
    private final Player playerLeft;
    private final Player playerRight;

    BallCollision(final Ball ball, final Frame frame, final Player playerLeft, final Player playerRight) {

        this.ball = ball;
        this.frame = frame;
        this.playerLeft = playerLeft;
        this.playerRight = playerRight;
    }

    void check() {
        Timer collision = new Timer();
        collision.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                if (ball.getY() + 50 >= frame.getScreenHeight()) {
                    ball.setDirectionY(-1);
                }
                if (ball.getY()<= 0) {
                    ball.setDirectionY(1);
                }
                if (ball.getX() + 20 >= frame.getScreenWidth()) {
                    ball.setX(frame.getScreenWidth() / 2 - 10);
                    ball.setY(frame.getScreenHeight() / 2 - 10);

                    ball.setDirectionX(-1);
                    playerLeft.setScore(playerLeft.getScore() + 1);
                }
                if (ball.getX() <= 0) {
                    ball.setX(frame.getScreenWidth() / 2 - 10);
                    ball.setY(frame.getScreenHeight() / 2 - 10);

                    ball.setDirectionX(1);
                    playerRight.setScore(playerRight.getScore() + 1);
                }
                if (ball.getX() < playerLeft.getPaddle().getPositionX() + 25 && ball.getX() > playerLeft.getPaddle().getPositionX() && ball.getY() - 20 < playerLeft.getPaddle().getPositionY() + 150 && ball.getY() > playerLeft.getPaddle().getPositionY()) {
                    ball.setDirectionX(1);
                }
                if (ball.getX() < playerRight.getPaddle().getPositionX() && ball.getX() > playerRight.getPaddle().getPositionX() - 20 && ball.getY() - 20 < playerRight.getPaddle().getPositionY() + 150 && ball.getY() > playerRight.getPaddle().getPositionY()) {
                    ball.setDirectionX(-1);
                }
            }
        }, 0, 4);
    }
}
