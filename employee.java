
public class employee extends person {
	// properties
	private String name;
	private String address;
	private String phoneNumber;
	private String email;
	private String office;
	private double salary;
	private String dateHired;
	
	// constructors
	public employee(String personName, String personAddress, String personNumber, String personEmail, String personOffice, double personSalary, String personDateHired){
		super(personName, personAddress, personNumber, personEmail);
		office = personOffice;
		salary = personSalary;
		dateHired = personDateHired;
	}
	
	// methods
	// set office
	public void setOffice(String newOffice){
		office = newOffice;
	}
	
	// get office
	public String getOffice(){
		return office;
	}
	
	// set salary
	public void setSalary(double newSalary){
		salary = newSalary;
	}
	
	// get salary
	public double getSalary(){
		return salary;
	}
	// set date hired
	public void setDateHired(String newDateHired){
		dateHired = newDateHired;
	}
	
	// get date hired
	public String getDateHired(){
		return dateHired;
	}
	
	// to string
	public String toString(){
		return "Name: "+ this.getName() + ", Address: "+ this.getAddress() + ", Phone Number: "+ this.getNumber() + ", Email: " + this.getEmail() + ", Office: "+ office + ", Salary: "+ salary+ ", Date Hired: "+ dateHired;
	}
	
}
