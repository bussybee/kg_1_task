package ru.vsu.cs.maslovaei.elements;

import java.awt.*;

public class Lantern {
    public final int x,y,width,height;

    public Lantern(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public void drawLantern(Graphics2D g){
        g.setColor(Color.yellow);
        g.fillRect(
                x - width / 2,
                y - height / 4,
                2 * width,
                2 * height);
        g.fillRect(x-5*width/2,y+5*height/3,6*width,height/6);
        g.fillRect(x-9*width/2, y-2*height/3,10*width,height/2);
        g.fillRect(x-13*width/2,y-3*height/4,14*width,height/6);
        g.fillRoundRect(x-9*width/2,y-7*height/6,10*width,height/2,30,80);
        g.fillOval(x-3*width/4,y-9*height/7,20,20);
    }
}
