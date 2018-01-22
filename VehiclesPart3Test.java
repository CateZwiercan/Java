import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
   * tests VehcilesPart3 class. 
   *  
   * Project 11.
   * @author Cate Zwiercan.
   * @version December 8, 2017.
   */


public class VehiclesPart3Test {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /** test good input. **/
   @Test public void vehiclePart3GoodTest() {
      VehiclesPart3 vPart3Obj = new VehiclesPart3();
      Vehicle.resetVehicleCount();
      String[] args = {"vehicles2.txt"}; 
      VehiclesPart3.main(args);
      Assert.assertEquals(9, Vehicle.getVehicleCount());
   }
   
   /** test bad input. **/
   @Test public void vehiclePart3BadTest() {
      VehiclesPart3 vPart3Obj = new VehiclesPart3();
      Vehicle.resetVehicleCount();
      String[] args = {"vehicle.txt"}; 
      VehiclesPart3.main(args);
      Assert.assertEquals(0, Vehicle.getVehicleCount());
   }
   
   /** test no input. **/
   @Test public void vehiclePart3NoTest() {
      VehiclesPart3 vPart3Obj = new VehiclesPart3();
      Vehicle.resetVehicleCount();
      String[] args = {}; 
      VehiclesPart3.main(args);
      Assert.assertEquals(0, Vehicle.getVehicleCount());
   }


}
