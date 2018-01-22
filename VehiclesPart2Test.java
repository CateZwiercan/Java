import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.io.FileNotFoundException;

/**
   * VehiclePart2Test testing methods and constructor . 
   *  
   * Project 10.
   * @author Cate Zwiercan
   * @version December 1, 2017
   */

public class VehiclesPart2Test {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }

      
   /** test vehiclePart2. 
   * @throws FileNotFoundException here.
   **/
   @Test public void vehiclePart2Test() 
      throws FileNotFoundException {
      VehiclesPart2 vPart2Obj = new VehiclesPart2();
      Vehicle.resetVehicleCount();
      String[] args = {"vehicles1.txt"}; 
      VehiclesPart2.main(args);
      Assert.assertEquals(8, Vehicle.getVehicleCount());
   }
}
