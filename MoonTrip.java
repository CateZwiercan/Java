import java.util.Scanner;
import java.text.DecimalFormat;

/**
* Displays user's ticket number and breaks down number  
* into specified sections such as date, time, description
* price, category, cost and prize number.
* Project 3.
* @author Cate Zwiercan
* @version September 22, 2017
*/

public class MoonTrip {

   static final double STUDENT_DISCOUNT = .40; 
   static final double EMPLOYEE_DISCOUNT = .20;
   
   /**
    * Takes input from user to get ticket number and
    * takes each part of the ticket number to find all of 
    * the date, time,description, price, category, cost 
    * and prize number.
    * Then prints out the result to std output.
    *
    * @param args Command line arguments (not used).
   */
  
   public static void main(String[] args) {
   
   //variables
      String ticketNum = "";
      String date = "";
      String time = "";
      String seat = "";
      String itinerary = "";
      String price = "";
      char cat;
      double cost = 0.0;
      double priceNum = 0.0;
      double prizeNum = 0.0;
      
   // get ticket number
      Scanner input = new Scanner(System.in);
      System.out.print("Enter ticket code: ");
      ticketNum = input.nextLine().trim();
      
   // set up decimal format
      DecimalFormat formatter = new DecimalFormat("###,##0.00");
   
   //if statment checking input
      if (ticketNum.length() < 26) {
         System.out.println("\n*** Invalid ticket code ***\nTicket code " 
            + "must have at least 26 characters.");
         return;
      }
      
   // substrings to find ticket info
      date = ticketNum.substring(0, 8);
      time = ticketNum.substring(8, 12);
      cat = ticketNum.charAt(12);
      price = ticketNum.substring(13, 22);
      seat = ticketNum.substring(22, 25);
      itinerary = ticketNum.substring(25);
      priceNum = Double.parseDouble(price);
      
      priceNum /= 100;
      
   // find cost
      if (cat == 's') {
         cost = priceNum - priceNum * STUDENT_DISCOUNT;
      }
      else if (cat == 'e') {
         cost = priceNum - priceNum * EMPLOYEE_DISCOUNT;
      }
      else {
         cost = priceNum;
      }
   
   //print out info
   //print date
      System.out.print("\nDate: " + date.substring(0, 2) + "/" 
         + date.substring(2, 4) + "/" + date.substring(4));
         
   //print time
      System.out.print("   Time: " + time.substring(0, 2) 
         + ":" + time.substring(2));
         
   //print seat
      System.out.println("   Seat: " + seat);
      
   //print itinerary
      System.out.println("Itinerary: " + itinerary);
      
   //print price
      System.out.print("Price: $" + formatter.format(priceNum));
   
   //print category
      System.out.print("   Category: " + cat);
   
   //print cost
      System.out.println("   Cost: $" + formatter.format(cost));
      
   //calculate prize number
      DecimalFormat formatter2 = new DecimalFormat("0000");
      prizeNum = Math.random() * 9999 + 1;
         
   //print prize number
      System.out.println("Prize Number: " + formatter2.format(prizeNum));
   
   }
}