package ru.vsu.cs.maslovaei.elements;

import java.awt.*;

public class Human {

    public final int r, x, y, width, height;
    public Color color;

    public Human(int r, int x, int y, int width, int height, Color color) {
        this.r = r;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public void draw(Graphics2D g) {
        g.setColor(color);
        g.fillOval(x - r, y - r, 2 * r, 2 * r);
        g.fillRoundRect(
                x - width / 2,
                y - height / 2,
                2 * width,
                2 * height,
                2 * width,
                2 * width);


    }
}
