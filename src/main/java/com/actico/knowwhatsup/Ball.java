package com.actico.knowwhatsup;


import java.awt.*;
import java.util.Timer;
import java.util.TimerTask;



public class Ball {
    private int x;
	private int y;
	private int directionX = 1;
	private int directionY = -1;
	private Rectangle size = new Rectangle(20,20);

	Ball() {
		Timer movement = new Timer();
		movement.scheduleAtFixedRate(new TimerTask() {
			@Override
			public void run() {

				x += directionX;
				y += directionY;
			}
		}, 0, 5);
	}

	public int getX() {
		return x;
	}

	void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	void setY(int y) {
		this.y = y;
	}

	public Rectangle getSize() {
		return size;
	}

	void setDirectionX(int directionX) {
		this.directionX = directionX;
	}

	void setDirectionY(int directionY) {
		this.directionY = directionY;
	}

}
