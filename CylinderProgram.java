/*  Cate Zwiercan
 * 2/1/16
 * this program will calculate the surface area and volume of a cylinder
 */

import java.util.Scanner;
public class CylinderProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Welcome the user
		System.out.println("Welcome to Cyculator! Here you can calculate the surface area and volume of any cylinder. Lets begin!");
		
		// ask for radius of cylinder
		Scanner input= new Scanner(System.in);
		System.out.print("What is the radius of the cylinder? ");
		double radius= input.nextDouble();
		
		// ask for height of cylinder
		System.out.print("What is the height of the cylinder? ");
		double height= input.nextDouble();
		
		//surface area equation
		double surfaceArea = 2* 3.14159 * radius * height + 2 * 3.14159 * radius *radius;
		
		//volume equation
		double volume= 3.14159* radius* radius * height;
		
		// say what the surface area is
		System.out.println("The surface area of the cylinder is " + surfaceArea);
		
		// say what the volume is
		System.out.println("The volume of the cyclinder is " + volume);
		System.out.print("Thanks for using Cyculator! ");
		input.close(); 
	}

}
