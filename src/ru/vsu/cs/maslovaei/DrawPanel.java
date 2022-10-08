package ru.vsu.cs.maslovaei;

import ru.vsu.cs.maslovaei.elements.*;

import javax.swing.*;
import java.awt.*;

public class DrawPanel extends JPanel {

    Moon moon;
    Road road;
    Building b1, b2, b3, b4, b5;
    Star star;
    Lantern lantern;

    public DrawPanel() {
        moon = new Moon(1650, 200, 100,
                new GradientPaint(1650, 200, new Color(0x9E9EA6), 1700, 250, new Color(0x757579)));
        road = new Road(1000, 900, 2000, 400);
        b1 = new Building(100, 550, 200, 300);
        b2 = new Building(275, 425, 150, 550);
        b3 = new Building(400, 600, 100, 200);
        b4 = new Building(525, 525, 150, 350);
        b5 = new Building(700, 650, 200, 100);
        lantern = new Lantern(1000,500,7,100);
        star = new Star();

    }

    @Override
    public void paint(Graphics gr) {
        super.paint(gr);
        Graphics2D g = (Graphics2D) gr;
        setBackground(new Color(0x052836));

        moon.drawMoon(g);
        road.drawRoad(g);
        b1.drawBuilding(g);
        b2.drawBuilding(g);
        b3.drawBuilding(g);
        b4.drawBuilding(g);
        b5.drawBuilding(g);
        lantern.drawLantern(g);
        star.draw(g);

    }
}

