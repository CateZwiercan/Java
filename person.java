
public class person {

// properties
	private String name;
	private String address;
	private String phoneNumber;
	private String email;
	
// constructors
	public person(String personName, String personAddress, String personNumber, String personEmail){
		name = personName;
		address = personAddress;
		phoneNumber = personNumber;
		email = personEmail;
		numberOfPeople++;
	}
	

//methods
// set name
	public void setName(String newName){
		name = newName;
	}

// get name
	public String getName(){
		return name;
	}
// set address
	public void setAddress(String newAddress){
		address = newAddress;
	}

// get address
	public String getAddress(){
		return address;
	}
// set phone number
	public void setNumber(String newNumber){
		phoneNumber = newNumber;
	}

// get phone number
	public String getNumber(){
		return phoneNumber;
	}
// set email
	public void setEmail(String newEmail){
		email = newEmail;
	}

// get email
	public String getEmail(){
		return email;
	}
	
	//toString 
	public String toString(){
		return "Name: "+ name + ", Address: "+ address + ", Phone Number: "+ phoneNumber + ", Email: " + email;
	}
	
	// number of persons counter
	private static int numberOfPeople = 0;
	
	
	// get number of people
	public static int getNumberOfPeople(){
		return numberOfPeople;
	}
		
	
}
	
	

