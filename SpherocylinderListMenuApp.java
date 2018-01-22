import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.ArrayList;


      /**
   * Gets input from user to print out specified output. 
   * Project 6.
   * @author Cate Zwiercan
   * @version October 20, 2017
   */

public class SpherocylinderListMenuApp {

   /**
    * Prompts user to choose a letter and then prints to std output.
	 *
    * @param args - Standard commandline arguments
    * @throws FileNotFoundException in main.
    */

   public static void main(String[] args) throws FileNotFoundException {
   
      //variable
      char answer = 'Q';
      ArrayList<Spherocylinder> foo 
         = new ArrayList<Spherocylinder>();
      SpherocylinderList obj = new SpherocylinderList("", foo);
      
      //make scanner
      Scanner input = new Scanner(System.in);
      
      System.out.println("Spherocylinder List System Menu" 
         + "\nR - Read File and Create Spherocylinder List"
         + "\nP - Print Spherocylinder List"
         + "\nS - Print Summary"
         + "\nA - Add Spherocylinder"
         + "\nD - Delete Spherocylinder"
         + "\nF - Find Spherocylinder"
         + "\nE - Edit Spherocylinder"
         + "\nQ - Quit");
      do {
         System.out.print("Enter Code [R, P, S, A, D, F, E, or Q]: ");
         answer = input.nextLine().toUpperCase().charAt(0);
         switch (answer) {
            case 'R':
               System.out.print("\tFile name: ");
               String fileName = input.nextLine();
               obj = obj.readFile(fileName);
               System.out.println("\tFile read in and " 
                  + "Spherocylinder List created\n");
               break;
            
            case 'P':
               System.out.println("\n" + obj);
               break;
            
            case 'S':
               System.out.println("\n" + obj.summaryInfo() + "\n");
               break;
            
            case 'A':
               System.out.print("\tLabel: ");
               String label = input.nextLine();
               System.out.print("\tRadius: ");
               double radius = input.nextDouble();
               System.out.print("\tCylinder Height: ");
               double cylHeight = input.nextDouble();
               obj.addSpherocylinder(label, radius, cylHeight);
               input.nextLine();
               System.out.println("\t*** Spherocylinder added ***\n");
               break;
               
            case 'D':
               System.out.print("\tLabel: ");
               label = input.nextLine();
               Spherocylinder bob = obj.deleteSpherocylinder(label);
               if (bob != null) {
                  System.out.println("\t\"" + label + "\" deleted\n");
               }
               else { 
                  System.out.println("\t\"" + label + "\" not found\n");
               }
               break;
         
            case 'F':
               System.out.print("\tLabel: ");
               label = input.nextLine();
               Spherocylinder fod = obj.findSpherocylinder(label);
               if (fod != null) {
                  System.out.println(fod + "\n");
               }
               else {
                  System.out.println("\t\"" + label + "\" not found\n");
               }
            
                 
               break;
            
            case 'E':
               System.out.print("\tLabel: ");
               label = input.nextLine();
               System.out.print("\tRadius: ");
               radius = input.nextDouble();
               System.out.print("\tCylinder Height: ");
               cylHeight = input.nextDouble();
               boolean there = obj.editSpherocylinder(label, radius, cylHeight);
               if (there) {
                  System.out.println("\t\"" + label 
                     + "\" successfully edited\n");
               }
               else {
                  System.out.println("\t\"" + label + "\" not found\n");
               }
               input.nextLine();
               break;
         
            case 'Q':
               break;
         
            default:
               System.out.println("\t*** invalid code ***\n");
               
         }
      
      } while (answer != 'Q');
   }
}
      
      
   
