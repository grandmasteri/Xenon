
/**
 * Write a description of class Student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class Student
{
    // instance variables - replace the example below with your own
    private String name;
    private double score1;
    private double score2;
    Scanner scan = new Scanner(System.in);
    /**
     * Constructor for objects of class Student
     */
    public Student(String nm)
    {
        this.name = nm;
    }
    
    public String getName() {
        return name;
    }
    
    public void inputGrades() {
        System.out.println("Enter student's first test grade.");
        score1 = scan.nextDouble();
        System.out.println(score1);
        System.out.println("Enter student's second test grade.");
        score2 = scan.nextDouble();
        System.out.println(score2);
    }
    
    public double getAverage() {
        return (score1 + score2)/2;
    }
    
    public String toString() {
        return "Name: " + name + " Test1: " + score1 + " Test2: " + score2;
    }
    
    public void printName() {
        System.out.println(name);
    }
}
