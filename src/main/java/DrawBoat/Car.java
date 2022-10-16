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
public class Car extends Vehicle{
    private int w, h;

    public Car(int x, int y, int speedX, int speedY, Color color, int w, int h){
        super(x, y, speedX, speedY, color);
        this.w = w;
        this.h = h;
    }
    public void drawCar(Graphics g){
        g.setColor(this.getColor());
        g.fillRect(getDot().getX(), getDot().getY(), w, h);
        
        g.setColor(Color.blue);
        double w1 = w, w2 = w;
        double l = h;
        w1 *= 0.1; w2 *= 0.7;
        l *= 0.1;
        g.fillRect(getDot().getX() + (int)w1, getDot().getY() + (int)l, h/2, h/2);
        g.fillRect(getDot().getX() + (int)w2, getDot().getY() + (int)l, h/2, h/2);
        g.setColor(Color.BLACK);
        double x1 = w, x2 = w;
        double y = h;
        x1 *= 0.1; x2 *= 0.7;
        y *= 0.8;
        g.fillOval(getDot().getX() + (int)x1, getDot().getY() + (int)y, h/2, h/2);
        g.fillOval(getDot().getX() + (int)x2, getDot().getY() + (int)y, h/2, h/2);
    }
}
