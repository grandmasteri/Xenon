
/**
 * Write a description of class MultiplicationTable here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MultiplicationTable
{
    int currentNumber = 1;
    int currentDifference = 1;
    int startingNumber = 1;
    /**
     * Constructor for objects of class MultiplicationTable
     */
    public MultiplicationTable() {
        for (int i = 0; i < 12; i++) {
        
            for (int in = 0; in < 12; in++) {
                System.out.print(currentNumber + "\t");
                currentNumber += currentDifference;
            }
            System.out.println(" ");
            System.out.println(" ");
            startingNumber++;
            currentNumber = startingNumber;
            currentDifference++;
        }
    }
}
