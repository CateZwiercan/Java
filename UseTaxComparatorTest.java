import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
   * UseTaxComparatorTest testing methods and constructor . 
   *  
   * Project 10.
   * @author Cate Zwiercan
   * @version December 1, 2017
   */

public class UseTaxComparatorTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }

   /** tests compare equal. 
   * @throws NegativeValueException here.
   **/
   @Test public void compareEqualTest() throws NegativeValueException {
      Car c1 = new Car("Jones, Sam", "2017 Honda Accord", 22000, false);
      Car c2 = new Car("Jones, Sam", "2017 Honda Accord", 22000, false);
      UseTaxComparator r = new UseTaxComparator();
      Assert.assertEquals(0, r.compare(c1, c2));
   }
   
   /** tests compare less. 
   * @throws NegativeValueException here.
   **/
   @Test public void compareLessTest() throws NegativeValueException {
      Car c1 = new Car("Jones, Sam", "2017 Honda Accord", 300, false);
      Car c2 = new Car("Jones, Sam", "2017 Honda Accord", 22000, false);
      UseTaxComparator r = new UseTaxComparator();
      Assert.assertEquals(-1, r.compare(c1, c2));
   }
   
   /** tests compare greater.
   * @throws NegativeValueException here.
    **/
   @Test public void compareGreaterTest() throws NegativeValueException {
      Car c1 = new Car("Jones, Sam", "2017 Honda Accord", 22000, false);
      Car c2 = new Car("Jones, Sam", "2017 Honda Accord", 300, false);
      UseTaxComparator r = new UseTaxComparator();
      Assert.assertEquals(1, r.compare(c1, c2));
   }



}
