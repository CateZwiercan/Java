import java.util.Scanner;

/**
   * Creates new spherocylinders by using the spherocylinder class 
   * methods and constructors. 
   * Project 4.
   * @author Cate Zwiercan
   * @version September 27, 2017
   */

public class SpherocylinderApp {

   /**
    * Creates new spherocylinder from the spherocylinder class
    * methods.   
    * Then prints out the result to std output.
    *
    * @param args Command line arguments (not used).
   */

   public static void main(String[] args) {
      
      //variables
      String label = "";
      double radius = 0.0;
      double cylHeight = 0.0;
      
      //new scanner, get input from user
      Scanner input = new Scanner(System.in);
      System.out.println("Enter label, radius, and cylinder height "
         + "for a spherocylinder.");
      System.out.print("\tlabel: ");
      label = input.nextLine();
      
      //checks if label is null
      if (label.equals("")) {
         System.out.println("Label cannot be null.");
         return;
      }
      
      System.out.print("\tradius: ");
      radius = input.nextDouble();
      
      // checks if radius is negative
      if (radius < 0) {
         System.out.println("Error: radius must be non-negative.");
         return;
      }
      
      System.out.print("\tcylinder height: ");
      cylHeight = input.nextDouble();
      
      //checks if height is negative
      if (cylHeight < 0) {
         System.out.println("Error: cylinder height must be non-negative.");
         return;
      }
      
      //create new object
      Spherocylinder example1 = new Spherocylinder(label, radius, cylHeight);
      
      //print out spherocylinder example
      System.out.print("\n" + example1);
   }
    
}