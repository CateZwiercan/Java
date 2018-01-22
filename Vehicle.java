import java.text.DecimalFormat;

/**
   * Gives contructors and methods for the Vehicle class. 
   *  
   * Project 9.
   * @author Cate Zwiercan
   * @version November 17, 2017
   */
   
public abstract class Vehicle implements Comparable<Vehicle> {

   //instance variables
   protected String owner = "";
   protected String yearMakeModel = "";
   protected double value = 0.0;
   protected boolean altFuel = false;
   protected static int vehicleCount;
   
   //constructor
   /**
   * Allows input to from new user and sets new values.
   * @param ownerIn sets owner name.
   * @param yearMakeIn sets yearMakeModel.
   * @param valueIn sets value.
   * @param altIn sets altFuel.
   */

   public Vehicle(String ownerIn, String yearMakeIn, 
      double valueIn, boolean altIn) {
      setOwner(ownerIn);
      setYearMakeModel(yearMakeIn);
      setValue(valueIn);
      setAlternativeFuel(altIn);
      vehicleCount++;
   }
   
   //methods
   
   /**
   * @return owner of car.
   */

   public String getOwner() {
      return owner;
   }
   
   /**
   * @param ownerIn sets owner of car.
   */

   public void setOwner(String ownerIn) {
      owner = ownerIn;
   }
   
   /**
   * @return yearMakeModel of car.
   */

   public String getYearMakeModel() {
      return yearMakeModel;
   }
   
   /**
   * @param yearMakeModelIn sets year of car.
   */

   public void setYearMakeModel(String yearMakeModelIn) {
      yearMakeModel = yearMakeModelIn;
   }
   
   /**
   * @return value of car.
   */

   public double getValue() {
      return value;
   }
   
   /**
   * @param valueIn sets value of car.
   */

   public void setValue(double valueIn) {
      value = valueIn;
   }
   
   /**
   * @return altFuel of car.
   */

   public boolean getAlternativeFuel() {
      return altFuel;
   }
   
   /**
   * @param altFuelIn sets altFuel of car.
   */

   public void setAlternativeFuel(boolean altFuelIn) {
      altFuel = altFuelIn;
   }
   
   /**
   * @return vehicleCount of cars.
   */

   public static int getVehicleCount() {
      return vehicleCount;
   }
   
   /**
   * resets number of cars.
   */

   public static void resetVehicleCount() {
      vehicleCount = 0;
   }
   
   /**
   * @return use tax method.
   */

   public abstract double useTax();
   
   
   /**
   * @param vehicle is compared.
   * @return 1 if no owner.
   */

   public int compareTo(Vehicle vehicle) {
      if (this.getOwner().equals(vehicle.getOwner())) {
         return 0;
      }
      else if (this.getOwner().compareTo(vehicle.getOwner()) < 0) {
         return -1;
      }
      else {
         return 1;
      }
   }
   
   /**
      * @param obj the other object 
      * @return boolean
      */
   public boolean equals(Object obj) {
      if (!(obj instanceof Vehicle)) { 
         return false;
      }
      else {
         Vehicle other = (Vehicle) obj;
         return (owner + yearMakeModel + value).
            equals(other.owner + other.yearMakeModel + other.value);
      } }
      
   /** @return 0 */
   public int hashCode() { 
      return 0;
   }

   
   /**
   * @return output of info of car.
   */

   public String toString() {
      DecimalFormat formatter = new DecimalFormat("##,###.00");
      String output = "";
      if (this.getAlternativeFuel()) {
         output += this.getOwner() + ": " + this.getClass().getName()
            + " " + this.getYearMakeModel() + " (Alternative Fuel)\nValue: $" 
            + formatter.format(this.getValue())
            + " Use Tax: $" + formatter.format(this.useTax());
      }
      else {
         output += this.getOwner() + ": " + this.getClass().getName()
            + " " + this.getYearMakeModel() + "\nValue: $" 
            + formatter.format(this.getValue())
            + " Use Tax: $" + formatter.format(this.useTax());
      }
      return output;
   }
   
}