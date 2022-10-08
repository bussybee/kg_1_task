package ru.vsu.cs.maslovaei.elements;

import java.awt.*;
import java.awt.geom.GeneralPath;
import java.util.Random;

public class Star {
    public void draw(Graphics2D g) {
        int pointX[] = {9, 15, 0, 18, 3};
        int pointY[] = {0, 18, 6, 6, 18};

        GeneralPath star = new GeneralPath();

        star.moveTo(pointX[0], pointY[0]);
        for (int i = 1; i < pointX.length; i++) {
            star.lineTo(pointX[i], pointY[i]);
        }
        star.closePath();

        Random random = new Random();
        int x = random.nextInt(100);
        int y = random.nextInt(100);
        for (int j = 1; j <= 20; j++) {
            int R = (int) (Math.random() * 256);
            int G = (int) (Math.random() * 256);
            int B = (int) (Math.random() * 256);
            g.setColor(new Color(R, G, B));
            g.translate(x, y);
            g.fill(star);
        }
    }


}
