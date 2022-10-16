/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DrawBoat;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author DANIC
 */
public class Airplane extends Vehicle {
    private int h,w;
    
    public Airplane(int x, int y, int speedX, int speedY, Color color, int w, int h){
        super(x,y,speedX,speedY, color);
        this.h=h;
        this.w=w;
    }
    public void drawAirplne(Graphics g){
       g.setColor(this.getColor());
       g.fillOval(getDot().getX(), getDot().getY(), w+60, h+10);
       double x1 = w;
       double y = h;
       x1 *= 3.5;
       y *= -0.4;
       g.setColor(Color.black);
       g.fillOval(getDot().getX() + (int)x1, getDot().getY() + (int)y, h/2+10, h/2+10);
       g.setColor(this.getColor());
       double e1 =w, e2 =w;
       double l = h;
       e1 *= 2.9;
       l *= -2.8;
       g.fillOval(getDot().getX() + (int)e1, getDot().getY() + (int)l, h/2+5, h/2+50);
    }
}
