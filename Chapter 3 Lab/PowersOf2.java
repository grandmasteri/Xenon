// ****************************************************************
//   PowersOf2.java
//
//   Print out as many powers of 2 as the user requests
//              
// ****************************************************************
import java.util.Scanner;
import java.lang.Math;
public class PowersOf2
{
        public static void main(String[] args)
        {
            int numPowersOf2;        //How many powers of 2 to compute
            int nextPowerOf2 = 1;        //Current power of  2
            int exponent = 2;                //Exponent for current power of 2 -- this
                                         //also serves as a counter for the loop
            Scanner scan = new Scanner(System.in);
 
            System.out.println("How many powers of 2 would you like printed? (1 or greater and integers only)");
            numPowersOf2 = scan.nextInt();
            
            //print a message saying how many powers of 2 will be printed
            //initialize exponent -- the first thing printed is 2 to the what?
            System.out.println("Here are the first " + numPowersOf2 + " powers of 2:");
            while (numPowersOf2 != (nextPowerOf2 - 1)) {
                
                    //print out current power of 2
                System.out.println(exponent);
 
                //find next power of 2 -- how do you get this from the last one?
                nextPowerOf2++;
                
                //increment exponent
                exponent *= 2;
                
            }
        }
}