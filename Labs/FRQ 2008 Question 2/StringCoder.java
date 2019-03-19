
/**
 * Write a description of class StringCoder here.
 *
 * @author (Nick Gonzales)
 * @version (3/19/19)
 */
public class StringCoder
{
    private String masterString;
    public StringCoder(String master){
        masterString = master;
    }
    
    public String decodeString(ArrayList<StringPart> parts){
        for(StringPart nextPart : parts){
            int ending = nextPart.getStart() + nextPart.getLength();
            masterString.substring(nextPart.getStart(), ending);
        }
    }
}
