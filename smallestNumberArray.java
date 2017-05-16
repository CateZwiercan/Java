import java.util.Scanner;
public class smallestNumberArray {

	// smallest number array method
	public static double min(double[] array){
		
		// set up min as the first position 
		double min = array[0];
		
		// make for loop to check the values
		for ( int index = 1; index < array.length; index++){
		
			// if the index is less then the min value
			if (array[index] < min){
				
				// change min value to index
				min = array[index];
			}
		}
	
		return min ;
	}

	// average of an array method
	
	// int average
	public static int average(int[ ] array){
		int total = 0;
		int average;
	
		// make for each loop to go through numbers
		for (int num : array ){
			
			// add each number together	
			total += num;
		}
			
		// take all the added numbers and divide it by numbers total
		average = total / 10;
		
		return average;
	}
	
	
	// double average
	public static double average(double[ ] array){
		double total = 0;
		double average;
	
		// make for each loop to go through numbers
		for (double num : array ){
			
			// add each number together	
			total += num;
		}
			
		// take all the added numbers and divide it by numbers total
		average = total / array.length;
		
		return average;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// set up array
		double [] numbers = new double [10];
		int [] numbersInt = new int [10];
		// set up scanner
		Scanner input = new Scanner(System.in);
		
		// prompt user outside for loop
		System.out.println("Enter 10 double numbers:");
		
		// for loop for each time asking for each number 10 times
		for (int i = 0; i < 10; i++){
			numbers[i] = input.nextDouble();
			
		}
		
		// prompt user for int numbers outside for loop
		System.out.println("Enter 10 more integer numbers:");
		
		// for loop for each time asking for each number 10 times
		for (int i = 0; i < 10; i++){
			numbersInt[i] = input.nextInt();
					
		}
		// call smallest number method 
		double smallest = min(numbers);
		
		//print out the smallest number
		System.out.println();
		System.out.print("Minimum number: ");
		System.out.print(smallest);
		
		// call average method
		double average = average(numbers);
		
		//print out average of numbers
		
		System.out.println();
		System.out.print("Average of double array: ");
		System.out.print(average);
		
		// call average method
		int averageInt = average(numbersInt);
				
		//print out average of numbers
				
		System.out.println();
		System.out.print("Average of int array: ");
		System.out.print(averageInt);
				
	}

}
