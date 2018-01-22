import java.util.Arrays;
   
/**
* Selector.java
* Gives methods for selector class.
*
* @author Cate Zwiercan
* @version January 16, 2018 
*/

public final class Selector {

   /**
   * finds min value in array.
   * @param a for array used. 
   * @return temp min.
   */
   
   public static int min(int[] a) {
      if (a == null || a.length == 0) {
         throw new IllegalArgumentException();
      }
      else {
         int temp = a[0];
         for (int i = 0; i < a.length; i++) {
            if (a[i] < temp) {
               temp = a[i];
            }
         }
         return temp;
      }
      
   }
   
   /**
   * finds max value in array.
   * @param a for array used.
   * @return temp max. 
   */
   
   public static int max(int[] a) {
      if (a == null || a.length == 0) {
         throw new IllegalArgumentException();
      }
      else {
         int temp = a[0];
         for (int i = 0; i < a.length; i++) {
            if (a[i] > temp) {
               temp = a[i];
            }
         }
         return temp;
      }
   
   }
   
   /**
   * finds numbers in range from array.
   * @param a for array used.
   * @param k for min value used. 
   * @return temp array.
   */

   public static int kmin(int[] a, int k) {
      if (a == null || a.length == 0) {
         throw new IllegalArgumentException();
      }
      
      int[] b = Arrays.copyOf(a, a.length);
      
      int newLength = b.length;
      for (int i = 0; i < b.length; i++) {
         for (int j = i + 1; j < b.length; j++) {
            if (b[i] == b[j]) {
               b[i] = -100;
               newLength--;
            }
         }
      }
      
      if (k > newLength) {
         throw new IllegalArgumentException();
      }
   
      int[] temp = new int[newLength];
      int count = 0;
      for (int i = 0; i < b.length; i++) {
         if (b[i] != -100) {
            temp[count] = b[i];
            count++;
         }
      }
   
      Arrays.sort(temp);
   
      return temp[k - 1]; 
     
   }
   
   /**
   * finds numbers in range from array.
   * @param a for array used.
   * @param k for max value used. 
   * @return temp array.
   */
   
   public static int kmax(int[] a, int k) {
      if (a == null || a.length == 0) {
         throw new IllegalArgumentException();
      }
      
      int[] b = Arrays.copyOf(a, a.length);
      
      int newLength = b.length;
      for (int i = 0; i < b.length; i++) {
         for (int j = i + 1; j < b.length; j++) {
            if (b[i] == b[j]) {
               b[i] = -100;
               newLength--;
            }
         }
      }
      
      if (k > newLength) {
         throw new IllegalArgumentException();
      }
      int[] temp = new int[newLength];
      int count = 0;
      for (int i = 0; i < b.length; i++) {
         if (b[i] != -100) {
            temp[count] = b[i];
            count++;
         }
      }
   
      Arrays.sort(temp);     
      return temp[newLength - k];
      
   }
   
   /**
   * finds numbers in range from array.
   * @param a for array used.
   * @param low for min value used.
   * @param high for high value used. 
   * @return temp array.
   */
   
   public static int[] range(int[] a, int low, int high) {
      if (a == null || a.length == 0) {
         throw new IllegalArgumentException();
      }
      else {
         int count = 0;
         
         for (int i = 0; i < a.length; i++) {
            if (a[i] >= low && a[i] <= high) {
               count++;
            }
         }
        
         int[] temp = new int[count];
         int index = 0;
         
         for (int i = 0; i < a.length; i++) {
            if (a[i] >= low && a[i] <= high) {
               temp[index++] = a[i];
            }
         }
         return temp;
      }
      
   }
   
   /**
   * finds max value in array.
   * @param a for array used.
   * @param key for target value.
   * @return high max. 
   */
   
   public static int ceiling(int[] a, int key) {
   
      if (a == null || a.length == 0 || Selector.max(a) < key) {
         throw new IllegalArgumentException();
      }
      
      int high = Selector.max(a);
      for (int i = 0; i < a.length; i++) {
         if (a[i] < high && a[i] > key) {
            high = a[i];
         }
         if (a[i] == key) {
            return a[i];
         }
      }
      
      return high;
   }
   
   /**
   * finds max value in array.
   * @param a for array used.
   * @param key for target value.
   * @return low max. 
   */

   public static int floor(int[] a, int key) {
   
      if (a == null || a.length == 0 || Selector.min(a) > key) {
         throw new IllegalArgumentException();
      }
      
      int low = Selector.min(a);
      for (int i = 0; i < a.length; i++) {
         if (a[i] > low && a[i] < key) {
            low = a[i];
         }
         if (a[i] == key) {
            return a[i];
         }
      }
      
      return low;
   
   }

}