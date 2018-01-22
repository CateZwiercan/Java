/**
   * Gives contructors and methods for the Car class. 
   *  
   * Project 11.
   * @author Cate Zwiercan
   * @version December 8, 2017
   */

public class Car extends Vehicle {

   //constants
   /** tax rate of car.*/
   public static final double TAX_RATE = 0.01;
   
   /** alt fuel tax rate of car.*/
   public static final double ALTERNATIVE_FUEL_TAX_RATE = 0.005;
   
   /** luxury threshold of car.*/
   public static final double LUXURY_THRESHOLD = 50_000;
   
   /** luxury tax rate of car.*/
   public static final double LUXURY_TAX_RATE = 0.02;
   
   //constructor
   /**
   * Allows input to from new user and sets new values.
   * @param ownerIn sets owner name.
   * @param yearIn sets yearMakeModel.
   * @param valueIn sets value.
   * @param altIn sets altFuel.
   * @throws NegativeValueException here.
   */

   public Car(String ownerIn, String yearIn, double valueIn, boolean altIn) 
      throws NegativeValueException {
      super(ownerIn, yearIn, valueIn, altIn);
      
      if (value < 0) {
         vehicleCount--;
         throw new NegativeValueException();
      }
   }
   
   //methods
   /**
   * @return cost of car.
   */
   public double useTax() {
      double cost = 0.0;
      if (altFuel) {
         cost = value * ALTERNATIVE_FUEL_TAX_RATE;
      }
      else {
         cost = value * TAX_RATE;
      }
     
      if (value > LUXURY_THRESHOLD) {
         cost += value * LUXURY_TAX_RATE;
      }
     
      return cost;
   }
   
   /**
   * @return output of car info.
   */
   public String toString() {
      String output = super.toString();
      if (altFuel) {
         output += " \nwith Tax Rate: " + this.ALTERNATIVE_FUEL_TAX_RATE;
      }
      else {
         output += " \nwith Tax Rate: " + this.TAX_RATE;
      }
      if (value > LUXURY_THRESHOLD) {
         output += " Luxury Tax Rate: " + LUXURY_TAX_RATE;
      }
      return output;
   }
}