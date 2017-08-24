package lab_1.individual_lab;
import kareltherobot.*; 


/**
 * @author :  I. Douglas
 */
public class Problem2 extends Robot
{
    public Problem2(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void shuttleRace() {
        turnLeft();
        move();
        Rightn2();
        Rightn2();
        Leftn2();
        Leftn2();
        Leftn2();
        Leftn2();
        Rightn2();
        turnRight();
        move();
    }
   
    public void Move2() {
        move();
        move();
    }
    
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
    
    public void Rightn2() {
        turnRight();
        Move2();
    }
    
    public void Leftn2() {
        turnLeft();
        Move2();
    }
}