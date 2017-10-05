public class Paint
{
        public static void main(String[] args)
        {
            final int COVERAGE = 350;  //paint covers 350 sq ft/gal
            //declare integers length, width, and height;
            int length, width, height;
            
            //declare double totalSqFt;
            double totalSqFt;
            
            //declare double paintNeeded;
            double paintNeeded;
 
            //Declare and initialize the length of the room
            length = 15;
 
            //Declare and initialize the width of the room
            width = 11;
 
            //Declare and initialize the height of the room
            height = 8;
 
            //Compute the total square feet to be painted--think
            //about the dimensions of each wall
            totalSqFt = 2*(length*width) + 2*(length*height) + 2*(width*height);
            
            //Compute the amount of paint needed
            paintNeeded = totalSqFt/COVERAGE;
 
            //Print the length, width, and height of the room and the
            //number of gallons of paint needed.
            System.out.println ("Length is: " + length);
            System.out.println ("Width is: " + width);
            System.out.println ("Height is:" + height);
            System.out.println ("You gon need " + paintNeeded + " Gallons");
        }
}