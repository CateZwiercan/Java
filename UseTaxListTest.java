import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.io.FileNotFoundException;

 /**
   * UseTaxListTest testing methods and constructor . 
   *  
   * Project 10.
   * @author Cate Zwiercan
   * @version December 1, 2017
   */

public class UseTaxListTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
   
   /** tests readVehicleFile. 
   * @throws FileNotFoundException here.
   **/
   @Test public void readVehicleFileTest() 
      throws FileNotFoundException {
      UseTaxList p = new UseTaxList();
      p.readVehicleFile("vehicles2.txt");
      String r = p.listByOwner();
      boolean here = false;
      if (r.contains("Smith")) {
         here = true;
      }
      Assert.assertTrue(here);
   }
   
   /** tests setTaxDistrict. **/
   @Test public void setTaxDistrictTest() {
      UseTaxList p = new UseTaxList();
      p.setTaxDistrict("District 73");
      Assert.assertEquals("District 73", p.getTaxDistrict());
   }
     
   /** tests toString. 
   * @throws FileNotFoundException here.
   **/
   @Test public void toStringTest() 
      throws FileNotFoundException {
      UseTaxList p = new UseTaxList();
      p.readVehicleFile("vehicles2.txt");
      String r = p.toString();
      boolean here = false;
      if (r.contains("Smith")) {
         here = true;
      }
      Assert.assertTrue(here);
   }
   
    /** tests getVehicleList. 
    * @throws NegativeValueException here.
    **/
   @Test public void getVehicleListTest() throws NegativeValueException {
      UseTaxList p = new UseTaxList();
      Vehicle[] r = new Vehicle[2];
      Car car1 = new Car("Jones, Sam", "2017 Honda Accord", 22000, false);
      Car car2 = new Car("Jones, Jo", "2017 Honda Accord", 22000, true);
      r[0] = car1;
      r[1] = car2;
      p.addVehicle(car1);
      p.addVehicle(car2);
   
      Assert.assertArrayEquals(r, p.getVehicleList());
   }
   
   /** tests getExcludedRecords. **/
   @Test public void getExcludedRecordsTest() {
      UseTaxList p = new UseTaxList();
      String[] r = new String[2];
      String b = "Car; Jones, Sam; 2017 Honda Accord; 22000; false";
      String a = "car; Jones, Jo; 2017 Honda Accord; 22000; true";
      r[0] = a;
      r[1] = b;
      p.addExcludedRecord(a);
      p.addExcludedRecord(b);
      Assert.assertArrayEquals(r, p.getExcludedRecords());
   }
   
   /** tests summary. 
   * @throws FileNotFoundException here.
   **/
   @Test public void summaryTest() 
      throws FileNotFoundException {
      UseTaxList p = new UseTaxList();
      p.readVehicleFile("vehicles2.txt");
      String sum = "------------------------------\n" 
         + "Summary for Tax District 52\n"    
         + "------------------------------\n"
         + "Number of Vehicles: 9\n"    
         + "Total Value: $503,000.00\n"
         + "Total Use Tax: $15,310.00\n";
         
      Assert.assertEquals(sum, p.summary());
   }
       
   /** tests listByUseTax. 
   * @throws FileNotFoundException here.
   **/
   @Test public void listByUseTaxTest() 
      throws FileNotFoundException {
      UseTaxList p = new UseTaxList();
      p.readVehicleFile("vehicles2.txt");
      String r = p.listByUseTax();
      boolean here = false;
      if (r.contains("Smith")) {
         here = true;
      }
      Assert.assertTrue(here);
   }
   
   /** tests excludedRecordsList. 
   * @throws FileNotFoundException here.
   **/
   @Test public void excludedRecordsListTest()
      throws FileNotFoundException {
      UseTaxList p = new UseTaxList();
      p.readVehicleFile("vehicles2.txt");
      String r = p.excludedRecordsList();
      boolean here = false;
      if (r.contains("Invalid")) {
         here = true;
      }
      Assert.assertTrue(here);
   }

}
