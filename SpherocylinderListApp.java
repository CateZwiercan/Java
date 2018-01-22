import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

/**
   * sets up new objects and prints out all objects info. 
   *  
   * Project 5.
   * @author Cate Zwiercan
   * @version October 11, 2017
   */

public class SpherocylinderListApp {

   /**
    * Gets input from user and creates new object from the file.
    * Adds objects to new array list and prints out info and summary
    * to std output.
	 *
    * @param args not used.
    * @throws FileNotFoundException for reading file.
    */

   public static void main(String[] args) throws FileNotFoundException {
   
      // variables
      String input = "";
      ArrayList<Spherocylinder> inputList;
      
      // get input from user
      Scanner userInput = new Scanner(System.in);
      System.out.print("Enter file name: ");
      input = userInput.nextLine();
     
      //create new array list
      Scanner fileScan = new Scanner(new File(input));
      inputList = new ArrayList<Spherocylinder>();
      
      //add objects to list
      String labelList = fileScan.nextLine();
      
      while (fileScan.hasNext()) {
         String label = fileScan.nextLine();
         double radius = fileScan.nextDouble();
         double cylHeight = fileScan.nextDouble();
         inputList.add(new Spherocylinder(label, radius, cylHeight));
         fileScan.nextLine();
      } 
      
      //close scanner
      fileScan.close();
       
      //make spherocylinder list obj
      SpherocylinderList outputList;
      outputList = new SpherocylinderList(labelList, inputList);
      
      //print each object
      System.out.println("\n" + outputList + "\n");
      
      //print summary info
      System.out.println(outputList.summaryInfo());
   }
}