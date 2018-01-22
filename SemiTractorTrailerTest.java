import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
   * test contructors and methods for the SemiTractor class. 
   *  
   * Project 9.
   * @author Cate Zwiercan
   * @version November 17, 2017
   */

public class SemiTractorTrailerTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }

   /** tests setAxles. 
   * @throws NegativeValueException here.
   **/
   @Test public void setAxlesTest() throws NegativeValueException {
      SemiTractorTrailer s1 = new SemiTractorTrailer("Smith, John",
         "2012 Big Tractor", 45000, false, 5.4, 4);
      s1.setAxles(7);
      Assert.assertEquals(7, s1.getAxles());
   }
  
   /** tests axles below 0. 
   * @throws NegativeValueException here.
   **/
   @Test (expected = NegativeValueException.class)
   public void negAxlesTest() throws NegativeValueException {
      SemiTractorTrailer s2 = new SemiTractorTrailer("Smith, John",
         "2012 Big Tractor", 45000, false, 5.4, -4);
   }

   /** tests useTax. 
   * @throws NegativeValueException here.
   **/
   @Test public void useTaxTest() throws NegativeValueException {
      SemiTractorTrailer s1 = new SemiTractorTrailer("Smith, John",
         "2012 Big Tractor", 45000, false, 1.5, 4);
      double cost = s1.useTax();
      Assert.assertEquals(1800, cost, 0.001);
   }
   
   /** tests useTax alt.
   * @throws NegativeValueException here.
    **/
   @Test public void useTaxAltTest() throws NegativeValueException {
      SemiTractorTrailer s1 = new SemiTractorTrailer("Smith, John",
         "2012 Big Tractor", 45000, true, 1.5, 4);
      double cost = s1.useTax();
      Assert.assertEquals(1350, cost, 0.001);
   }
   
   /** tests useTax threshold. 
   * @throws NegativeValueException here.
   **/
   @Test public void useTaxThresholdTest() throws NegativeValueException {
      SemiTractorTrailer s1 = new SemiTractorTrailer("Smith, John",
         "2012 Big Tractor", 45000, false, 4.0, 4);
      double cost = s1.useTax();
      Assert.assertEquals(3150, cost, 0.001);
   }
   
   /** tests toString. 
   * @throws NegativeValueException here.
   **/
   @Test public void toStringTest() throws NegativeValueException {
      SemiTractorTrailer s1 = new SemiTractorTrailer("Smith, John",
         "2012 Big Tractor", 45000, false, 1.5, 4);
      String toString = "Smith, John: SemiTractorTrailer 2012 Big Tractor\n" 
         + "Value: $45,000.00 Use Tax: $1,800.00 \n" 
         + "with Tax Rate: 0.02 Axle Tax Rate: 0.02";
      Assert.assertEquals(s1.toString(), toString);
   }
   
   /** tests toString large. 
   * @throws NegativeValueException here.
   **/
   @Test public void toStringLargeTest() throws NegativeValueException {
      SemiTractorTrailer s1 = new SemiTractorTrailer("Smith, John",
         "2012 Big Tractor", 45000, false, 5.4, 4);
      String toString = "Smith, John: SemiTractorTrailer 2012 Big Tractor\n" 
         + "Value: $45,000.00 Use Tax: $3,150.00 \n" 
         + "with Tax Rate: 0.02 Large Truck Tax Rate: 0.03"
         + " Axle Tax Rate: 0.02";
      Assert.assertEquals(s1.toString(), toString);
   }
   
   /** tests toString large alt. 
   * @throws NegativeValueException here.
   **/
   @Test public void toStringLargeAltTest() throws NegativeValueException {
      SemiTractorTrailer s1 = new SemiTractorTrailer("Smith, John",
         "2012 Big Tractor", 45000, true, 5.4, 4);
      String toString = "Smith, John: SemiTractorTrailer 2012 Big Tractor "
         + "(Alternative Fuel)\n" 
         + "Value: $45,000.00 Use Tax: $2,700.00 \n" 
         + "with Tax Rate: 0.01 Large Truck Tax Rate: 0.03"
         + " Axle Tax Rate: 0.02";
      Assert.assertEquals(s1.toString(), toString);
   }
   
   /** tests toString alt. 
   * @throws NegativeValueException here.
   **/
   @Test public void toStringAltTest() throws NegativeValueException {
      SemiTractorTrailer s1 = new SemiTractorTrailer("Smith, John",
         "2012 Big Tractor", 45000, true, 1.5, 4);
      String toString = "Smith, John: SemiTractorTrailer 2012 Big Tractor "
         + "(Alternative Fuel)\n"
         + "Value: $45,000.00 Use Tax: $1,350.00 \n" 
         + "with Tax Rate: 0.01 Axle Tax Rate: 0.02";
      Assert.assertEquals(s1.toString(), toString);
   }

}
