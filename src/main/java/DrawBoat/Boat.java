/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DrawBoat;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;
/**
 *
 * @author DANIC
 */
public class Boat extends Vehicle {
    private int w,h;
    
    public Boat(int x, int y, int speedX, int speedY, Color color, int w, int h){
        super(x, y, speedX, speedY, color);
        this.w = w;
        this.h = h;
    }
    
    public void drawBoat(Graphics g){
        g.setColor(this.getColor());
        //g.fillPolygon(ConfigBoat.BASE_X, ConfigBoat.BASE_Y, 4);
        g.fillRect(getDot().getX(), getDot().getY(), w, h);
        g.setColor(Color.WHITE);
        double x1 = w, x2 = w;
        double y=h;
        x1 *=0.4; x2*=0.4;
        y*=-0.9;
        
        Polygon triangle = new Polygon();
        triangle.addPoint(getDot().getX() + (int)x1+20, getDot().getY() + (int)y-20);
        triangle.addPoint(getDot().getX() + (int)x1 - 60 , getDot().getY() + (int)y +50);
        triangle.addPoint(getDot().getX() + (int)x1 +20, getDot().getY() + (int)y +50);
        g.fillPolygon(triangle);
        
        Polygon triangle2 = new Polygon();
        triangle2.addPoint(getDot().getX() + (int)x2 +30, getDot().getY() + (int)y-20);
        triangle2.addPoint(getDot().getX() + (int)x2 +30, getDot().getY() + (int)y +50);
        triangle2.addPoint(getDot().getX() + (int)x2 +110, getDot().getY() + (int)y +50);
        g.fillPolygon(triangle2);
        
        //g.setColor(Color.blue);
        //g.fillRect(0,0, 500 , 120);
        
        //g.fillPolygon(ConfigBoat.PUNTOS_VELAS_X, ConfigBoat.PUNTOS_VELAS_Y, 3);
        //g.fillPolygon(ConfigBoat.PUNTOS_VELAS2_X, ConfigBoat.PUNTOS_VELAS2_Y, 3);
        //g.setColor(ConfigBoat.COLOR_BROWN);
        //g.fillPolygon(ConfigBoat.PUNTOS_MASTIL_X, ConfigBoat.PUNTOS_MASTIL_Y, 4);
        //g.setColor(Color.blue);
        //g.fillRect(0,0, 500 , 150);
        
    }
}
