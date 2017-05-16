/* Cate Zwiercan
 * 2/18/16
 * This program gives a report card for 3 school subjects for a student
 */
import java.util.Scanner;
public class ReportCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double numGrade1=0;
		double numGrade2=0;
		double numGrade3=0;
				
	// Get the user name
		Scanner input= new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name= input.nextLine();
		
	// Welcome the user
		System.out.println("Hello "+ name+ "! Welcome to your report card. We will give a report card for 3 of your subjects and your GPA!");
	
	// have them enter the first subject
		System.out.print("Enter the first subject: ");
		String sub1= input.nextLine();
		if (sub1.length() > 6) {
			sub1= sub1.substring(0,6);
		}
	// 2nd subject
		System.out.print("Enter the second subject: ");
		String sub2= input.nextLine();
		if (sub2.length() > 6) {
			sub2= sub2.substring(0,6);
		}
	// 3rd subject
		System.out.print("Enter the third subject: ");
		String sub3= input.nextLine();
		if (sub3.length() > 6) {
			sub3= sub3.substring(0,6);
		}
	// enter letter grade for 1st subject
		System.out.print("Enter the letter grade for the first subject: ");
		String grade1= input.nextLine();
		grade1= grade1.toUpperCase();
		
	// letter grade for 2nd subject
		System.out.print("Enter the letter grade for the second subject: ");
		String grade2= input.nextLine();
		grade2= grade2.toUpperCase();
		
	// letter grade for 3rd subject
		System.out.print("Enter the letter grade for the third subject: ");
		String grade3= input.nextLine();
		grade3= grade3.toUpperCase();
		
	// switch for grade
		switch(grade1){
		//a
			case "A" : numGrade1 = 4.00;
			break;
		//b
			case "B" : numGrade1 = 3.00;
			break;
		//c
			case "C" : numGrade1 = 2.00;
			break;
		//d
			case "D" : numGrade1 = 1.00;
			break;
		//f
			case "F" : numGrade1 = 0.00;
			break;
		}
		
	// grade 2
		switch(grade2){
		//a
			case "A" : numGrade2 = 4.00;
			break;
		//b
			case "B" : numGrade2 = 3.00;
			break;
		//c
			case "C" : numGrade2 = 2.00;
			break;
		//d
			case "D" : numGrade2 = 1.00;
			break;
		//f
			case "F" : numGrade2 = 0.00;
			break;
		}
		
	// grade 3
		switch(grade3){
		//a
			case "A" : numGrade3 = 4.00;
			break;
		//b
			case "B" : numGrade3 = 3.00;
			break;
		//c
			case "C" : numGrade3 = 2.00;
			break;
		//d
			case "D" : numGrade3 = 1.00;
			break;
		//f
			case "F" : numGrade3 = 0.00;
			break;
			
		}
	//calculate GPA 
		double gpa = (numGrade1 +  numGrade2 + numGrade3) / 3;
		
	// print the name, subjects and grade and gpa
		System.out.println("\n-------------------------------------------------");
		System.out.println("Student Name: "+ name);
		System.out.println();
		System.out.format("Class %10s %10s", "Grade","Points\n");
		System.out.println("-------------------------------------------------");
		System.out.format("%s %10s %10s\n",sub1.toUpperCase(),grade1,numGrade1 );
		System.out.format("%s %10s %10s\n",sub2.toUpperCase() ,grade2,numGrade2 );
		System.out.format("%s %10s %10s\n",sub3.toUpperCase(),grade3,numGrade3 );
		System.out.println("-------------------------------------------------");
		System.out.format("%6s %10s %10s"," ", "GPA", gpa);
		
		input.close();
	}

}
