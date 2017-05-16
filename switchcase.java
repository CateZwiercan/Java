/* Cate Zwiercan
 * 2/16/16
 */
import java.util.Scanner;
public class switchcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		System.out.print("Enter the number of the month you want:  ");
		int month= input.nextInt();
		input.close();
		
		switch (month){ 
		case 1 : System.out.print("The month is Janurary. ");
			break;
		case 2 : System.out.print("The month is Feburary. ");
			break;
		case 3 : System.out.print("The month is March. ");
			break;
		case 4 : System.out.print("The month is April. ");
			break;
		case 5 : System.out.print("The month is May. ");
			break;
		case 6 : System.out.print("The month is June. ");
			break;
		case 7 : System.out.print("The month is July. ");
			break;
		case 8: System.out.print("The month is August. ");
			break;
		case 9 : System.out.print("The month is September. ");
			break;
		case 10 : System.out.print("The month is October. ");
			break;
		case 11 : System.out.print("The month is November. ");
			break;
		case 12 : System.out.print("The month is December. ");
			break;
		default: System.out.print("The number you entered is not a month.");
			break;
		}
		
		switch (month){ 
		case 1 : System.out.print("There are 31 days.");
			break;
		case 2 : System.out.print("There are 29 days.");
			break;
		case 3 : System.out.print("There are 31 days.");
			break;
		case 4 : System.out.print("There are 30 days.");
			break;
		case 5 : System.out.print("There are 31 days.");
			break;
		case 6 : System.out.print("There are 30 days.");
			break;
		case 7 : System.out.print("There are 31 days.");
			break;
		case 8: System.out.print("There are 31 days.");
			break;
		case 9 : System.out.print("There are 30 days.");
			break;
		case 10 : System.out.print("There are 31 days.");
			break;
		case 11 : System.out.print("There are 30 days.");
			break;
		case 12 : System.out.print("There are 31 days.");
			break;
		default: System.out.print("The number you entered is not a month.");
			break;
		}
	}

}
