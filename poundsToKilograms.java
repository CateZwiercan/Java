/* Cate Zwiercan
 * 3/2/16
 * This program will covert kilograms to pounds and vice versa
 */
import java.util.Scanner;

public class poundsToKilograms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k;
		int m=20;
		double kilo;
		double pounds;
		System.out.println("Kilograms \t Pounds");
		System.out.println("-----------------------------");
			for (k= 1; k<200; k= k+2){
				pounds= k* 2.2;
				
				System.out.format("%d \t\t %.1f\n",k,pounds);
	}
		System.out.println("\n");
		System.out.println("Pounds \t\t Kilogram");
		System.out.println("-----------------------------");
			while (m <515 ){
				kilo = m / 2.2;
				System.out.format("%d \t\t %.1f\n",m,kilo);
				m = m+5 ;
			}
 }
}
