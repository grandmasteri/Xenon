package lab_3.individual_lab;

import kareltherobot.*;
import java.awt.Color;

public class Problem2 extends Robot
{
   
    /**
     * Constructor for objects of class Problem1
     */
    public Problem2(int st, int av, Direction dir, int beep)
    {
        super(st, av, dir, beep);
    }
    int number = 8;
    public void carpetSmallRooms(){
        carpetXSmallRooms();
    }
    public void carpetXSmallRooms() {
        for (int i = 0; i < number; i++) {
            carpetSmallRoom();
        }
    }
        
    public void carpetSmallRoom() {
        move();
        turnLeft();
        move();
        if (isRoom()) {
            putBeeper();
        }
        turn180();
        move();
        turnLeft();
    }
        
    public boolean isRoom() {
        if (checkLeftWall() && checkRightWall() && checkCeiling()) {
            return true;
        }
        else {
             return false;
        }
    }
    public boolean checkLeftWall() {
        turnLeft();
        if (frontIsClear()) {
            turnRight();
            return false;
        }
        else {
            turnRight();
            return true;
        }
    }
    public boolean checkRightWall() {
        turnRight();
        if (frontIsClear()) {
            turnLeft();
            return false;
        }
        else {
            turnLeft();
            return true;
        }
    }
    public boolean checkCeiling() {
        if (frontIsClear()) {
            return false;
        }
        else {
            return true;
        }
    }
    public void turnRight() {
            turnLeft();
            turnLeft();
            turnLeft();
    }
    public void turn180() {
        turnLeft();
        turnLeft();
    }
}


