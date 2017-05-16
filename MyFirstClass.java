import java.util.Scanner;
public class MyFirstClass {
	/** 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		Scanner input= new Scanner(System.in);
		System.out.print("What is your name? ");
		String name= input.nextLine();
		System.out.print("Welcome to Java " + name);
		input.close(); 
	}

}
