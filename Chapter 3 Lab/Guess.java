// ****************************************************************
//   Guess.java
//
//   Play a game where the user guesses a number from 1 to 10
//              
// ****************************************************************
import java.util.Scanner;
import java.util.Random;
 
public class Guess
{
    public static void main(String[] args)
        {
          int numToGuess;           //Number the user tries to guess
          int guess;                //The user's guess
          int numOfGuesses = 1;         //The number of guesses
          Scanner scan = new Scanner(System.in);
          Random generator = new Random();
 
          //randomly generate the  number to guess
          numToGuess = generator.nextInt(11);
          
          //print message asking user to enter a guess
          System.out.println("Guess a number from 1-10 if you dare");
          guess = scan.nextInt(); 
          
          
          //read in guess
                    
          while (guess != numToGuess)  //keep going as long as the guess is wrong
            {
                //increase number of guesses
                 numOfGuesses += 1;
                 
                //print message saying guess is wrong
                  System.out.println("That guess is wrong");
                  
                  if (guess < numToGuess) {
                    System.out.println("That guess is too low");
                }
                else {
                    System.out.println("That guess is too high");
                }
                  //get another guess from the user
                  System.out.println("Guess again?");
                  guess = scan.nextInt(); 
          }
 
          //print message saying guess is right
          System.out.println("That guess is right");
          if (guess > 1) {
              System.out.println("Still took you: " + numOfGuesses + " guesses tho.");
        }
    }
}
 