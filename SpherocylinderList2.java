import java.text.DecimalFormat;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
   * Gives contructors and methods for the SpherocylinderList2 class. 
   *  
   * Project 7.
   * @author Cate Zwiercan
   * @version October 25, 2017
   */

public class SpherocylinderList2 {

   //instance variable
   private String listName = "";
   private Spherocylinder[] objects;
   private int num = 0;
   
   //constructor
   /**
   * Allows input to from new user and sets new values.
   * @param nameIn sets list name.
   * @param objIn sets objects in array list.
   * @param numIn sets number of objects in array.
   */
   public SpherocylinderList2(String nameIn, 
      Spherocylinder[] objIn, int numIn) {
      listName = nameIn;
      objects = objIn;
      num = numIn;
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
      return num;
   }
   
   /**
   * @return surfaceArea the total of all spherocyclinders surface areas.
   */
   public double totalSurfaceArea() {
      double surfaceArea = 0;
      int i = 0;
      while (i < num) {
         surfaceArea += objects[i].surfaceArea();
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
      while (i < num) {
         volume += objects[i].volume();
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
      while (i < num) {
         surfaceArea += objects[i].surfaceArea();
         i++;
      }
      if (num > 0) {
         surfaceArea /= num;
      }
      return surfaceArea;
   }
   
   /**
   * @return volume the average of all spherocyclinders volumes.
   */
   
   public double averageVolume() {
      double volume = 0;
      int i = 0;
      while (i < num) {
         volume += objects[i].volume();
         i++;
      }
      if (num > 0) {
         volume /= num;
      }
      return volume;
   }
   
   /**
   * spherocylinder's in list.
   * @return objects in list. 
   */
   
   public Spherocylinder[] getList() {
      return objects;
   }
   
   /**
   * spherocylinder's in list.
   * @return objects in list.
   * @param fileNameIn is file name.
   * @throws FileNotFoundException throws. 
   */
   
   public SpherocylinderList2 readFile(String fileNameIn) 
      throws FileNotFoundException {
      Scanner fileScan = new Scanner(new File(fileNameIn));
      Spherocylinder[] obj = new Spherocylinder[100];
      listName = fileScan.nextLine();
      int index = 0;
      while (fileScan.hasNext()) {
         String label = fileScan.nextLine();
         double radius = fileScan.nextDouble();
         double cylHeight = fileScan.nextDouble();
         Spherocylinder bob = new Spherocylinder(label, radius, cylHeight);
         obj[index++] = bob;
         fileScan.nextLine();
      } 
      SpherocylinderList2 l2 = new SpherocylinderList2(listName, obj, index);  
      fileScan.close();
   
      return l2;
   } 
   
   /**
   * spherocylinder's in list.
   * @param labelIn is label.
   * @param radiusIn is radius. 
   * @param cylHeightIn is height.
   */
   
   public void addSpherocylinder(String labelIn, 
      double radiusIn, double cylHeightIn) {
      Spherocylinder s = new Spherocylinder(labelIn, radiusIn, cylHeightIn);
      objects[num] = s;
      num++;
   }
   
   /**
   * finds spherocylinder in list.
   * @return bob in list. 
   * @param labelIn is label.
   */
   
   public Spherocylinder findSpherocylinder(String labelIn) {
      Spherocylinder bob = new Spherocylinder("", 0, 0);
      boolean find = false;
      for (int i = 0; i < num; i++) {
         if (objects[i].getLabel().toUpperCase()
            .equals(labelIn.toUpperCase())) {
            bob = objects[i];
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
      Spherocylinder bob = findSpherocylinder(labelIn);
      
      for (int i = 0; i < num; i++) {
         if (objects[i].getLabel().toUpperCase()
            .equals(labelIn.toUpperCase())) {
            bob = objects[i];
            for (int j = i; j < num - 1; j++) {
               objects[j] = objects[j + 1];
            }
            objects[num - 1] = null; // overwrite duplicate at end
            num--;
            break;
         }
      }
      return bob;
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
      for (int i = 0; i < num; i++) {
         if (objects[i].getLabel().toUpperCase()
            .equals(labelIn.toUpperCase())) {
            objects[i].setRadius(radiusIn);
            objects[i].setCylinderHeight(cylHeightIn);
            here = true;
         }
      }
      
      return here;
   }
   
   /**
   * finds spherocylinder with shortest radius in list.
   * @return shortest in list. 
   */

   public Spherocylinder findSpherocylinderWithShortestRadius() {
      if (num > 0) {
         Spherocylinder shorter = objects[0];
      
         for (int i = 0; i < num; i++) {
            if (objects[i].getRadius() < shorter.getRadius()) {
               shorter = objects[i];
               
            }
         }
         return shorter; 
      }
      else {
         return null;
      }
      
   }
   /**
   * finds spherocylinder with longest radius in list.
   * @return longest in list. 
   */

   public Spherocylinder findSpherocylinderWithLongestRadius() {
      if (num > 0) {
         Spherocylinder longer = objects[0];
      
         for (int i = 0; i < num; i++) {
            if (objects[i].getRadius() > longer.getRadius()) {
               longer = objects[i];
               
            }
         }
         return longer; 
      }
      else {
         return null;
      }
      
   }

   /**
   * finds spherocylinder with smallest volume in list.
   * @return small in list. 
   */

   public Spherocylinder findSpherocylinderWithSmallestVolume() {
      
      if (num > 0) {
         Spherocylinder small = objects[0];
      
         for (int i = 0; i < num; i++) {
            if (objects[i].volume() < small.volume()) {
               small = objects[i];
               
            }
         }
         return small; 
      }
      else {
         return null;
      }
      
   }
      
   /**
   * finds spherocylinder with largest volume in list.
   * @return large in list. 
   */

   public Spherocylinder findSpherocylinderWithLargestVolume() {
      if (num > 0) {
         Spherocylinder large = objects[0];
      
         for (int i = 0; i < num; i++) {
            if (objects[i].volume() > large.volume()) {
               large = objects[i];
               
            }
         }
         return large; 
      }
      else {
         return null;
      }
      
   }

   /**
   * toString prints out all of the spherocylinder's information.
   * @return output 
   */

   public String toString() {
      String output = listName + "\n";
      int i = 0;
      while (i < num) {
         output += "\n" + objects[i] + "\n";
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
         + "Number of Spherocylinders: " + num + "\n"
         + "Total Surface Area: " + formatter.format(totalSurfaceArea())
         + "\nTotal Volume: " + formatter.format(totalVolume()) + "\n"
         + "Average Surface Area: " + formatter.format(averageSurfaceArea())
         + "\nAverage Volume: " + formatter.format(averageVolume());
      return output;
   }

}