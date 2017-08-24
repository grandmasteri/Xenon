package lab_1.pair_programming;
import kareltherobot.*; 


/**
 * @author :  I. Douglas
 */
public class BeeperBot extends Robot
{
    public BeeperBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void findAllBeepers() {
        turnLeft();
        M3();
        turnLeft();
        M2();
        pickBeeper();
        M3();
        pickBeeper();
        turnLeft();
        M3();
        pickBeeper();
        turnLeft();
        M3();
        pickBeeper();
        M2();
    }
   public void turnRight() {
       turnLeft();
       turnLeft();
       turnLeft();
    }

   public void M3() {
       move();
       move();
       move();
    }
    
    public void M2() {
        move();
        move();
    }
}

