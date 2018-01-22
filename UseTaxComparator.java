import java.util.Comparator;

/**
   * UseTaxComparator methods. 
   *  
   * Project 10.
   * @author Cate Zwiercan
   * @version December 1, 2017
   */

public class UseTaxComparator implements Comparator<Vehicle> {

   /**
   * @param v1 is vehicle.
   * @param v2 is vehicle.
   * @return 0 if equal.
   */

   public int compare(Vehicle v1, Vehicle v2) {
      if (v1.useTax() > v2.useTax()) {
         return 1;
      }
      else if (v1.useTax() < v2.useTax()) {
         return -1;
      }
      
      return 0;
      
   }
   
}