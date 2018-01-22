import java.util.ArrayList;
import java.text.DecimalFormat;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
   * Gives contructors and methods for the SpherocylinderList class. 
   *  
   * Project 5.
   * @author Cate Zwiercan
   * @version October 11, 2017
   */

public class SpherocylinderList {

   //instance variable
   private String listName = "";
   private ArrayList<Spherocylinder> objects = new ArrayList<Spherocylinder>();
   
   //constructor
   /**
   * Allows input to from new user and sets new values.
   * @param nameIn sets list name.
   * @param objIn sets objects in array list.
   */
   public SpherocylinderList(String nameIn, ArrayList<Spherocylinder> objIn) {
      listName = nameIn;
      objects = objIn;
      
   }
   
   //methods
   /**
   * @return listName of list name.
   */
   public String getName() {
      return listName;
   }
   
   /**
   * @return num the number of of objects in array list.
   */
   public int numberOfSpherocylinders() {
      int num = 0;
      num = objects.size();
      return num;
   }
   
   /**
   * @return surfaceArea the total of all spherocyclinders surface areas.
   */
   public double totalSurfaceArea() {
      double surfaceArea = 0;
      int i = 0;
      while (i < objects.size()) {
         surfaceArea += objects.get(i).surfaceArea();
         i++;
      }
      return surfaceArea;
   }
   
   /**
   * @return volume the total of all spherocyclinders volumes.
   */
   public double totalVolume() {
      double volume = 0;
      int i = 0;
      while (i < objects.size()) {
         volume += objects.get(i).volume();
         i++;
      }
      return volume;
   }
   
   /**
   * @return surfaceArea the average of all spherocyclinders surface areas.
   */
   public double averageSurfaceArea() {
      double surfaceArea = 0;
      int i = 0;
      while (i < objects.size()) {
         surfaceArea += objects.get(i).surfaceArea();
         i++;
      }
      if (objects.size() > 0) {
         surfaceArea /= objects.size();
      }
      return surfaceArea;
   }
   
   /**
   * @return volume the average of all spherocyclinders volumes.
   */
   
   public double averageVolume() {
      double volume = 0;
      int i = 0;
      while (i < objects.size()) {
         volume += objects.get(i).volume();
         i++;
      }
      if (objects.size() > 0) {
         volume /= objects.size();
      }
      return volume;
   }
   
   /**
   * spherocylinder's in list.
   * @return objects in list. 
   */
   
   public ArrayList<Spherocylinder> getList() {
      return objects;
   }
   
   /**
   * spherocylinder's in list.
   * @return objects in list.
   * @param fileNameIn is file name.
   * @throws FileNotFoundException throws. 
   */
   
   public SpherocylinderList readFile(String fileNameIn) 
      throws FileNotFoundException {
      Scanner fileScan = new Scanner(new File(fileNameIn));
      listName = fileScan.nextLine();
      while (fileScan.hasNext()) {
         String label = fileScan.nextLine();
         double radius = fileScan.nextDouble();
         double cylHeight = fileScan.nextDouble();
         Spherocylinder bob = new Spherocylinder(label, radius, cylHeight);
         objects.add(bob);
         fileScan.nextLine();
      } 
      fileScan.close();
   
      return this;
   } 
   
   /**
   * spherocylinder's in list.
   * @param labelIn is label.
   * @param radiusIn is radius. 
   * @param cylHeightIn is height.
   */
   
   public void addSpherocylinder(String labelIn, 
      double radiusIn, double cylHeightIn) {
      objects.add(new Spherocylinder(labelIn, radiusIn, cylHeightIn)); 
   }
   
   /**
   * finds spherocylinder in list.
   * @return bob in list. 
   * @param labelIn is label.
   */
   
   public Spherocylinder findSpherocylinder(String labelIn) {
      Spherocylinder bob = new Spherocylinder("", 0, 0);
      boolean find = false;
      for (int i = 0; i < objects.size(); i++) {
         if (objects.get(i).getLabel().toUpperCase()
            .equals(labelIn.toUpperCase())) {
            bob = objects.get(i);
            find = true;
         }
      }
      if (find) {
         return bob;
      }
      else {
         return null;
      }
       
   }
   
   /**
   * deletes spherocylinder in list.
   * @return bob in list. 
   * @param labelIn is label.
   */
   
   public Spherocylinder deleteSpherocylinder(String labelIn) {
      Spherocylinder bob = new Spherocylinder("", 0, 0);
      bob = findSpherocylinder(labelIn.toUpperCase());
      if (bob != null) {
         objects.remove(objects.indexOf(bob));
         return bob;
      }
      else {
         return null;
      }
   }
   
   /**
   * edits spherocylinder in list.
   * @return true.
   * @param labelIn is label.
   * @param radiusIn is radius. 
   * @param cylHeightIn is height.
   */
   
   public boolean editSpherocylinder(String labelIn, 
      double radiusIn, double cylHeightIn) {
      boolean here = false;
      for (int i = 0; i < objects.size(); i++) {
         if (objects.get(i).getLabel().toUpperCase()
            .equals(labelIn.toUpperCase())) {
            objects.get(i).setRadius(radiusIn);
            objects.get(i).setCylinderHeight(cylHeightIn);
            here = true;
         }
      }
      
      return here;
   }
   
   /**
   * toString prints out all of the spherocylinder's information.
   * @return output 
   */

   public String toString() {
      String output = listName + "\n";
      int i = 0;
      while (i < objects.size()) {
         output += "\n" + objects.get(i) + "\n";
         i++;
      }
      return output;
   }
   
   /**
   * summaryInfo prints out all of the spherocylinder's information
   * added together.
   * @return output 
   */

   public String summaryInfo() {
      DecimalFormat formatter = new DecimalFormat("#,##0.0##");
      String output = "----- Summary for " + listName + " -----\n"
         + "Number of Spherocylinders: " + objects.size() + "\n"
         + "Total Surface Area: " + formatter.format(totalSurfaceArea())
         + "\nTotal Volume: " + formatter.format(totalVolume()) + "\n"
         + "Average Surface Area: " + formatter.format(averageSurfaceArea())
         + "\nAverage Volume: " + formatter.format(averageVolume());
      return output;
   }

}