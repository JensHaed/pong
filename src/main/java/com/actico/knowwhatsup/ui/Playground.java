package com.actico.knowwhatsup.ui;

import java.awt.*;

import javax.swing.*;

import com.actico.knowwhatsup.Ball;
import com.actico.knowwhatsup.Player;

public class Playground extends JLabel {

	private final int screenWidth;
	private final int screenHeight;
    @SuppressWarnings("squid:S1948")
	private Player player1;
	@SuppressWarnings("squid:S1948")
	private Player player2;
	@SuppressWarnings("squid:S1948")
	private Ball ball;

	public Playground(int width, int height) {
		setBounds(0, 0, width, height);
		this.screenWidth = width;
		this.screenHeight = height;
	}

	@Override
	protected void paintComponent(Graphics graphics) {
		super.paintComponent(graphics);
		Graphics2D graphics2D = (Graphics2D) graphics;

		graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		graphics.setColor(Color.BLACK);
		graphics.fillRect(0, 0, screenWidth, screenHeight);

		createMiddleLine(graphics);

		// draw paddle left-hand side
		Paddle paddleLeft = player1.getPaddle();
		paddleLeft.draw(graphics);

		// drow paddle right-hand side

		Paddle paddleRight = player2.getPaddle();
		paddleRight.draw(graphics);

		drawPlayerInformation(graphics);

		// Draw the ball
		graphics.fillRect(ball.getX(), ball.getY(), ball.getSize().width, ball.getSize().height);

		repaint();
	}

	private void drawPlayerInformation(Graphics graphics) {
		graphics.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 30));
		graphics.drawString(player1.getName(), 10, 30);
		graphics.drawString(player1.getScore() + "", screenWidth / 2 - 80, 30);
		graphics.drawString(player2.getName(), screenWidth / 2 + 15, 30);
		graphics.drawString(player2.getScore() + "", screenWidth - 80, 30);
	}

	private void createMiddleLine(Graphics graphics) {
		graphics.setColor(Color.WHITE);

		for (int i = 0; i < 31; i++) {
			graphics.fillRect(screenWidth / 2 - 5, i * 20, 10, 10);
		}
	}

	public void setPlayer1(Player player1) {
		this.player1 = player1;
	}

	public void setPlayer2(Player player2) {
		this.player2 = player2;
	}

	public void setBall(Ball ball) {
		this.ball = ball;
	}
}
