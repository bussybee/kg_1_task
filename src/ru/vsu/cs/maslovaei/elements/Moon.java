package ru.vsu.cs.maslovaei.elements;

import java.awt.*;

public class Moon {
    public final int x, y, r;
    public GradientPaint p;
    public Color c;

    public Moon(int x, int y, int r, GradientPaint p) {
        this.x = x;
        this.y = y;
        this.r = r;
        this.p = p;
    }

    public Moon(int x, int y, int r, Color c) {
        this.x = x;
        this.y = y;
        this.r = r;
        this.c = c;
    }

    public void drawMoon(Graphics2D g) {
        g.setPaint(p);
        g.fillOval(x - r, y - r, 2 * r, 2 * r);

        g.setColor(new Color(0x62626B));
        g.fillOval(x-3*r/4,y+r/3,r/6,r/6);
        g.fillOval(x-3*r/5,y+r/8,r/6,r/6);
        g.fillOval(x-5*r/6,y+r/10,r/6,r/6);
        g.fillOval(x+r/10,y+r/4,r/2,r/2);
        g.fillOval(x+r/2,y+r/100,r/3,r/3);
        g.fillOval(x-r/2,y-r/2,r/3,r/3);
        g.fillOval(x+r/5,y-3*r/5,r/2,r/2);
    }

}
