package com.actico.knowwhatsup;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import com.actico.knowwhatsup.ui.Paddle;

public class Controller implements KeyListener {

	private Paddle paddleLeft;
	private Paddle paddleRight;

	Controller(Paddle paddle1, Paddle paddle2) {
		this.paddleLeft = paddle1;
		this.paddleRight = paddle2;
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// NO OP
	}

	@Override
	public void keyPressed(KeyEvent e) {

		int keyCode = e.getKeyCode();

		if (keyCode == Side.LEFT.getUp() && paddleLeft.getPositionY() >= 20) {
			paddleLeft.setPositionY(paddleLeft.getPositionY() - 20);
		} else if (keyCode == Side.RIGHT.getUp() && paddleRight.getPositionY() >= 20) {
			paddleRight.setPositionY(paddleRight.getPositionY() - 20);
		} else if (keyCode == Side.LEFT.getDown() && paddleLeft.getPositionY() <= 400) {
			paddleLeft.setPositionY(paddleLeft.getPositionY() + 20);
		} else if (keyCode == Side.RIGHT.getDown() && paddleRight.getPositionY() <= 400) {
			paddleRight.setPositionY(paddleRight.getPositionY() + 20);
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// No OP
	}

}
