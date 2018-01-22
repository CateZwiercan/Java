import java.util.Scanner;

/**
* Displays the different measurements in barrels, 
* gallons, quarts and ounces from input.
* Then displays calculations.
* Project 2.
* @author Cate Zwiercan
* @version September 6, 2017
*/

public class LiquidMeasures {

   /**
    * Takes input from user to ounces and
    * calculates the ounces into how many barrels,
    * gallons, quarts and ounces it would be.
    * Then prints all of the measurements and 
    * the calculation to std output.
    *
    * @param args Command line arguments (not used).
   */

   public static void main(String[] args) {
   
      // declare variables
      int origOunces, barrels, gallons, quarts, ounces, remainder = 0;
      
      //  get input from user
      Scanner input = new Scanner(System.in); 
      System.out.print("Enter amount of liquid in ounces: ");
      origOunces = input.nextInt();
      
      // if statement checking amount
      if (origOunces > 1000000000) {
         System.out.println("Amount must not exceed 1,000,000,000.");
         return;
      }
         
      // calculate numbers
      barrels = origOunces / 5376;
      remainder = origOunces % 5376;
      gallons = remainder / 128;
      remainder = remainder % 128;
      quarts = remainder / 32;
      remainder = remainder % 32;
      ounces = remainder;
           
   //print measures by volume
      System.out.println("Measures by volume:");
      System.out.println("\tBarrels: " + barrels);
      System.out.println("\tGallons: " + gallons);
      System.out.println("\tQuarts: " + quarts);
      System.out.println("\tOunces: " + ounces);
      
   //print equation
      System.out.println(origOunces + " oz = (" + barrels 
         + " bl * 5376 oz) + (" + gallons + " gal * 128 oz) + (" 
         + quarts + " qt * 32 oz) + (" + ounces + " oz)");
   }
}