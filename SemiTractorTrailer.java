/**
   * Gives contructors and methods for the semiTractor class. 
   *  
   * Project 11.
   * @author Cate Zwiercan
   * @version December 8, 2017
   */

public class SemiTractorTrailer extends Truck {

   //variables
   protected int axles = 0;
   
   /** per axle tax rate of semi.*/
   public static final double PER_AXLE_TAX_RATE = 0.005;
   
   //contructor
   /**
   * Allows input to from new user and sets new values.
   * @param ownerIn sets owner name.
   * @param yearIn sets yearMakeModel.
   * @param valueIn sets value.
   * @param altIn sets altFuel.
   * @param tonsIn sets tons.
   * @param axlesIn sets axles.
   * @throws NegativeValueException here.
   */

   public SemiTractorTrailer(String ownerIn, String yearIn, double valueIn, 
      boolean altIn, double tonsIn, int axlesIn) throws NegativeValueException {
      super(ownerIn, yearIn, valueIn, altIn, tonsIn);
      axles = axlesIn;
      
      if (axles < 0) {
         vehicleCount--;
         throw new NegativeValueException();
         
      }
   }
   
   //methods
   /**
   * @return axles of semi.
   */
   public int getAxles() {
      return axles;
   }
   
   /**
   * @param axlesIn of semi.
   */
   public void setAxles(int axlesIn) {
      axles = axlesIn;
   }
   
   /**
   * @return cost of semi.
   */
   public double useTax() {
      double cost = 0.0;
      cost = super.useTax() + (value * axles * PER_AXLE_TAX_RATE);
      return cost;
   }
   
   /**
   * @return output of semi info.
   */
   public String toString() {
      String output = super.toString();
      output += " Axle Tax Rate: " + (axles * PER_AXLE_TAX_RATE);
      return output;
   }

}