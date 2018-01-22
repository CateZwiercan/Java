import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
   * test contructors and methods for the truck class. 
   *  
   * Project 9.
   * @author Cate Zwiercan
   * @version November 17, 2017
   */

public class TruckTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /** tests setTons.
   * @throws NegativeValueException here.
    **/
   @Test public void setTonsTest() throws NegativeValueException {
      Truck t1 = new Truck("Smith, John", "2012 Chevy Silverado", 
         30000, false, 1.5);
      t1.setTons(2.5);
      Assert.assertEquals(2.5, t1.getTons(), 0.01);
   }
   
   /** tests tons below 0. 
   * @throws NegativeValueException here.
   **/
   @Test (expected = NegativeValueException.class)
   public void negTonsTest() throws NegativeValueException {
      Truck t1 = new Truck("Smith, John", "2012 Chevy Silverado", 
         30000, false, -1.5);
   }
   
   /** tests value below 0. 
   * @throws NegativeValueException here.
   **/
   @Test (expected = NegativeValueException.class)
   public void negValueTest() throws NegativeValueException {
      Truck t1 = new Truck("Smith, John", "2012 Chevy Silverado", 
         -30000, false, 1.5);
   }


   
   /** tests useTax. 
   * @throws NegativeValueException here.
   **/
   @Test public void useTaxTest() throws NegativeValueException {
      Truck t1 = new Truck("Smith, John", "2012 Chevy Silverado", 
         30000, false, 1.5);
      double cost = t1.useTax();
      Assert.assertEquals(600, cost, 0.01);
   }
   
   /** tests useTax alt. 
   * @throws NegativeValueException here.
   **/
   @Test public void useTaxAltTest() throws NegativeValueException {
      Truck t1 = new Truck("Smith, John", "2012 Chevy Silverado", 
         30000, true, 1.5);
      double cost = t1.useTax();
      Assert.assertEquals(300, cost, 0.01);
   }
   
   /** tests useTax threshold. 
   * @throws NegativeValueException here.
   **/
   @Test public void useTaxThresholdTest() throws NegativeValueException {
      Truck t1 = new Truck("Smith, John", "2012 Chevy Silverado", 
         30000, false, 3.0);
      double cost = t1.useTax();
      Assert.assertEquals(1500, cost, 0.01);
   }

   /** tests toString. 
   * @throws NegativeValueException here.
   **/
   @Test public void toStringTest() throws NegativeValueException {
      Truck t1 = new Truck("Smith, John", "2012 Chevy Silverado", 
         30000, false, 1.5);
      String toString = "Smith, John: Truck 2012 Chevy Silverado\n" 
         + "Value: $30,000.00 Use Tax: $600.00 \n" 
         + "with Tax Rate: 0.02";
      Assert.assertEquals(t1.toString(), toString);
   }
   
   /** tests toString large. 
   * @throws NegativeValueException here.
   **/
   @Test public void toStringLargeTest() throws NegativeValueException {
      Truck t1 = new Truck("Smith, John", "2012 Chevy Silverado", 
         30000, false, 2.5);
      String toString = "Smith, John: Truck 2012 Chevy Silverado\n" 
         + "Value: $30,000.00 Use Tax: $1,500.00 \n" 
         + "with Tax Rate: 0.02 Large Truck Tax Rate: 0.03";
      Assert.assertEquals(t1.toString(), toString);
   }
   
   /** tests toString large alt. 
   * @throws NegativeValueException here.
   **/
   @Test public void toStringLargeAltTest() throws NegativeValueException {
      Truck t1 = new Truck("Smith, John", "2012 Chevy Silverado", 
         30000, true, 12.5);
      String toString = "Smith, John: Truck 2012 Chevy Silverado " 
         + "(Alternative Fuel)\n"
         + "Value: $30,000.00 Use Tax: $1,200.00 \n" 
         + "with Tax Rate: 0.01 Large Truck Tax Rate: 0.03";
      Assert.assertEquals(t1.toString(), toString);
   }
   
   /** tests toString alt. 
   * @throws NegativeValueException here.
   **/
   @Test public void toStringAltTest() throws NegativeValueException {
      Truck t1 = new Truck("Smith, John", "2012 Chevy Silverado", 
         30000, true, 1.0);
      String toString = "Smith, John: Truck 2012 Chevy Silverado " 
         + "(Alternative Fuel)\n"
         + "Value: $30,000.00 Use Tax: $300.00 \n" 
         + "with Tax Rate: 0.01";
      Assert.assertEquals(t1.toString(), toString);
   }
}
