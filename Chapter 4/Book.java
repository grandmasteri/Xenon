
/**
 * Write a description of class Book here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Book
{
    private Author author;
    private String title;
    /**
     * Constructor for objects of class Book
     */
    public Book(Author oth, String tit)
    {
        this.author = oth;
        this.title = tit;
    }
    
    public String toString() {
        return "This book's title is " + title + " and the author is " + author + ".";
    }
}
