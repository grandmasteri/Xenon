
/**
 * Write a description of class Factory here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Factory
{
    String address;
    Car[] inventory;
    
    /**
     * Constructor for objects of class Factory
     */
    public Factory(String st, int size)
    {
        this.address = st;
        this.inventory = new Car[size];
    }
    public void addCar(Car c, int spot) {
        inventory[spot] = c;
    }
    public String toString() {
        String output = "This is the factory inventory: \n";
        for(Car c : inventory) {
            output += c + "\n";
        }
        return output;
    }
}
