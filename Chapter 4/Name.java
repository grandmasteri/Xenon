
/**
 * Write a description of class Name here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Name
{
    // instance variables - replace the example below with your own
    private String first;
    private String middle;
    private String last;
    /**
     * Constructor for objects of class Name
     */
    public Name(String fst, String md, String lst)
    {
        this.first = fst;
        this.middle = md;
        this.last = lst;
    }
    
    public String getFirst() {
        return first;
    }
    
    public String getMiddle() {
        return middle;
    }
    
    public String getLast() {
        return last;
    }
    
    public String firstMiddleLast() {
        return first + " " + middle + " " + last;
    }
    
    public String lastFirstMiddle() {
        return last + ", " + first + " " + middle;
    }
    public boolean equals(Name other) {
        if (this.firstMiddleLast().equals(other.firstMiddleLast())) {
            return true;
        }
        else {
            return false;
        }
    }
}
