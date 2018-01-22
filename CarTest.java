import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
   * test contructors and methods for the Car class. 
   *  
   * Project 9.
   * @author Cate Zwiercan
   * @version November 17, 2017
   */

public class CarTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /** test useTax. 
   * @throws NegativeValueException here.
   **/
   @Test public void useTaxTest() throws NegativeValueException {
      Car car1 = new Car("Smith, John", "2017 Honda Accord", 
         22000, false);
      double cost = car1.useTax();
      Assert.assertEquals(220, cost, 0.01);
   }
   
   /** test useTax alt. 
   * @throws NegativeValueException here.
   **/
   @Test public void useTaxAltTest() throws NegativeValueException {
      Car car1 = new Car("Smith, John", "2017 Honda Accord", 
         22000, true);
      double cost = car1.useTax();
      Assert.assertEquals(110, cost, 0.01);
   }
   
   /** test useTax threshold. 
   * @throws NegativeValueException here.
      **/
   @Test public void useTaxThresholdTest() throws NegativeValueException {
      Car car1 = new Car("Smith, John", "2017 Honda Accord", 
         111000, false);
      double cost = car1.useTax();
      Assert.assertEquals(3330, cost, 0.01);
   }

   /** test toString . 
   * @throws NegativeValueException here.
   **/
   @Test public void toStringTest() throws NegativeValueException {
      Car car1 = new Car("Smith, John", "2017 Honda Accord", 
         22000, false);
      String toString = "Smith, John: Car 2017 Honda Accord\n" 
         + "Value: $22,000.00 Use Tax: $220.00 \n" 
         + "with Tax Rate: 0.01";
      Assert.assertEquals(car1.toString(), toString);
   }
   
   /** test toString alt. 
   * @throws NegativeValueException here.
   **/
   @Test public void toStringAltTest() throws NegativeValueException {
      Car car1 = new Car("Smith, John", "2017 Honda Accord", 
         22000, true);
      String toString = "Smith, John: Car 2017 Honda Accord " 
         + "(Alternative Fuel)\n" 
         + "Value: $22,000.00 Use Tax: $110.00 \n" 
         + "with Tax Rate: 0.005";
      Assert.assertEquals(car1.toString(), toString);
   }
   
   /** test toString lux. 
   * @throws NegativeValueException here.
   **/
   @Test public void toStringLuxTest() throws NegativeValueException {
      Car car1 = new Car("Smith, John", "2017 Honda Accord", 
         111000, false);
      String toString = "Smith, John: Car 2017 Honda Accord\n" 
         + "Value: $111,000.00 Use Tax: $3,330.00 \n" 
         + "with Tax Rate: 0.01 Luxury Tax Rate: 0.02";
      Assert.assertEquals(car1.toString(), toString);
   }
   
   /** test toString alt lux. 
   * @throws NegativeValueException here.
   **/
   @Test public void toStringAltLuxTest() throws NegativeValueException {
      Car car1 = new Car("Smith, John", "2017 Honda Accord", 
         111000, true);
      String toString = "Smith, John: Car 2017 Honda Accord " 
         + "(Alternative Fuel)\n" 
         + "Value: $111,000.00 Use Tax: $2,775.00 \n" 
         + "with Tax Rate: 0.005 Luxury Tax Rate: 0.02";
      Assert.assertEquals(car1.toString(), toString);
   }
   
   /** test compareTo. 
   * @throws NegativeValueException here.
   **/
   @Test public void compareToTest() throws NegativeValueException {
      Car car1 = new Car("Smith, John", "2017 Honda Accord", 
         111000, false);
      Car car2 = new Car("Smith, John", "2017 Honda Accord", 
         111000, false);
      Assert.assertEquals(0, car1.compareTo(car2));
   }
   
   /** test equals true. 
   * @throws NegativeValueException here.
   **/
   @Test public void equalsTrueTest() throws NegativeValueException {
      Car car1 = new Car("Smith, John", "2017 Honda Accord", 
         111000, false);
      Car car2 = new Car("Smith, John", "2017 Honda Accord", 
         111000, false);
      Assert.assertEquals(true, car1.equals(car2));
   }
   
   /** test equals false. 
   * @throws NegativeValueException here.
   **/
   @Test public void equalsFalseTest() throws NegativeValueException {
      Car car1 = new Car("Smith, John", "2017 Honda Accord", 
         111000, false);
      Object car2 = new Object();
      Assert.assertEquals(false, car1.equals(car2));
   }
   
   /** test hashCode. 
   * @throws NegativeValueException here.
   **/
   @Test public void hashCodeTest() throws NegativeValueException {
      Car car1 = new Car("Smith, John", "2017 Honda Accord", 
         111000, false);
      int here = car1.hashCode();
      Assert.assertEquals(here, 0);
   }
}
