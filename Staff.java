
public class Staff extends employee {
	// properties
	private String name;
	private String address;
	private String phoneNumber;
	private String email;
	private String office;
	private double salary;
	private String dateHired;
	private String title;
	
	// constructors
	public Staff(String personName, String personAddress, String personNumber, String personEmail, String personOffice, double personSalary, String personDateHired, String personTitle){
		super(personName, personAddress, personNumber, personEmail, personOffice, personSalary, personDateHired);
		title = personTitle;
	}
	
	// methods
	// set title
	public void setTitle(String newTitle){
		title = newTitle;
	}
	
	// get title
	public String getTitle(){
		return title;
	}
	
	// to string 
	public String toString(){
		return "Name: "+ this.getName() + ", Address: "+ this.getAddress() + ", Phone Number: "+ this.getNumber() + ", Email: " + this.getEmail()+ ", Office: "+ this.getOffice() + ", Salary: "+ this.getSalary()+ ", Date Hired: "+ this.getDateHired()+ ", Title: "+  title;
	}
}
