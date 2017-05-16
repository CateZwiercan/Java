
public class student extends person{

	// properties
	private String name;
	private String address;
	private String phoneNumber;
	private String email;
	private String status;
	
	// constructor
	public student(String personName, String personAddress, String personNumber, String personEmail, String studentStatus){
		super(personName, personAddress, personNumber, personEmail);
		status = studentStatus;
	}

	// methods
	// set status
	public void setStatus(String newStatus){
		status = newStatus;
	}
	
	// get status
	public String getStatus(){
		return status;
	}
	
		
	//toString 
	public String toString(){
		return "Name: "+ this.getName() + ", Address: "+ this.getAddress() + ", Phone Number: "+ this.getNumber() + ", Email: " + this.getEmail() + ", Status: "+ status;
	}
}
