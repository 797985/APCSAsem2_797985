
/**
 * Write a description of class CanvasComponent here.
 *
 * @author (Nick Gonzales)
 * @version (2/4/19)
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class CanvasComponent extends JComponent implements MouseListener, MouseMotionListener
{
    // instance variables - replace the example below with your own
    private int xPosition;
    private int yPosition;    
    private int width;
    private int height;
    private int mouseFromX;
    private int mouseFromY;
    private boolean shapeSelected;
    /**
     * Constructor for objects of class CanvasComponent
     */
    public CanvasComponent(int w, int h)
    {
        w = width;
        h = height;
        setSize(width, height);
        xPosition = 150;
        yPosition = 150;
        
    }
    public void paintComponent(Graphics g){
        g.setColor(Color.blue);
        g.fillRect(width, height, xPosition, yPosition);
    }
    public void mouseClicked(MouseEvent e){
        
    }
    public void mousePressed(MouseEvent e){
        mouseFromX = e.getX();
        mouseFromY = e.getY();
        if(mouseFromX < xPosition&&mouseFromY < mouseFromY){
            return shapeSelected(true);
        }else{
            return shapeSelected(false);
        }
        if(shapeSelected == true){
             System.out.print("hi");
            }
    }
    public void mouseReleased(MouseEvent e){
        
    }
    public void mouseEntered(MouseEvent e){
        
    }
    public void mouseExited(MouseEvent e){
        
    }
    public void mouseMoved(MouseEvent e){
        
    }
    public void MouseMotionListener(MouseEvent e){
        
    }
    public void addMouseListener(MouseListener l){
        
    }
    public void mouseDragged(MouseEvent e){
        
    }
}
