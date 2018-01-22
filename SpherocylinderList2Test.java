import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.io.FileNotFoundException;


/**
   * test cases for spherocylinderList2 class. 
   *  
   * Project 8B.
   * @author Cate Zwiercan
   * @version November 10, 2017
   */

public class SpherocylinderList2Test {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }


   /**  test getName.
   * @throws FileNotFoundException here.
   **/
   @Test public void getNameTest() throws FileNotFoundException {
      Spherocylinder[] a = new Spherocylinder[100];
      SpherocylinderList2 bob = new SpherocylinderList2("bob", a, 0);
      String fileName = "spherocylinder_data_1.txt";
      bob = bob.readFile(fileName);
      String name = bob.getName();
      Assert.assertEquals("Spherocylinder Test List", name); 
   
   }
   
   /**  test getList. 
   * @throws FileNotFoundException here.
   **/
   @Test public void getListTest() throws FileNotFoundException {
      Spherocylinder[] a = new Spherocylinder[100];
      SpherocylinderList2 bob = new SpherocylinderList2("bob", a, 0);
      Assert.assertArrayEquals(a, bob.getList());
   }

   
   /**  test totalSurfaceArea.
   * @throws FileNotFoundException here.
   **/
   @Test public void totalSurfaceAreaTest() throws FileNotFoundException {
      Spherocylinder[] a = new Spherocylinder[100];
      SpherocylinderList2 bob = new SpherocylinderList2("bob", a, 0);
      String fileName = "spherocylinder_data_1.txt";
      bob = bob.readFile(fileName);
      double surfaceArea = bob.totalSurfaceArea();
      Assert.assertEquals(184790.426, surfaceArea, .001);
   }
   
   /**  test totalVolume. 
   * @throws FileNotFoundException here.
   **/
   @Test public void totalVolumeTest() throws FileNotFoundException {
      Spherocylinder[] a = new Spherocylinder[100];
      SpherocylinderList2 bob = new SpherocylinderList2("bob", a, 0);
      String fileName = "spherocylinder_data_1.txt";
      bob = bob.readFile(fileName);
      double volume = bob.totalVolume();
      Assert.assertEquals(6996733.041, volume, .001);
   
   }
   
   /**  test averageSurfaceArea. 
   * @throws FileNotFoundException here.
   **/
   @Test public void averageSurfaceAreaTest() throws FileNotFoundException {
      Spherocylinder[] a = new Spherocylinder[100];
      SpherocylinderList2 bob = new SpherocylinderList2("bob", a, 0);
      String fileName = "spherocylinder_data_1.txt";
      bob = bob.readFile(fileName);
      double avgSurfaceArea = bob.averageSurfaceArea();
      Assert.assertEquals(61596.809, avgSurfaceArea, .001);
   }
   
   /**  test averageSurfaceArea null. 
   * @throws FileNotFoundException here.
   **/
   @Test public void averageSurfaceAreaNullTest() throws FileNotFoundException {
      Spherocylinder[] a = new Spherocylinder[100];
      SpherocylinderList2 bob = new SpherocylinderList2("bob", a, 0);
      String fileName = "spherocylinder_data_0.txt";
      bob = bob.readFile(fileName);
      double avgSurfaceArea = bob.averageSurfaceArea();
      Assert.assertEquals(0, avgSurfaceArea, .001);
   }
   
   /**  test averageVolume. 
   * @throws FileNotFoundException here.
   **/
   @Test public void averageVolumeTest() throws FileNotFoundException {
      Spherocylinder[] a = new Spherocylinder[100];
      SpherocylinderList2 bob = new SpherocylinderList2("bob", a, 0);
      String fileName = "spherocylinder_data_1.txt";
      bob = bob.readFile(fileName);
      double avgVolume = bob.averageVolume();
      Assert.assertEquals(2332244.3479, avgVolume, .001);
   }
   
   /**  test averageVolume null. 
   * @throws FileNotFoundException here.
   **/
   @Test public void averageVolumeNullTest() throws FileNotFoundException {
      Spherocylinder[] a = new Spherocylinder[100];
      SpherocylinderList2 bob = new SpherocylinderList2("bob", a, 0);
      String fileName = "spherocylinder_data_0.txt";
      bob = bob.readFile(fileName);
      double avgVolume = bob.averageVolume();
      Assert.assertEquals(0, avgVolume, .001);
   }

   
   /**  test addSpherocylinder. 
   * @throws FileNotFoundException here.
   **/
   @Test public void addSpherocylinderTest() throws FileNotFoundException {
      Spherocylinder[] a = new Spherocylinder[100];
      SpherocylinderList2 bob = new SpherocylinderList2("bob", a, 0);
      String fileName = "spherocylinder_data_1.txt";
      bob = bob.readFile(fileName);
      bob.addSpherocylinder("Jane", 2.3, 4.5);
      Assert.assertEquals(4, bob.numberOfSpherocylinders(), .0001);
   
   }
   
   /**  test findSpherocylinder true.**/
   @Test public void findSpherocylinderTrueTest() {
      Spherocylinder[] a = {new Spherocylinder("Cate", 2.4, 2.5)};
      SpherocylinderList2 bob = new SpherocylinderList2("bob", a, 1);
      Spherocylinder yes = bob.findSpherocylinder("Cate");
      Assert.assertEquals(a[0], yes);
   }
   
   /**  test findSpherocylinder false.**/
   @Test public void findSpherocylinderFalseTest() {
      Spherocylinder[] a = {new Spherocylinder("late", 2.4, 2.5)};
      SpherocylinderList2 bob = new SpherocylinderList2("bob", a, 1);
      Spherocylinder yes = bob.findSpherocylinder("Cate");
      Assert.assertEquals(null, yes);      
   }
   
   /**  test deleteSpherocylinder true. 
   * @throws FileNotFoundException here.
   **/
   @Test public void deleteSpherocylinderTrueTest() 
      throws FileNotFoundException {
      Spherocylinder[] a = new Spherocylinder[100];
      SpherocylinderList2 bob = new SpherocylinderList2("bob", a, 0);
      String fileName = "spherocylinder_data_1.txt";
      bob = bob.readFile(fileName);
      Spherocylinder g = new Spherocylinder("Bob", 0, 0);
      g = bob.deleteSpherocylinder("Small Example");
      Assert.assertEquals(2, bob.numberOfSpherocylinders());
   
   }
   
   /**  test deleteSpherocylinder false.
   * @throws FileNotFoundException here.
   **/
   @Test public void deleteSpherocylinderFalseTest() 
      throws FileNotFoundException {
      Spherocylinder[] a = new Spherocylinder[100];
      SpherocylinderList2 bob = new SpherocylinderList2("bob", a, 0);
      String fileName = "spherocylinder_data_1.txt";
      bob = bob.readFile(fileName);
      Spherocylinder g = new Spherocylinder("Bob", 0, 0);
      g = bob.deleteSpherocylinder("Bob");
      Assert.assertEquals(3, bob.numberOfSpherocylinders());
   
   }

   /**  test editSpherocylinder true. **/
   @Test public void editSpherocylinderTrueTest() {
      Spherocylinder[] a = {new Spherocylinder("Cate", 2.4, 2.5)};
      SpherocylinderList2 bob = new SpherocylinderList2("bob", a, 1);
      boolean yes = false;
      yes = bob.editSpherocylinder("Cate", 1.5, 7.4);
      Assert.assertTrue(yes);
   }
   
   /**  test editSpherocylinder false. **/
   @Test public void editSpherocylinderFalseTest() {
      Spherocylinder[] a = {new Spherocylinder("Cate", 2.4, 2.5)};
      SpherocylinderList2 bob = new SpherocylinderList2("bob", a, 1);
      boolean yes = false;
      yes = bob.editSpherocylinder("late", 1.5, 7.4);
      Assert.assertFalse(yes);
   }

   
   /**  test findSpherocylinderWithShortestRadius true. **/
   @Test public void findSpherocylinderWithShortestRadiusTrueTest() {
      Spherocylinder[] a = {new Spherocylinder("Cate", 1.0, 2.5),
         new Spherocylinder("Sam", 7.4, 2.1)};
      SpherocylinderList2 bob = new SpherocylinderList2("bob", a, 2);
      Spherocylinder yes = bob.findSpherocylinderWithShortestRadius();
      Assert.assertEquals(a[0], yes);
   }
   
   /**  test findSpherocylinderWithShortestRadius false. **/
   @Test public void findSpherocylinderWithShortestRadiusFalseTest() {
      Spherocylinder[] a = {new Spherocylinder("Cate", 2.0, 2.5),
         new Spherocylinder("Sam", 1.4, 2.1)};
      SpherocylinderList2 bob = new SpherocylinderList2("bob", a, 2);
      Spherocylinder yes = bob.findSpherocylinderWithShortestRadius();
      Assert.assertEquals(a[1], yes);
   }

  
   
   /**  test findSpherocylinderWithShortestRadius null.
   * @throws FileNotFoundException here.
    **/
   @Test public void findSpherocylinderWithShortestRadiusNullTest() 
      throws FileNotFoundException {
      Spherocylinder[] a = new Spherocylinder[100];
      SpherocylinderList2 bob = new SpherocylinderList2("bob", a, 0);
      String fileName = "spherocylinder_data_0.txt";
      bob = bob.readFile(fileName);
      Spherocylinder yes = bob.findSpherocylinderWithShortestRadius();
      Assert.assertEquals(null, yes);
   }


      
   /**  test findSpherocylinderWithLongestRadius true. **/
   @Test public void findSpherocylinderWithLongestRadiusTrueTest()  {
      Spherocylinder[] a = {new Spherocylinder("Cate", 7.4, 2.5),
         new Spherocylinder("Sam", 1.2, 2.1)};
      SpherocylinderList2 bob = new SpherocylinderList2("bob", a, 2);
      Spherocylinder yes = bob.findSpherocylinderWithLongestRadius();
      Assert.assertEquals(a[0], yes);
   }
   
   /**  test findSpherocylinderWithLongestRadius false. **/
   @Test public void findSpherocylinderWithLongestRadiusFalseTest()  {
      Spherocylinder[] a = {new Spherocylinder("Cate", 2.1, 2.5),
         new Spherocylinder("Sam", 7.4, 2.1)};
      SpherocylinderList2 bob = new SpherocylinderList2("bob", a, 2);
      Spherocylinder yes = bob.findSpherocylinderWithLongestRadius();
      Assert.assertEquals(a[1], yes);
   }

   
   /**  test findSpherocylinderWithLongestRadius null. 
   * @throws FileNotFoundException here.
   **/
   @Test public void findSpherocylinderWithLongestRadiusNullTest() 
      throws FileNotFoundException {
      Spherocylinder[] a = new Spherocylinder[100];
      SpherocylinderList2 bob = new SpherocylinderList2("bob", a, 0);
      String fileName = "spherocylinder_data_0.txt";
      bob = bob.readFile(fileName);
      Spherocylinder yes = bob.findSpherocylinderWithLongestRadius();
      Assert.assertEquals(null, yes);
   }

         
   /**  test findSpherocylinderWithSmallestVolume true.**/
   @Test public void findSpherocylinderWithSmallestVolumeTrueTest() {
      Spherocylinder[] a = {new Spherocylinder("Cate", 1.0, 1.0),
         new Spherocylinder("Sam", 7.4, 7.2)};
      SpherocylinderList2 bob = new SpherocylinderList2("bob", a, 2);
      Spherocylinder yes = bob.findSpherocylinderWithSmallestVolume();
      Assert.assertEquals(a[0], yes);
   }
   
   /**  test findSpherocylinderWithSmallestVolume false.**/
   @Test public void findSpherocylinderWithSmallestVolumeFalseTest() {
      Spherocylinder[] a = {new Spherocylinder("Cate", 7.4, 10.5),
         new Spherocylinder("Sam", 2.1, 3.1)};
      SpherocylinderList2 bob = new SpherocylinderList2("bob", a, 2);
      Spherocylinder yes = bob.findSpherocylinderWithSmallestVolume();
      Assert.assertEquals(a[1], yes);
   }

   
   
   /**  test findSpherocylinderWithSmallestVolume null. 
   * @throws FileNotFoundException here.
   **/
   @Test public void findSpherocylinderWithSmallestVolumeNullTest() 
      throws FileNotFoundException {
      Spherocylinder[] a = new Spherocylinder[100];
      SpherocylinderList2 bob = new SpherocylinderList2("bob", a, 0);
      String fileName = "spherocylinder_data_0.txt";
      bob = bob.readFile(fileName);
      Spherocylinder yes = bob.findSpherocylinderWithSmallestVolume();
      Assert.assertEquals(null, yes);
   }


         
   /**  test findSpherocylinderWithLargestVolume true. **/
   @Test public void findSpherocylinderWithLargestVolumeTrueTest() {
      Spherocylinder[] a = {new Spherocylinder("Cate", 2.4, 1.5),
         new Spherocylinder("Sam", 7.4, 3.5)};
      SpherocylinderList2 bob = new SpherocylinderList2("bob", a, 2);
      Spherocylinder yes = bob.findSpherocylinderWithLargestVolume();
      Assert.assertEquals(a[1], yes);
   }
   
   /**  test findSpherocylinderWithLargesttVolume false. **/
   @Test public void findSpherocylinderWithLargestVolumeFalseTest() {
      Spherocylinder[] a = {new Spherocylinder("Cate", 7.6, 6.9),
         new Spherocylinder("Sam", 2.1, 1.2)};
      SpherocylinderList2 bob = new SpherocylinderList2("bob", a, 2);
      Spherocylinder yes = bob.findSpherocylinderWithLargestVolume();
      Assert.assertEquals(a[0], yes);
   }

   
   /**  test findSpherocylinderWithLargestVolume null. 
   * @throws FileNotFoundException here.
   **/
   @Test public void findSpherocylinderWithLargestVolumeNullTest() 
      throws FileNotFoundException {
      Spherocylinder[] a = new Spherocylinder[0];
      SpherocylinderList2 bob = new SpherocylinderList2("bob", a, 0);
      String fileName = "spherocylinder_data_0.txt";
      bob = bob.readFile(fileName);
      Spherocylinder yes = bob.findSpherocylinderWithLargestVolume();
      Assert.assertEquals(null, yes);
   }

         
   /**  test toString. 
   * @throws FileNotFoundException here.
   **/
   @Test public void toStringTest() throws FileNotFoundException {
      Spherocylinder[] a = new Spherocylinder[100];
      SpherocylinderList2 bob = new SpherocylinderList2("bob", a, 0);
      String fileName = "spherocylinder_data_1.txt";
      bob = bob.readFile(fileName);
      String toString = "Spherocylinder Test List\n\n" 
         + "Spherocylinder \"Small Example\" with radius" 
         + " 0.5 and cylinder height 0.25 has:\n"
         + "\tcircumference = 3.142 units\n"
         + "\tsurface area = 3.927 square units\n"
         + "\tvolume = 0.72 cubic units\n"
         + "\nSpherocylinder \"Medium Example\" with radius" 
         + " 10.8 and cylinder height 10.1 has:\n"
         + "\tcircumference = 67.858 units\n"
         + "\tsurface area = 2,151.111 square units\n"
         + "\tvolume = 8,977.666 cubic units\n"
         + "\nSpherocylinder \"Large Example\" with radius" 
         + " 98.32 and cylinder height 99.0 has:\n"
         + "\tcircumference = 617.763 units\n"
         + "\tsurface area = 182,635.388 square units\n"
         + "\tvolume = 6,987,754.655 cubic units\n";
   
   
      Assert.assertEquals(bob.toString(), toString);
   
   }
   
   /**  test summaryInfo. 
   * @throws FileNotFoundException here.
   **/
   @Test public void summaryInfoTest() throws FileNotFoundException {
      Spherocylinder[] a = new Spherocylinder[100];
      SpherocylinderList2 bob = new SpherocylinderList2("bob", a, 0);
      String fileName = "spherocylinder_data_1.txt";
      bob = bob.readFile(fileName);
      String summary = "----- Summary for Spherocylinder Test List -----"
         + "\nNumber of Spherocylinders: 3\n"
         + "Total Surface Area: 184,790.426\n"
         + "Total Volume: 6,996,733.041\n"
         + "Average Surface Area: 61,596.809\n"
         + "Average Volume: 2,332,244.347";
      Assert.assertEquals(bob.summaryInfo(), summary);
   }




   
   




}
