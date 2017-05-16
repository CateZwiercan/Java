package practice;
import java.util.Scanner;
public class loopsExercises {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// TODO Auto-generated method stub

		//Name: Tessa Mazzarella Title: loops exercises
		int i;
		int j;
		
		//Test 1 
		for (i = 1; i < 5; i++){
			j = 0;
			while (j < i) {
				System.out.println(j + " ");
				j++;
			
			}
		
		//Test 2 
		i = 0;
		while (i<5) {
			for(j = i; j> 1;j--)
					System.out.print(j + " ");
			System.out.println("****");
			i++;
		}
		
		//Test 3
		i = 1;
		do {
				int num = 1;
				for (j = 1; j<= i;j++){
					System.out.print(num + "G");
					num +=2;
				}
				System.out.println();
				i++;
			} while (i<=5);
			
		}
}}
