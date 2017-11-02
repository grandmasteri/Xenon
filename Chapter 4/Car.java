
/**
 * Write a description of class Car here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Car
{
    private String carType;
    private int numPassengers;
    private int numCars;
    /**
     * Constructor for objects of class Car
     */
    public Car(String ct, int np)
    {
        this.carType = ct;
        this.numPassengers = np;
        numCars++;
    }
    
    public void changeCarType(String ct) {
        this.carType = ct;
    }
    
    public void changeNumPassngers(int np) {
        this.numPassengers = np;
    }
    
    public String toString() {
        return "This car is a " + carType + " and can carry " + numPassengers + " passengers.";
    }
    
    public boolean equals(Car other) {
        if(this.carType.equals(other.carType) && this.numPassengers == other.numPassengers) {
            return true;
        }
        else {
            return false;
        }
    }
}
