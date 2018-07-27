package com.actico.knowwhatsup;

import java.awt.event.KeyEvent;

public enum Side {

    LEFT(KeyEvent.VK_W, KeyEvent.VK_S),
    RIGHT(KeyEvent.VK_UP, KeyEvent.VK_DOWN);

    private int up;
    private int down;

    Side(int up, int down) {

        this.up = up;
        this.down = down;
    }

    public int getUp() {
        return up;
    }

    public int getDown() {
        return down;
    }
}
