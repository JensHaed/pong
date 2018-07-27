package com.actico.knowwhatsup.ui;

import java.awt.*;

import javax.swing.*;

@SuppressWarnings("squid:MaximumInheritanceDepth")
public class Frame extends JFrame {

	private int screenWidth = 900;
	private int screenHeight = 600;

	public Frame(String title) {
		super(title);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setSize(screenWidth + 15, screenHeight);
		setLayout(null);
		setLocationRelativeTo(null);
		setBackground(Color.BLACK);
		requestFocus();
	}

	public void open() {
		setVisible(true);
	}

	@Override
	public void update(Graphics graphics) {
        // NO OP
	}

	public int getScreenWidth() {
		return screenWidth;
	}

	public int getScreenHeight() {
		return screenHeight;
	}
}
