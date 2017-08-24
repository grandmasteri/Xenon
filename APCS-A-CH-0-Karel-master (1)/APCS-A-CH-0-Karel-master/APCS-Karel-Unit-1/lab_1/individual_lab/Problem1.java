package lab_1.individual_lab;
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem1 extends Robot
{
    public Problem1(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void rearrangeBeepers() {
        turnLeft();
        M2();
        turnRight();
        M2();
        turnRight();
        pickMoveX5();
        turnRight();
        M2();
        turnRight();
        M3();
        turnRight();
        putMoveX5();
        turnRight();
        M2();
        turnRight();
        M3();
        turnRight();
        
        
    }
   public void putMoveX5() {
       putBeeper();
       move();
       putBeeper();
       move();
       putBeeper();
       move();
       putBeeper();
       move();
       putBeeper();
       move();
    }
    public void pickMoveX5() {
        pickBeeper();
        move();
        pickBeeper();
        move();
        pickBeeper();
        move();
        pickBeeper();
        move();
        pickBeeper();
        move();
        
    }
    public void M2() {
        move();
        move();
    }
    public void M3() {
        move();
        move();
        move();
    }
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
}