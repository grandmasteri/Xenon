
/**
 * Write a description of class SportsDriver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SportsDriver
{
    
    /**
     * Constructor for objects of class SportsDriver
     */
    public static void main(String[] args)
    {
        Team ahsSoccer = new Team("Acalanes", 23);
        Athlete joe = new Athlete("Joe", 16);
        Athlete jill = new Athlete("Jill",16);
        System.out.println(jill.equals(jill));
        ahsSoccer.addAthlete(0, joe);
        System.out.println(ahsSoccer);
    }

}
