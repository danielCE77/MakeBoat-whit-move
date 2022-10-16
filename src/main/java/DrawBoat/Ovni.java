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
public class Ovni extends Vehicle{
    private int w, h;
    
    public Ovni(int x, int y, int speedX, int speedY, Color color, int w, int h){
        super(x,y,speedX,speedY, color);
        this.w = w;
        this.h = h;
    }
    
    public void drawOvni(Graphics g){
        //g.setColor(this.getColor());
        //g.fillOval(getDot().getX(), getDot().getY(), w, h+10);
        g.setColor(Color.gray);
        double x1 = w, x2 = w;
        double y = h;
        x1 *= 0.6; x2 *= 0.7;
        y *= -0.9;
        g.fillOval(getDot().getX() + (int)x1, getDot().getY() + (int)y, h/2+10, h+10);
        g.setColor(this.getColor());
        g.fillOval(getDot().getX(), getDot().getY(), w+20, h+10);
    }
}
