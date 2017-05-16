
public class faculty extends employee {
	// properties
	private String name;
	private String address;
	private String phoneNumber;
	private String email;
	private String office;
	private double salary;
	private String dateHired;
	private String officeHours;
	private String rank;
	
	// constructor
	public faculty(String personName, String personAddress, String personNumber, String personEmail, String personOffice, double personSalary, String personDateHired, String personOfficeHours, String personRank){
	super(personName, personAddress, personNumber, personEmail, personOffice, personSalary, personDateHired);
	officeHours = personOfficeHours;
	rank = personRank;
	}
	
	// methods
	// set office hours
	public void setOfficeHours(String newOfficeHours){
		officeHours = newOfficeHours;
	}
	
	// get office hours
	public String getOfficeHours(){
		return officeHours;
	}
	
	// set rank
	public void setRank(String newRank){
		rank = newRank;
	}
	
	// get rank
	public String getRank(){
		return rank;
	}
	 
	// to string
	public String toString(){
		return "Name: "+ this.getName() + ", Address: "+ this.getAddress() + ", Phone Number: "+ this.getNumber() + ", Email: " + this.getEmail() + ", Office: "+ this.getOffice() + ", Salary: "+ this.getSalary()+ ", Date Hired: "+ this.getDateHired()+ ", Office Hours: "+ officeHours + ", Rank: "+ rank;
	}
}
