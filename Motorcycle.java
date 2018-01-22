/**
   * Gives contructors and methods for the Motorcylce class. 
   *  
   * Project 11.
   * @author Cate Zwiercan
   * @version December 8, 2017
   */

public class Motorcycle extends Vehicle {

   //variables
   protected double engineSize = 0.0;
   
   //constants
   /** tax rate of motorcycle.*/
   public static final double TAX_RATE = 0.005;
   
   /** alt fuel tax rate of motorcycle.*/
   public static final double ALTERNATIVE_FUEL_TAX_RATE = 0.0025;
   
   /** large bike cc threshold of motorcycle.*/
   public static final double LARGE_BIKE_CC_THRESHOLD = 499;
   
   /** large bike tax rate of motorcycle.*/
   public static final double LARGE_BIKE_TAX_RATE = 0.015;
   
   //contructor
   /**
   * Allows input to from new user and sets new values.
   * @param ownerIn sets owner name.
   * @param yearIn sets yearMakeModel.
   * @param valueIn sets value.
   * @param altIn sets altFuel.
   * @param sizeIn sets engineSize.
   * @throws NegativeValueException here.
   */

   public Motorcycle(String ownerIn, String yearIn, double valueIn, 
      boolean altIn, double sizeIn) throws NegativeValueException {
      super(ownerIn, yearIn, valueIn, altIn);
      engineSize = sizeIn;
      
      if (value < 0 || engineSize < 0) {
         vehicleCount--;
         throw new NegativeValueException();
         
      }
   }
   
   //methods
   /**
   * @return engineSize of motorcycle.
   */
   public double getEngineSize() {
      return engineSize;
   }
   
   /**
   * @param sizeIn sets size of engine.
   */
   public void setEngineSize(double sizeIn) {
      engineSize = sizeIn;
   }
   
   /**
   * @return cost of motorcycle.
   */
   public double useTax() {
      double cost = 0.0;
      if (altFuel) {
         cost = value * ALTERNATIVE_FUEL_TAX_RATE;
      }
      else {
         cost = value * TAX_RATE;
      }
     
      if (engineSize > LARGE_BIKE_CC_THRESHOLD) {
         cost += value * LARGE_BIKE_TAX_RATE;
      }
     
      return cost;
   
   }
   
   /**
   * @return output of motorcycleInfo.
   */
   public String toString() {
      String output = super.toString();
      if (altFuel) {
         output += " \nwith Tax Rate: " + this.ALTERNATIVE_FUEL_TAX_RATE;
      }
      else {
         output += " \nwith Tax Rate: " + this.TAX_RATE;
      }
      if (engineSize > LARGE_BIKE_CC_THRESHOLD) {
         output += " Large Bike Tax Rate: " + LARGE_BIKE_TAX_RATE;
      }
      return output;
   
   }


}