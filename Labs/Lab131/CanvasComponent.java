
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
    private int mouseToX;
    private int mouseToY;
    private int rectWidth;
    private int rectHeight;
    private boolean shapeSelected;
    private int animationDeltaX;
    private int animationDeltaY;
    private int gutterX;
    private int gutterY;
    /**
     * Constructor for objects of class CanvasComponent
     */
    public CanvasComponent(int w, int h)
    {
        width = w;
        height = h;
        setSize(width, height);
        xPosition = 150;
        yPosition = 150;
        rectWidth = 90;
        rectHeight = 100;
        this.addMouseListener(this);
        this.addMouseMotionListener(this);
        animationDeltaX = 1;
        animationDeltaY = 0;
        gutterX =10;
        gutterY = 10;
    }
    public void paintComponent(Graphics g){
        g.setColor(Color.blue);
        g.fillRect(xPosition, yPosition, rectWidth, rectHeight);
    }
    public void mouseClicked(MouseEvent e){
        
    }
    public void mousePressed(MouseEvent e){
        mouseFromX = e.getX();
        mouseFromY = e.getY();
        if(mouseFromX < xPosition && mouseFromY < mouseFromY){
            shapeSelected = true;
        }else{
            shapeSelected = false;
        }
        
    }
    public void mouseDragged(MouseEvent e){
        mouseToX = e.getX();
        mouseToY = e.getY();
        xPosition=mouseToX;//-mouseFromX;
        yPosition=mouseToY;//-mouseFromY;
        repaint();
    
    }
    public void actionPerformed(ActionEvent e){
        
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
    
}
