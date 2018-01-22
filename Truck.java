/**
   * Gives contructors and methods for the truck class. 
   *  
   * Project 11.
   * @author Cate Zwiercan
   * @version December 8, 2017
   */

public class Truck extends Vehicle {

   //variables
   protected double tons = 0.0;
   
   //constants 
   /** tax rate of truck.*/
   public static final double TAX_RATE = 0.02;
   
   /** alt tax rate of truck.*/
   public static final double ALTERNATIVE_FUEL_TAX_RATE = 0.01;
   
   /** large truck tons threshold of truck.*/
   public static final double LARGE_TRUCK_TONS_THRESHOLD = 2.0;
   
   /** large truck tax rate of truck.*/
   public static final double LARGE_TRUCK_TAX_RATE = 0.03;
   
   //contructor
   /**
   * Allows input to from new user and sets new values.
   * @param ownerIn sets owner name.
   * @param yearIn sets yearMakeModel.
   * @param valueIn sets value.
   * @param altIn sets altFuel.
   * @param tonsIn sets tons.
   * @throws NegativeValueException here.
   */

   public Truck(String ownerIn, String yearIn, double valueIn, 
      boolean altIn, double tonsIn) throws NegativeValueException {
      super(ownerIn, yearIn, valueIn, altIn);
      tons = tonsIn;
      
      if (value < 0 || tons < 0) {
         vehicleCount--;
         throw new NegativeValueException();
         
      }
   }
   
   //methods
   /**
   * @return tons of truck.
   */
   public double getTons() {
      return tons;
   }
   
   /**
   * @param tonsIn sets tons.
   */
   public void setTons(double tonsIn) {
      tons = tonsIn;
   }
   
   /**
   * @return cost of truck.
   */
   public double useTax() {
      double cost = 0.0;
      if (altFuel) {
         cost = value * ALTERNATIVE_FUEL_TAX_RATE;
      }
      else {
         cost = value * TAX_RATE;
      }
     
      if (tons > LARGE_TRUCK_TONS_THRESHOLD) {
         cost += value * LARGE_TRUCK_TAX_RATE;
      }
     
      return cost;
   }
   
   /**
   * @return output of truck info.
   */
   public String toString() {
      String output = super.toString();
      if (altFuel) {
         output += " \nwith Tax Rate: " + this.ALTERNATIVE_FUEL_TAX_RATE;
      }
      else {
         output += " \nwith Tax Rate: " + this.TAX_RATE;
      }
      if (tons > LARGE_TRUCK_TONS_THRESHOLD) {
         output += " Large Truck Tax Rate: " + LARGE_TRUCK_TAX_RATE;
      }
      return output;
   }
}