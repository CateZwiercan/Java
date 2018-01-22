/**
   * makes new objects form each class Car class. 
   *  
   * Project 9.
   * @author Cate Zwiercan
   * @version November 17, 2017
   */

public class VehiclesPart1 {

   /**
    * Prompts user to choose a letter and then prints to std output.
	 *
    * @param args - Standard commandline arguments
    * @throws FileNotFoundException in main.
    */

   public static void main(String[] args) {
   
      Car car1 = new Car("Smith, John", "2017 Honda Accord", 22000, true);
      Truck truck1 = new Truck("Wayne, Bruce", "2012 Chevy Silverado",
          45000, true, 3.0);
      SemiTractorTrailer semi1 = new SemiTractorTrailer("Bond, James", 
         "2015 Ford Crusier", 45000, false, 3.0, 4);
      Motorcycle motor1 = new Motorcycle("Williams, Robin", "1964 Harly Fast",
          14000, true, 3.5);
      
      System.out.println(car1 + "\n");
      System.out.println(truck1 + "\n");
      System.out.println(semi1 + "\n");
      System.out.println(motor1 + "\n");
   }
}