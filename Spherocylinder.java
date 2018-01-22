import java.text.DecimalFormat;

/**
   * Gives contructors and methods for the Spherocylinder class. 
   *  
   * Project 4.
   * @author Cate Zwiercan
   * @version September 27, 2017
   */
   
public class Spherocylinder {

   //instance variables
   private String label = "";
   private double radius = 0.0;
   private double cylHeight = 0.0;
   private static int count = 0;
   
   //constructor
   /**
   * Allows input to from new user and sets new values.
   * @param labelIn sets label name.
   * @param radiusIn sets radius value.
   * @param cylHeightIn sets cylinder height value.
   */
   public Spherocylinder(String labelIn, double radiusIn, double cylHeightIn) { 
      setLabel(labelIn);
      setRadius(radiusIn);
      setCylinderHeight(cylHeightIn);
      count++;
   }
      
   //methods
   
   /**
   * @return label of spherocylinder.
   */
   
   public String getLabel() {
      return label;
   }
   
   /**
   * @param labelIn sets label.
   * @return isSet of label.
   */

   public boolean setLabel(String labelIn) {
      boolean isSet = false;
      if (labelIn != null) {
         label = labelIn.trim();
         isSet = true;
      }
      return isSet;
   }
   
   /**
   * @return radius of spherocylinder.
   */
   
   public double getRadius() {
      return radius;
   }
   
   /**
   * @return cylinder height of spherocylinder.
   */
   
   public double getCylinderHeight() {
      return cylHeight;
   }
   
   /**
   * @param cylHeightIn sets cylinder Height.
   * @return isSet of cylinder height.
   */

   public boolean setCylinderHeight(double cylHeightIn) {
      boolean isSet = false;
      if (cylHeightIn >= 0) {
         cylHeight = cylHeightIn;
         isSet = true;
      }
      return isSet;
   }
   
   /**
   * @param radiusIn sets radius.
   * @return isSet of radius.
   */

   public boolean setRadius(double radiusIn) {
      boolean isSet = false;
      if (radiusIn >= 0) {
         radius = radiusIn;
         isSet = true;
      }
      return isSet;
   }
   
   /**
   * @return circumference of spherocylinder.
   */

   public double circumference() {
      double circumference = 0.0;
      circumference = 2 * Math.PI * radius;
      return circumference;
   }
   
   /**
   * @return surface area of spherocylinder.
   */

   public double surfaceArea() {
      double surfaceArea = 0.0; 
      surfaceArea = 2 * Math.PI * radius * (2 * radius + cylHeight);
      return surfaceArea;
   }
  
  /**
   * @return volume of spherocyclinder.
   */

   public double volume() {
      double volume = 0.0;
      volume = Math.PI * Math.pow(radius, 2) * (4 * radius / 3 + cylHeight);
      return volume;
   }
   
   /**
   * @return count of objects.
   */

   public static int getCount() {
      return count;
   }
   
   /**
   * resets count of objects.
   */
   public static void resetCount() {
      count = 0;
   }
   
   /**
   * @param obj of object class.
   * @return false if not a Spherocylinder obj.
   */


   public boolean equals(Object obj) {
      if (!(obj instanceof Spherocylinder)) {
         return false;
      }
      else {
         Spherocylinder b = (Spherocylinder) obj;
         return (label.equalsIgnoreCase(b.getLabel())
                  && Math.abs(radius - b.getRadius()) < .000001
                  && Math.abs(cylHeight - b.getCylinderHeight())
                     < .000001);
      }
   }
   
   /**
   * @return 0 if equals is used.
   */

   public int hashCode() {
      return 0;
   }
   
   /**
   * toString prints out all of the spherocylinder's information.
   * @return output of info.
   */
   public String toString() {
   
      DecimalFormat formatter = new DecimalFormat("#,##0.0##");
      String output = "Spherocylinder \"" + label + "\" with radius "
         + radius + " and cylinder height " + cylHeight + " has:\n";
      output += "\tcircumference = " + formatter.format(circumference())
          + " units";
      output += "\n\tsurface area = " + formatter.format(surfaceArea()) 
         + " square units\n";
      output += "\tvolume = " + formatter.format(volume()) + " cubic units";
      return output;
   }
}