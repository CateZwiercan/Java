/**
   * Gives contructors NegativeValueException class. 
   *  
   * Project 11.
   * @author Cate Zwiercan.
   * @version December 8, 2017.
   */

public class NegativeValueException extends Exception {
   
   /**
   * constructor.
   */
   public NegativeValueException() {
      super("Numeric values must be nonnegative");
   }

}