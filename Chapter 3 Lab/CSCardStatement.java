import java.util.Scanner;
/**
 * Write a description of class CSCardStatement here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CSCardStatement
{
   
    /**
     * Constructor for objects of class CSCardStatement
     */
    public static void CSCardStatement() {
        //initialize variables
        double previousMonth, additionalCharges, interestRate, interest, newBalance, minimumPayment;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print ("Enter the previous month's balance: ");
        previousMonth = scan.nextDouble();
        System.out.print ("Enter additional charges this month: ");
        additionalCharges = scan.nextDouble();
        
        //initialize interest Rate
        if (previousMonth == 0) {
            interestRate = 0;
        }
        else {
            interestRate = 0.02;
        }
        
        
        //calculate total balance and minimum payment due
        newBalance = (previousMonth + additionalCharges)*(1 + interestRate);
        
        //initialize interest
        interest = (previousMonth + additionalCharges)*(interestRate);
        //initialize minimum Payment
        if (newBalance < 50) {
            minimumPayment = newBalance;
        }
        else if (newBalance >= 50 && newBalance <= 300) {
            minimumPayment = 50;
        }
        else {
            minimumPayment = 0.2*newBalance;
        }
        
        //Print ayerthing
        System.out.println("CS CARD International Statement");
        System.out.println("===============================");
        System.out.println("Previous Balance:\t" + previousMonth + "$");
        System.out.println("Additional Charges:\t" + additionalCharges + "$");
        System.out.println("Interest:\t\t" + interest + "$");
        System.out.println(" ");
        System.out.println("New Balance:\t\t" + newBalance + "$");
        System.out.println(" ");
        System.out.println("Minimum Payment:\t" + minimumPayment + "$");
    }
}