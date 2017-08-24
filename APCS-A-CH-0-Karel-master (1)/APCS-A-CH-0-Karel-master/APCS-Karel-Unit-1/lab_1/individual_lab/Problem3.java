package lab_1.individual_lab;
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem3 extends Robot
{
    public Problem3(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void giveCarlBeeper() {
        turnRight();
        Move3();
        putBeeper();
        turn180();
        Move3();
        turnRight();
    }
    
    public void pickAndMoveBeeper() {
        pickBeeper();
        turnLeft();
        Move2();
        putBeeper();
        turn180();
        Move2();
        turnLeft();
    }
   
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
        
    }
        
    public void Move2() {
        move();
        move();
        
    }
    
    public void Move3() {
        move();
        move();
        move();
        
    }
    
    public void turn180() {
        turnLeft();
        turnLeft();
        
    }
}