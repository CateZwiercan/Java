
public class accounts {
	//properties
	String accountID; 
	String name;
	double balance;
	double depositAmount;
	
	//constructors
	accounts(String newAccountID, String newName){
		accountID = newAccountID;
		name = newName;
		balance = 0;
	}
	//methods
	
	//withdrawl
	public void withdrawl(double amount){
		if (amount > balance){
			System.out.println("Sorry, you can't take that much out you only have" + balance);
			
		}
		else{
			balance = balance - amount ;
			System.out.println( "You new balance is "+ balance);
		}
	}
	
	//deposit
	public void deposit(double depositAmount){
		balance = balance + depositAmount;
		System.out.println("Your new balance is "+ balance);
	}
	
	//print info
	public void printAccountInfo(){
		System.out.println( "Account ID: "+ accountID+ ", Name: " + name+ ", Balance: "+ balance);
		}
}
