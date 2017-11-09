
/**
 * Write a description of class Athlete here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Athlete
{
    // instance variables - replace the example below with your own
    private int age;
    private String name;

    /**
     * Constructor for objects of class Athlete
     */
    public Athlete(String nm, int yr)
    {
        // initialise instance variables
        this.age = yr;
        this.name = nm;
    }

    public String toString() {
        return "This athlete is " + age + " years old, and named " + name + ".";
    }
    
    public boolean equals(Athlete other) {
        if(this.name.equals(other.name) && this.age == other.age) {
            return true;
        }
        else {
            return false;
        }
    }
}
