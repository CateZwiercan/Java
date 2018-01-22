import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
   * test cases for spherocylinder class. 
   *  
   * Project 8.
   * @author Cate Zwiercan
   * @version November 1, 2017
   */

public class SpherocylinderTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }

   /** tests getLabel. **/
   @Test public void getLabelTest() {
      Spherocylinder bob = new Spherocylinder("Bob", 2.3, 1.2);
      String label = bob.getLabel();
      Assert.assertEquals("Bob", label);
   }
   
   /** tests setLabel true. **/
   @Test public void setLabelTrueTest() {
      Spherocylinder bob = new Spherocylinder("Bob", 2.3, 1.2);
      boolean yes = false;
      String label = "jane";
      yes = bob.setLabel(label);
      Assert.assertEquals(bob.getLabel(), label);
      Assert.assertTrue(yes);
   }
   
   
    /** tests setLabel false. **/
   @Test public void setLabelFalseTest() {
      Spherocylinder bob = new Spherocylinder("Bob", 2.3, 1.2);
      boolean yes = bob.setLabel(null);
      Assert.assertFalse(yes);
   }

   
   /** tests getRadius. **/
   @Test public void getRadiusTest() {
      Spherocylinder bob = new Spherocylinder("Bob", 2.3, 1.2);
      double radius = bob.getRadius();
      Assert.assertEquals(2.3, radius, .000001);
   }
   
   /** tests getCylinderHeight. **/
   @Test public void getCylinderHeightTest() {
      Spherocylinder bob = new Spherocylinder("Bob", 2.3, 1.2);
      double cylHeight = bob.getCylinderHeight();
      Assert.assertEquals(1.2, cylHeight, .000001);
   }
   
   /** tests setCylinderHeight True. **/
   @Test public void setCylinderHeightTrueTest() {
      Spherocylinder bob = new Spherocylinder("Bob", 2.3, 1.2);
      boolean yes = false;
      double num = 3.4;
      yes = bob.setCylinderHeight(num);
      Assert.assertEquals(bob.getCylinderHeight(), num, .000001);
      Assert.assertTrue(yes);
   }
   
    /** tests setCylinderHeight false. **/
   @Test public void setCylinderHeightFalseTest() {
      Spherocylinder bob = new Spherocylinder("Bob", 2.3, 1.2);
      boolean yes = bob.setCylinderHeight(-1);
      Assert.assertFalse(yes);
   }
   
   /** tests setRadius true. **/
   @Test public void setRadiusTrueTest() {
      Spherocylinder bob = new Spherocylinder("Bob", 2.3, 1.2);
      boolean yes = false;
      double num = 7.9;
      yes = bob.setRadius(num);
      Assert.assertEquals(bob.getRadius(), num, .000001);
      Assert.assertTrue(yes);
   }
   
   /** tests setRadius false. **/
   @Test public void setRadiusFalseTest() {
      Spherocylinder bob = new Spherocylinder("Bob", 2.3, 1.2);
      boolean yes = bob.setRadius(-1);
      Assert.assertFalse(yes);
   }

   
   /** tests circumference. **/
   @Test public void circumferenceTest() {
      Spherocylinder bob = new Spherocylinder("Bob", 0, 1.2);
      double circumference = bob.circumference();
      Assert.assertEquals(0, circumference, .000001);
   }
   
   /** tests surfaceArea. **/
   @Test public void surfaceAreaTest() {
      Spherocylinder bob = new Spherocylinder("Bob", 0, 0);
      double surfaceArea = bob.surfaceArea();
      Assert.assertEquals(0, surfaceArea, .000001);
   }
   
   /** tests volume. **/
   @Test public void volumeTest() {
      Spherocylinder bob = new Spherocylinder("Bob", 0, 0);
      double volume = bob.volume();
      Assert.assertEquals(0, volume, .000001);
   }
      
      /** tests getCount. **/
   @Test public void getCountTest() {
      Spherocylinder bob = new Spherocylinder("Bob", 2.3, 2.9);
      int count = Spherocylinder.getCount();
      Assert.assertEquals(Spherocylinder.getCount(), count);
   }
   
   /** tests resetCount. **/
   @Test public void resetCountTest() {
      Spherocylinder bob = new Spherocylinder("Bob", 2.3, 2.9);
      Spherocylinder.resetCount();
      int count = Spherocylinder.getCount();
      Assert.assertEquals(0, count);
   }
   
   /** tests equals true. **/
   @Test public void equalsTrueTest() {
      Spherocylinder bob = new Spherocylinder("Bob", 2.3, 2.3);
      Spherocylinder obj = new Spherocylinder("Bob", 2.3, 2.3);
      boolean yes = false;
      yes = bob.equals(obj);
      Assert.assertEquals(bob, obj);
      Assert.assertTrue(yes);
   }
   
     /** tests equals label. **/
   @Test public void equalsLabelTest() {
      Spherocylinder bob = new Spherocylinder("Bob", 2.3, 2.3);
      Spherocylinder obj = new Spherocylinder("Jane", 2.3, 2.3);
      boolean yes = false;
      yes = bob.equals(obj);
      Assert.assertFalse(yes);
   }
   
    /** tests equals radius. **/
   @Test public void equalsRadiusTest() {
      Spherocylinder bob = new Spherocylinder("Bob", 2.3, 2.3);
      Spherocylinder obj = new Spherocylinder("Bob", 1.7, 2.3);
      boolean yes = false;
      yes = bob.equals(obj);
      Assert.assertFalse(yes);
   }

    /** tests equals cyl height. **/
   @Test public void equalsCylHeightTest() {
      Spherocylinder bob = new Spherocylinder("Bob", 2.3, 2.3);
      Spherocylinder obj = new Spherocylinder("Bob", 2.3, 1.7);
      boolean yes = false;
      yes = bob.equals(obj);
      Assert.assertFalse(yes);
   }

   
   /** tests equals false. **/
   @Test public void equalsFalseTest() {
      Spherocylinder bob = new Spherocylinder("Bob", 1.2, 2.1);
      String hello = "";
      boolean yes = bob.equals(hello);
      Assert.assertFalse(yes);
   }

   
   /** tests hashCode. **/
   @Test public void hashCodeTest() {
      Spherocylinder bob = new Spherocylinder("Bob", 1.2, 2.1);
      int code = bob.hashCode();
      Assert.assertEquals(0, code, .00001);
   }
   
   /** tests toString. **/
   @Test public void toStringTest() {
      Spherocylinder bob = new Spherocylinder("Bob", 4.3, 2.1);
      String toString = "Spherocylinder \"Bob\" with radius 4.3"
         + " and cylinder height 2.1 has:\n"
         + "\tcircumference = 27.018 units\n"
         + "\tsurface area = 289.089 square units\n"
         + "\tvolume = 455.023 cubic units";
      Assert.assertEquals(bob.toString(), toString);
   }
   
}