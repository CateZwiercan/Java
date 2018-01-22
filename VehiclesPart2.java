import java.io.FileNotFoundException;

/**
   * VehiclesPart2 testing methods and constructor . 
   *  
   * Project 10.
   * @author Cate Zwiercan
   * @version December 1, 2017
   */

public class VehiclesPart2 {

    /**
    * Prompts user to enter file name and then prints to std output.
	 * @throws FileNotFoundException here.
    * @param args - Standard commandline arguments.
    */

   public static void main(String[] args) throws FileNotFoundException {
      
      
      UseTaxList list = new UseTaxList();
      list.readVehicleFile("vehicles1.txt");
      
      System.out.println(list.summary() + "\n");
      System.out.println(list.listByOwner() + "\n");
      System.out.println(list.listByUseTax() + "\n");
      System.out.println(list.excludedRecordsList() + "\n");
   }
}