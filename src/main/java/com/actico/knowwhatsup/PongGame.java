package com.actico.knowwhatsup;

import java.util.Scanner;

import com.actico.knowwhatsup.ui.Frame;
import com.actico.knowwhatsup.ui.Paddle;
import com.actico.knowwhatsup.ui.Playground;

public class PongGame {

	private static String namePlayerOne = "Jens";
	private static String namePlayerTow = "name";

	public static void main(String[] args) {
		Frame frame = new Frame("Pong Game");
		Paddle paddleLeft = new Paddle(10);
		Paddle paddleRight = new Paddle(frame.getScreenWidth() - 10 - 25);
		Controller controller = new Controller(paddleLeft, paddleRight);
		frame.addKeyListener(controller);

		Scanner scanner = new Scanner(System.in);
		System.out.println("Player 1 please enter your name:");
		namePlayerOne = scanner.next();
		System.out.println("Player 2 please enter your name:");
		namePlayerTow = scanner.next();
		scanner.close();

		Player playerOne = new Player(namePlayerOne);
		Player playerTwo = new Player(namePlayerTow);
		playerOne.setPaddle(paddleLeft);
		playerTwo.setPaddle(paddleRight);

		Playground playground = new Playground(frame.getScreenWidth(), frame.getScreenHeight());
		playground.setPlayer1(playerOne);
		playground.setPlayer2(playerTwo);

		Ball ball = new Ball();
		ball.setX(frame.getScreenWidth() / 2 - 10);
		ball.setY(frame.getScreenHeight() / 2 - 20);
		playground.setBall(ball);
		playground.setVisible(true);

		frame.add(playground);
		frame.open();
		BallCollision ballCollision = new BallCollision(ball, frame, playerOne, playerTwo);
		ballCollision.check();

	}

}
