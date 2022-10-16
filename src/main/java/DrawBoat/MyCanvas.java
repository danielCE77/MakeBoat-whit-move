/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DrawBoat;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.Timer;
/**
 *
 * @author DANIC
 */
public class MyCanvas extends JPanel implements ActionListener{
    ArrayList<Boat> boats = new ArrayList<Boat>();
    ArrayList<Car> cars = new ArrayList<Car>();
    ArrayList<Ovni> ovnis = new ArrayList<Ovni>();
    ArrayList<Airplane> airplane = new ArrayList<Airplane>();
    
    public MyCanvas(){
       setPreferredSize(new Dimension(ConfigBoat.WINDOW_W,ConfigBoat.WINDOW_H));
       setBackground(Color.CYAN);
       Timer timer = new Timer(100, this);
       timer.start();
       //125, 292, 200, 60
       boats.add(new Boat(20, 450, 4, 0, Color.GRAY, 200,60));
       boats.add(new Boat(20, 350, 2, 0, Color.BLACK, 200,60));
       boats.add(new Boat(0, 300, 1, 0, Color.magenta, 200,60));
       cars.add(new Car (10, 100, 2, 0, Color.GREEN, 60, 30));
       cars.add(new Car (10, 150, 1, 0, Color.red, 60, 30));
       cars.add(new Car (50, 150, 2, 0, Color.YELLOW, 60, 30));
       ovnis.add(new Ovni(100, 50, 3, -1, Color.DARK_GRAY, 30,10));
       ovnis.add(new Ovni(180, 60, 1, -1, Color.BLACK, 30, 10));
       ovnis.add(new Ovni(300, 60, 3, 1, Color.black, 30, 10));
       airplane.add(new Airplane(0, 50, 1, -1, Color.ORANGE, 10, 5));
       airplane.add(new Airplane(30, 90, 1, -1, Color.darkGray, 10, 5));
       airplane.add(new Airplane(200, 90, 2, 1, Color.lightGray, 10, 5));
    }
    
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        Paintbrush paintbrush = new Paintbrush(g);
        paintbrush.drawSky();
        paintbrush.drawMountains(15,120,100,40,180,120);
        paintbrush.drawMountains(180,120,250,40,350,120);
        paintbrush.drawMountains(100,120,175,40,250,100);
        paintbrush.drawMountains(200,175,350,50,400,175);
        paintbrush.drawHighway();
        for(Boat b : boats){
            b.move();
            b.drawBoat(g);
        }
        for (Car c : cars){
            c.move();
            c.drawCar(g);
        }
        for (Ovni o : ovnis){
            o.move();
            o.drawOvni(g);
        }
        for (Airplane a : airplane){
            a.move();
            a.drawAirplne(g);
        }
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
    }
    
}
