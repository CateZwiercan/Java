import java.util.NoSuchElementException;
import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;

/**
   * UseTaxList methods and constructor . 
   *  
   * Project 11.
   * @author Cate Zwiercan
   * @version December 8, 2017
   */

public class UseTaxList {

   //variables
   private String taxDistrict;
   private Vehicle[] vehicleList;
   private String[] excludedRecords;
   
   
   //constructor
   /**
   * sets values.
   */

   public UseTaxList() {
      taxDistrict = "not yet assigned";
      vehicleList = new Vehicle[0];
      excludedRecords = new String[0];
   }
   
   //methods
   /**
   * @throws FileNotFoundException yes.
   * @param fileNameIn gets fileName.
   */

   public void readVehicleFile(String fileNameIn) 
      throws FileNotFoundException {
      Scanner fileScan = new Scanner(new File(fileNameIn));
      taxDistrict = fileScan.nextLine();
      
      while (fileScan.hasNext()) {
         String bob = fileScan.nextLine().trim();
         try {
            Scanner input = new Scanner(bob).useDelimiter(";");
            char vehicleType = input.next().toUpperCase().trim().charAt(0);
            String owner = input.next().trim();
            String yMM = input.next().trim();
            String v = input.next().trim();
            String aF = input.next().trim();
            boolean altFuel = false;
            if (aF.equals("true")) {
               altFuel = true;
            }
            double value = Double.parseDouble(v);
              
            
            switch (vehicleType) {
               case 'C':
                  Car c1 = new Car(owner, yMM, value, altFuel);
                  addVehicle(c1);
                  break;
                  
               case 'T':
                  String tt = input.next().trim();
                  double tons = Double.parseDouble(tt);
                  Truck t1 = new Truck(owner, yMM, value, altFuel, tons);
                  addVehicle(t1);
                  
                  break;
                  
               case 'S':
                  String t = input.next().trim();
                  String a = input.next().trim();
                  double tons2 = Double.parseDouble(t);
                  int axle = Integer.parseInt(a);
                  SemiTractorTrailer s1 = new SemiTractorTrailer(owner, 
                        yMM, value, altFuel, tons2, axle);
                  addVehicle(s1);
                  
                  break;
                  
               case 'M':
                  String s = input.next().trim();
                  double size = Double.parseDouble(s);
                  Motorcycle m1 = new Motorcycle(owner, yMM, 
                     value, altFuel, size);
                  addVehicle(m1);
                  break;
                  
               default:
                  addExcludedRecord("Invalid Vehicle Category in:\n" + bob);
                  break;
            }
         }
         catch (NumberFormatException e) {
            addExcludedRecord(e + " in:\n" + bob);
         }
         catch (NoSuchElementException e) {
            addExcludedRecord(e + " in:\n" + bob);
         }
         catch (NegativeValueException e) {
            addExcludedRecord(e + " in:\n" + bob);
         }
      
      }
   }
         
      
      
   
   
   /**
   * @return taxDistrict of UseTaxList.
   */

   public String getTaxDistrict() {
      return taxDistrict;
   }
   
   /**
   * @param taxDistrictIn sets taxDistrict.
   */

   public void setTaxDistrict(String taxDistrictIn) {
      taxDistrict = taxDistrictIn;
   }
   
   /**
   * @return vehicleList of UseTaxList.
   */

   public Vehicle[] getVehicleList() {
      return vehicleList;
   }
   
   /**
   * @return excludedRecords of UseTaxList.
   */

   public String[] getExcludedRecords() {
      return excludedRecords;
   }
   
   /**
   * @param vehicleIn of UseTaxList.
   */

   public void addVehicle(Vehicle vehicleIn) {
      vehicleList =  Arrays.copyOf(vehicleList, vehicleList.length + 1);
      vehicleList[vehicleList.length - 1] = vehicleIn;
   }
   
   /**
   * @param recordIn of UseTaxList.
   */

   public void addExcludedRecord(String recordIn) {
      excludedRecords =  Arrays.copyOf(excludedRecords, 
         excludedRecords.length + 1);
      excludedRecords[excludedRecords.length - 1] = recordIn;
   }
   
   /**
   * @return output of UseTaxList.
   */

   public String toString() {
      String output = "";
     
      for (Vehicle v1 : vehicleList) {
         output += "\n" + v1 + "\n";
      }
     
      return output;
   }
   
   /**
   * @return total use tax of UseTaxList.
   */

   public double calculateTotalUseTax() {
      double total = 0.0;
      
      for (Vehicle v1 : vehicleList) {
         total += v1.useTax();
      }
      
      return total;
   
   }
   
   /**
   * @return total value of UseTaxList.
   */

   public double calculateTotalValue() {
      double total = 0.0;
      
      for (Vehicle v1 : vehicleList) {
         total += v1.getValue();
      }
      
      return total;
   
   }
   
   /**
   * @return output of UseTaxList.
   */

   public String summary() {
      DecimalFormat formatter = new DecimalFormat("###,###.00");
      String output = "------------------------------\n";
      output += "Summary for " + taxDistrict;
      output += "\n------------------------------";
      output += "\nNumber of Vehicles: " + vehicleList.length;
      output += "\nTotal Value: $" + formatter.format(calculateTotalValue());
      output += "\nTotal Use Tax: $" + formatter.format(calculateTotalUseTax())
          + "\n";
      
      return output;
   
   }
   
   /**
   * @return output of UseTaxList.
   */

   public String listByOwner() {
      Arrays.sort(vehicleList);
      String output = "------------------------------\n";
      output += "Vehicles by Owner\n";
      output += "------------------------------\n";
      
      for (Vehicle v1 : vehicleList) {
         output += "\n" + v1 + "\n";
      }
      
      return output;
   
   }
   
   /**
   * @return output of UseTaxList.
   */

   public String listByUseTax() {
      Arrays.sort(vehicleList, new UseTaxComparator());
      String output = "------------------------------\n";
      output += "Vehicles by Use Tax\n";
      output += "------------------------------\n";
      for (Vehicle v1 : vehicleList) {
         output += "\n" + v1 + "\n";
      }
   
      return output;
   
   }
   
   /**
   * @return output of UseTaxList.
   */

   public String excludedRecordsList() {
      String output = "------------------------------\n";
      output += "Excluded Records\n";
      output += "------------------------------\n";
      for (String v1 : excludedRecords) {
         output += "\n" + v1 + "\n";
      }
      return output;
   
   }

}