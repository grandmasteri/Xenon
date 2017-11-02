
/**
 * Write a description of class FactoryDriver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FactoryDriver
{
    
    /**
     * Constructor for objects of class FactoryDriver
     */
    public static void main(String[] args)
    {
        Factory tesla = new Factory("69 coitus ln.", 10); 
        Car modelS = new Car("Model S", 5);
        tesla.addCar( modelS ,0);
        System.out.println(tesla);
    }
}
