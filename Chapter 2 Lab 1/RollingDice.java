import java.util.Random;

public class RollingDice
{
    public static void main(String[] args)
    {
        Random generator = new Random();
        int dice1, dice2, total;
        dice1 = generator.nextInt(5) + 1;
        dice2 = generator.nextInt(5) + 1;
        total = dice1 + dice2;
        System.out.println ("Dice 1 rolled a: " + dice1);
        System.out.println ("Dice 2 rolled a: " + dice2);
        System.out.println ("Total sum is: " + total);
    }
}
