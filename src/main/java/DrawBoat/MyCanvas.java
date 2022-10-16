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
    
    public MyCanvas(){
       setPreferredSize(new Dimension(ConfigBoat.WINDOW_W,ConfigBoat.WINDOW_H));
       setBackground(Color.CYAN);
       Timer timer = new Timer(90, this);
       timer.start();
       //125, 292, 200, 60
       boats.add(new Boat(20, 292, 4, 0, Color.GRAY, 200,60));
       boats.add(new Boat(20, 152, 4, 0, Color.BLACK, 200,60));
    }
    
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        Paintbrush paintbrush = new Paintbrush(g);
        paintbrush.drawSky();
        paintbrush.drawMountains();
        for(Boat b : boats){
            b.move();
            b.drawBoat(g);
        }
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
    }
    
}
