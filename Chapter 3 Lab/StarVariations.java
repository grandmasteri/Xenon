
/**
 * Write a description of class StarVariations here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class StarVariations
{
    int largestRow;
    int currentRow;
    int shape;
    public StarVariations() {
    
        Scanner scan = new Scanner(System.in);
        System.out.println("What shape would you like? (Top Left Triangle(1), " +
        "Bottom Right Triangle(2), Top Right Triangle(3), or Diamond(4)");
        shape = scan.nextInt();
        System.out.println("What should the largest row be?");
        largestRow = scan.nextInt();
        
        //Top Left Triangle Creator
        if (shape == 1) {
            for (int i = largestRow; i > 0; i--) {
                currentRow = i;
                for(int in = currentRow; in > 0; in--) {
                    System.out.print("*");
                }
                System.out.println(" ");
            }
        }
        
        
        //Bottom Right Triangle creator
        //if (shape == 2) {
        //    for (int i; i <=largestRow; i++) {
                
        //}
    }
    
    public void makeSpaces(int x) {
        for(int i = 0; i < x; i++) {
            System.out.print(" ");
        }
    }
    
    public void makeStars(int y) {
        for(int i = 0; i < y; i++) {
            System.out.print("*");
        }
    }
}
