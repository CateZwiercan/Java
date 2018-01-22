import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
   * test contructors and methods for the NegativeValueException class. 
   *  
   * Project 11.
   * @author Cate Zwiercan
   * @version Decmeber 8, 2017
   */

public class NegativeValueExceptionTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /** tests negativeValueException. **/
   
   @Test public void negativeValueExceptionTest() { 
      boolean thrown = false;
      try {
         Car car = new Car("Jackson, Bo", "2012 Toyota Camry", -25000, false); 
      }
      catch (NegativeValueException e) { 
         thrown = true;
      }
      Assert.assertTrue("Expected NegativeValueException to be thrown.",
            thrown); /* or alternatively: */
   }
   
}
