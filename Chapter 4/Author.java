
/**
 * Write a description of class Author here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Author
{
    private String name;
    private int age;

    /**
     * Constructor for objects of class Author
     */
    public Author(String nm, int ae)
    {
        this.name = nm;
        this.age = ae;
    }
    public String toString() {
        return "This author's name is " + name + " and his age is " + age + ".";
    }
        
}
