import java.io.FileNotFoundException;


/**
   * Gives contructors VehcilesPart3 class. 
   *  
   * Project 11.
   * @author Cate Zwiercan.
   * @version December 8, 2017.
   */

public class VehiclesPart3 {

   /**
    * Prompts user to enter file name and then prints to std output.
	 * @param args - Standard commandline arguments.
    */

   public static void main(String[] args) {
       
      if (args.length == 0) {
         System.out.println("*** File name not provided"
            + " by command line argument.");
         System.out.print("Program ending.");
         return;
      }
      
      try {
         UseTaxList list = new UseTaxList();
         list.readVehicleFile(args[0]);
      
         System.out.println(list.summary() + "\n");
         System.out.println(list.listByOwner() + "\n");
         System.out.println(list.listByUseTax() + "\n");
         System.out.println(list.excludedRecordsList() + "\n");
      }
      catch (FileNotFoundException e) {
         System.out.println("*** File not found.");
         System.out.print("Program ending.");
         return;
      }
      
            
   }
}