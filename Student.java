
public class Student {
	// properties
	int weight;
	int age;
	String name; 
	String gender;
	
	//constructors
	Student(String newName, String newGender, int newAge, int newWeight){
		name = newName;
		gender = newGender;
		age = newAge;
		weight = newWeight;	
	}
	
	// methods
	
	public void printStudentDetails(){
		System.out.println("Name: "+ name+ "\nGender: "+ gender+ "\nAge: "+ age+ "\nWeight: "+ weight);
	
	}
}
