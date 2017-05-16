/* Cate Zwiercan
 * 2/8/16
 * 
 * This program gives you the tip and total for your bill
 */
import java.util.Scanner;
public class TipCalc {

	public static void main(String[] args) {
		// welcome the user 
		System.out.println("Welcome to Tip-o-Matic! Here, we will give you the total price with various types of tip amounts to your bill!\n");
		
		// get the subtotal from user
		Scanner input= new Scanner(System.in);
		System.out.print("Enter the bill subtotal:  ");
		double subtotal= input.nextDouble();
		
		// 10% tip equation
		double percent10= subtotal * .1;
		double total1= subtotal + percent10;
				
		// 15% tip equation
		double percent15 = subtotal * .15;
		double total2= subtotal + percent15;
		
		// 20% tip equation
		double percent20 = subtotal * .2;
		double total3= subtotal + percent20;
		
		// print the tip prices and total
		System.out.format("At 10%%, the tip is $%.2f and the total is $%.2f\n",percent10,total1);
		System.out.format("At 15%%, the tip is $%.2f and the total is $%.2f\n", percent15,total2);
		System.out.format("At 20%%, the tip is $%.2f and the total is $%.2f\n",percent20, total3);
		System.out.print("Thanks for using Tip-o-Matic!");
	}

}
