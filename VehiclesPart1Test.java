import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
   * test contructors for the VehiclesPart1 class. 
   *  
   * Project 9.
   * @author Cate Zwiercan
   * @version November 17, 2017
   */

public class VehiclesPart1Test {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /** tests constructor. **/
   @Test public void contructorTest() {
      VehiclesPart1 v1 = new VehiclesPart1();
      Vehicle.resetVehicleCount();
      VehiclesPart1.main(null);
      Assert.assertEquals(4, Vehicle.getVehicleCount());
   }
   
   
}
