/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DrawBoat;
import javax.swing.*;

/**
 *
 * @author DANIC
 */
public class Swing01 {
    public static void main (String args[]){
        JFrame window = new JFrame("Swing");
        MyCanvas canvas = new MyCanvas();   //Draw ton canvas

        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setSize(700, 500);
        window.add(canvas);
        window.pack();  // set the "size of frame to preferred sizes"
        window.setResizable(false); // Do not change the size frame whit mouse
        window.setLocationRelativeTo(null); // center of window
        window.setVisible(true);
    }
}
