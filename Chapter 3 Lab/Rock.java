//   Play Rock, Paper, Scissors with the user
//          
// ****************************************************************
import java.util.Scanner;
import java.util.Random;
public class Rock
{
    public boolean playAgain = true;
    public String YorN;
    public void main(String[] args)
    {
        while (playAgain = true) {
        String personPlay;    //User's play -- "R", "P", or "S"
        String computerPlay;  //Computer's play -- "R", "P", or "S"
        int computerInt;      //Randomly generated number used to determine
                              //computer's play
                            
        Scanner scan = new Scanner(System.in);                      
        
        Random generator = new Random();
        //Make player's play uppercase for ease of comparison
        System.out.println("Select weapon. Rock (R), Paper (P), or Scissors(S)");
       
        //Get player's play -- note that this is stored as a string
        personPlay = scan.next();
        personPlay.toUpperCase();
        
        //Generate computer's play (0,1,2)
        computerInt = generator.nextInt(3);
        
        //Translate computer's randomly generated play to string
        if (computerInt == 0) {
            computerPlay = "R";
        }
        else if (computerInt == 1) {
            computerPlay = "P";
        }
        else {
            computerPlay = "S";
        }
        
        //Print computer's play
        System.out.println("The computer played: " + computerPlay);
        
        //calculate winner
        if (personPlay.equals("R")) {
            if (computerPlay.equals("R")) {
                System.out.println("It's a draw");
            }
            if (computerPlay.equals("S")) {
                System.out.println("You Win!");
            }
            if (computerPlay.equals("P")) {
                System.out.println("You Lose :(");
            }
        }
        if (personPlay.equals("S")) {
            if (computerPlay.equals("R")) {
                System.out.println("You Lose :(");
            }
            if (computerPlay.equals("S")) {
                System.out.println("I's a draw!");
            }
            if (computerPlay.equals("P")) {
                System.out.println("You Win!");
            }
        }
        if (personPlay.equals("P")) {
            if (computerPlay.equals("R")) {
                System.out.println("You Win!");
            }
            if (computerPlay.equals("S")) {
                System.out.println("You Lose");
            }
            if (computerPlay.equals("P")) {
                System.out.println("It's a draw");
            }
        }
        
        
        
    }
    }
    }
