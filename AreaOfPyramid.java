import java.util.Scanner;

/**
* Displays base and slant height of pyramid 
* and calculates the area of pyramid based
* on numbers from input.
* Project 2.
* @author Cate Zwiercan
* @version September 6, 2017
*/

public class AreaOfPyramid {

/**
    * Takes input from user to get base and
    * slant height of pyramid. Then calculates  
    * area and prints to std output.
    *
    * @param args Command line arguments (not used).
   */

   public static void main(String[] args) {
   
   //variables
      double base = 0.0;
      double slantHeight = 0.0;
      double area = 0.0;
   
   //Ask for base and slant
      Scanner userInput = new Scanner(System.in);
      System.out.println("Enter values for base and slant"
         + " height of a pyramid: ");
      System.out.print("\tbase = ");
      base = userInput.nextDouble();
      System.out.print("\tslant height = ");
      slantHeight = userInput.nextDouble();
      
   // calculate area
   
      area = base * base + 4 * ((base * slantHeight) / 2);
   
   //print area
   
      System.out.println("\nA pyramid with base = " + base 
         + " and slant height = " + slantHeight + " \nhas an area of "
         + area + " square units.");
   
   }
}