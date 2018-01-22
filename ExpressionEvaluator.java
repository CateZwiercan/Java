import java.util.Scanner;
import java.text.DecimalFormat;

   /**
   * Displays user's input value and calculates 
   * a new number. Than, it displays how many digits 
   * are to the left and right of decial point and prints
   * formatted result.
   * Project 3.
   * @author Cate Zwiercan
   * @version September 22, 2017
   */

public class ExpressionEvaluator {

   /**
    * Takes input from user to get x and
    * calculates new number and calculates the number of 
    * digits to the left and right of decimal point.
    * Then prints out the result, the number of digits
    * to left and right and the new formated result to std output.
    *
    * @param args Command line arguments (not used).
   */

   public static void main(String[] args) {
      
      //variables
      
      double origNum = 0.0;
      double result = 0.0;
      String unformatResult = "";
      int digitLeft = 0;
      int digitRight = 0;
      
      // set up formatter
      DecimalFormat formatter = new DecimalFormat("#,##0.0####");
      
      //get input 
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a value for x: ");
      origNum = input.nextDouble();
      
      //calculations
      result = Math.sqrt(Math.abs(23.7 * Math.pow(origNum, 9)) - origNum);
      result /= (7.3 * Math.pow(origNum, 2) + 5.2 * origNum + 3.1);
      
      //print result
      System.out.println("Result: " + result);
      
      //get num of digits
      unformatResult = Double.toString(result);
      digitLeft = unformatResult.indexOf('.');
      digitRight = unformatResult.length() - 1 - digitLeft;
      
      //num of digits to left of decimal
      System.out.println("# digits to left of decimal point: " + digitLeft);
      
      //num of digits to right of decimal
      System.out.println("# digits to right of decimal point: " 
         + digitRight);
      
      //formatted result
      System.out.println("Formatted Result: " + formatter.format(result));
   }
}
