package ru.vsu.cs.maslovaei.elements;

import java.awt.*;
import java.awt.geom.GeneralPath;

public class Road {
    public final int x, y, width, height;

    public Road(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public void drawRoad(Graphics2D g){
        g.setColor(Color.black);
        g.fillRect(x-width/2,y-height/2,width,height);
        g.setColor(new Color(0x4F4F54));
        g.fillRect(x-width/2,y-height/4,width,height/4);

        int[] xPoints = {10, 40, 45, 15};
        int[] yPoints = {10, 10, 15, 15};

        GeneralPath lines = new GeneralPath();
        lines.moveTo(xPoints[0], yPoints[0]);
        for (int i = 1; i < xPoints.length; i++) {
            lines.lineTo(xPoints[i], yPoints[i]);
        }
        lines.closePath();
        for (int i =0; i <20;i++) {
            g.setColor(Color.white);
            g.fillRect(100*i,y-height/7,50,7);
        }
    }
}
