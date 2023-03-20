package ru.vsu.cs.maslovaei.elements;

import ru.vsu.cs.maslovaei.Drawable;

import java.awt.*;

public class Building implements Drawable {
    public final int x, y, width, height;

    public Building(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public void draw(Graphics2D g) {
        Color oldColor = g.getColor();
        g.setColor(Color.black);
        g.fillRect(x - width / 2, y - height / 2, width, height);
        int m = height / 100;
        g.setColor(Color.yellow);
        for (int i = 1; i < 3; i++) {
            g.fillRect((int) (x - Math.pow(-1, i) * width / 4), (int) (y - Math.pow(-1, i) * height / 4), 5, 10);
        }

        for (int i = 1; i < 3; i++) {
            g.fillRect((int) (x - Math.pow(-1, i) * width / 4), (int) (y + Math.pow(-1, i) * height / 4), 5, 10);
        }
        g.setColor(oldColor);
    }
}
