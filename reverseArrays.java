import java.util.Scanner;

public class reverseArrays {
	
	// reverse method
	public static int [] reverse(int[] num) {
		
		//initialize variable
		int temp;
		
		// set up method to swap the numbers
		for (int i = 0, j = num.length-1 ; i < num.length/ 2; i++, j-- ) {
			
			// make temp variable to store i
			temp = num[i];
			
			// put the j poisiton in i
			num[i] = num[j];
			
			// make the j position i
			num[j] = temp;
		
		}
	return num;
	}
	
	// eliminateDuplicates method

	public static int [] eliminateDuplicates(int[] num){
		
		// sort numbers
		java.util.Arrays.sort(num);
	
		int[] newArray = new int [10];
		
		// start the new array with the 0 position of num since the first num is unique
		newArray[0]= num[0];
		
		// set up J variable
		int j= 1;
		
		// if numbers are the same
		for ( int i = 1; i < num.length; i++ ){
		
		// copy numbers to new array	
			
			// check to see if the number is the same as the next number
			if (num[i] != num[i-1]){
				
				// if they are not the same add it to the new array
				newArray[j] = num[i];
				
				// add one to j to continue the loop
				j++;
				}
			
		}
		//return
		return newArray;

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// set up arrays and scanner
		int [] newNumbers = new int [10];
		int [] numbers = new int[10];
		Scanner input = new Scanner(System.in);
		
		for (int count = 0; count < 10; count++){
		
			// ask user for 10 numbers
			System.out.println("Enter number: ");
			numbers [count] = input.nextInt();
		}
		
		// call method to reverse numbers
		numbers = reverse(numbers);
		
		System.out.println();
		System.out.print("Reversed numbers: ");
		
		// print out each number in reverse method
		for (int item : numbers ){
			System.out.print(item);
		}
		
		// call method to get rid of duplicate numbers
		newNumbers = eliminateDuplicates(numbers);
		
		// print out each number in eliminate duplicate number
		System.out.println();
		System.out.print("Better, less clutered list of numbers: ");
		for (int item : newNumbers ){
			System.out.print(item);
	}

}
}
