
public class Student {
	// properties
		int weight;
		int age;
		String name; 
		String gender;
		String adminNo; 
		
		//constructors
		Student(String newName, String newGender, int newAge, int newWeight, String newAdminNo){
			name = newName;
			gender = newGender;
			age = newAge;
			weight = newWeight;	
			adminNo = newAdminNo;
		}
		
		// methods
		
		public void printStudentDetails(){
			System.out.println("Name: "+ name+ "\nGender: "+ gender+ "\nAge: "+ age+ "\nWeight: "+ weight);
		
			
		}
}
