
/**
 * Write a description of class Hat here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Hat
{
    private String color;
    private double size;
    private String wearer;
    public static int numHats;
    public Hat(String clr, double sz, String wr)
    {
        this.color = clr;
        this.size = sz;
        this.wearer = wr;
        numHats++;
    }
    
    public String getColor() {
        return this.color;
    }
    
    public void changeWearer(String nm) {
        this.wearer = nm;
        
    }
    public static void example() {
        System.out.print("This is a static method!");
    }
    
}
