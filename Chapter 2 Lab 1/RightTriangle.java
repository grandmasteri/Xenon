
import java.util.Scanner;

/**
 * Write a description of class RightTriangle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RightTriangle
{
    public static void main (String[] args) {
        Scanner keyboard = new Scanner(System.in);
          double side1, side2;  // lengths of the sides of a right triangle
          double hypotenuse;        // length of the hypotenuse
 
          // Get the lengths of the sides as input
          System.out.print ("Please enter the length of the side of a right triangle");
        side1 = keyboard.nextDouble();
        
        System.out.print ("Please enter the length of the side of a right triangle");
        side2 = keyboard.nextDouble();
          
     
 
          // Compute the length of the hypotenuse
          hypotenuse = Math.sqrt((Math.pow(side1, 2)) + (Math.pow(side2, 2)));
     
 
          // Print the result
          System.out.println ("Length of the hypotenuse: " + hypotenuse);
    }
}
