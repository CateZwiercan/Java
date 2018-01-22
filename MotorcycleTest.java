import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

 /**
   * test contructors and methods for the MotorCycle class. 
   *  
   * Project 9.
   * @author Cate Zwiercan
   * @version November 17, 2017
   */

public class MotorcycleTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
   
   /** tests setTons. 
   * @throws NegativeValueException here.
   **/
   @Test public void setEngineSizeTest() throws NegativeValueException {
      Motorcycle m1 = new Motorcycle("Smith, John", "1964 Cool Bike", 
         14000, false, 750);
      m1.setEngineSize(423);
      Assert.assertEquals(423, m1.getEngineSize(), 0.01);
   }
   
   /** tests value below 0. 
   * @throws NegativeValueException here.
   **/
   @Test (expected = NegativeValueException.class)
   public void negValueTest() throws NegativeValueException {
      Motorcycle m1 = new Motorcycle("Smith, John", "1964 Cool Bike", 
         -14000, false, 750);
   }
   
   /** tests engineSize below 0. 
   * @throws NegativeValueException here.
   **/
   @Test (expected = NegativeValueException.class)
   public void negEngineSizeTest() throws NegativeValueException {
      Motorcycle m1 = new Motorcycle("Smith, John", "1964 Cool Bike", 
         14000, false, -750);
   }

   
   /** tests useTax.
   * @throws NegativeValueException here.
    **/
   @Test public void useTaxTest() throws NegativeValueException {
      Motorcycle m1 = new Motorcycle("Smith, John", "1964 Cool Bike", 
         14000, false, 231);
      double cost = m1.useTax();
      Assert.assertEquals(70, cost, 0.01);
   }
   
   /** tests useTax alt fuel. 
   * @throws NegativeValueException here.
   **/
   @Test public void useTaxAltTest() throws NegativeValueException {
      Motorcycle m1 = new Motorcycle("Smith, John", "1964 Cool Bike", 
         14000, true, 231);
      double cost = m1.useTax();
      Assert.assertEquals(35, cost, 0.01);
   }
   
   /** tests useTax threshold. 
   * @throws NegativeValueException here.
   **/
   @Test public void useTaxThresholdTest() throws NegativeValueException {
      Motorcycle m1 = new Motorcycle("Smith, John", "1964 Cool Bike", 
         14000, false, 791);
      double cost = m1.useTax();
      Assert.assertEquals(280, cost, 0.01);
   }
   
   /** tests toString. 
   * @throws NegativeValueException here.
   **/
   @Test public void toStringTest() throws NegativeValueException {
      Motorcycle m1 = new Motorcycle("Smith, John", "1964 Cool Bike", 
         14000, false, 76);
      String toString = "Smith, John: Motorcycle 1964 Cool Bike\n" 
         + "Value: $14,000.00 Use Tax: $70.00 \n" 
         + "with Tax Rate: 0.005";
      Assert.assertEquals(m1.toString(), toString);
   }
   
   /** tests toString large. 
   @throws NegativeValueException here.
   **/
   @Test public void toStringLargeTest() throws NegativeValueException {
      Motorcycle m1 = new Motorcycle("Smith, John", "1964 Cool Bike", 
         14000, false, 791);
      String toString = "Smith, John: Motorcycle 1964 Cool Bike\n" 
         + "Value: $14,000.00 Use Tax: $280.00 \n" 
         + "with Tax Rate: 0.005 Large Bike Tax Rate: 0.015";
      Assert.assertEquals(m1.toString(), toString);
   }
   
   /** tests toString large alt. 
   * @throws NegativeValueException here.
   **/
   @Test public void toStringAltLargeTest() throws NegativeValueException {
      Motorcycle m1 = new Motorcycle("Smith, John", "1964 Cool Bike", 
         14000, true, 791);
      String toString = "Smith, John: Motorcycle 1964 Cool Bike " 
         + "(Alternative Fuel)\n"
         + "Value: $14,000.00 Use Tax: $245.00 \n" 
         + "with Tax Rate: 0.0025 Large Bike Tax Rate: 0.015";
      Assert.assertEquals(m1.toString(), toString);
   }
   
   /** tests toString alt. 
   * @throws NegativeValueException here.
   **/
   @Test public void toStringAltTest() throws NegativeValueException {
      Motorcycle m1 = new Motorcycle("Smith, John", "1964 Cool Bike", 
         14000, true, 85);
      String toString = "Smith, John: Motorcycle 1964 Cool Bike " 
         + "(Alternative Fuel)\n"
         + "Value: $14,000.00 Use Tax: $35.00 \n" 
         + "with Tax Rate: 0.0025";
      Assert.assertEquals(m1.toString(), toString);
   }
}
