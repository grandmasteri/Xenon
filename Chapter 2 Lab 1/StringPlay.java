
/**
 * Write a description of class StringPlay here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StringPlay
{
    public static void main (String[] args) {
        String college = new String ("PoDunk College");
 
        String town = "Anytown, USA"; // part (a)
 
        int stringLength;
        String change1, change2, change3;
 
        stringLength = college.length(); // part (b)
 
        System.out.println (college + " contains " + stringLength + " characters.");
 
        change1 = college.toUpperCase(); // part (c)
 
        change2 = change1.replace("O","*"); // part (d)
 
        change3 = college.concat(town); // part (e)
 
        System.out.println (change1);
        System.out.println (change2);
        System.out.println ("The final string is " + change3);
        
    }
}
