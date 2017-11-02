
/**
 * Write a description of class Grades here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Grades
{
    
    /**
     * Constructor for objects of class Grades
     */
    public static void main(String[] args)
    {
        Student shelly = new Student("Shelly");
        Student mark = new Student("Mark");
        shelly.inputGrades();
        mark.inputGrades();
        System.out.println("The average for Shelly is " + shelly.getAverage() + ".");
        System.out.println("The average for Mark is " + mark.getAverage() + ".");
        
    }
}
