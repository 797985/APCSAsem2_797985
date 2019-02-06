
/**
 * Write a description of class MySwingApplication here.
 *
 * @author (Nick Gonzales)
 * @version (2/4/19)
 */

import javax.swing.*;
public class MySwingApplication implements Runnable
{
    JFrame jFrame; //first class name
    public void run(){
         jFrame = new JFrame("Window");
         jFrame.setSize(400, 400);
         jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         CanvasComponent component = new CanvasComponent(100, 100);
         jFrame.add(component);
         jFrame.setVisible(true);
         
    }
    public static void main(){
        MySwingApplication mySwingApplicationSwing = new MySwingApplication();
        javax.swing.SwingUtilities.invokeLater(mySwingApplicationSwing);
    }
    
}
