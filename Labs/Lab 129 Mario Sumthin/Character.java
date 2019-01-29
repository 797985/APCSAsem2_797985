
/**
 * Write a description of class Character here.
 *
 * @author (Nick Gonzales)
 * @version (1/29)
 */
public class Character
{
    // instance variables - replace the example below with your own
    private int x;
    String catchphrase;
    int speed;
    public void setCatchphrase(String saying){
        catchphrase = saying;
        
        
    }
    public String getCatchphrase()
    {
        return catchphrase;

    }
    public void setSpeed(String movement)
    /**
     * Constructor for objects of class Character
     */
    public Character()
    {
        
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
}
