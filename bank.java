import java.util.HashMap;
public class bank {
	//properties
	HashMap bank = new HashMap();
	
	
	//methods
	
	//add account
	public boolean addAccounts( accounts newAccount){
		bank.put(newAccount. accountID, newAccount);
		System.out.println("This account has been added");
		return true;
	}
	
	//remove account
	public boolean removeAccountWithAccounID(String accountID, double balance){
		if( balance == 0){
			if (bank.containsKey(accountID)){
				bank.remove(accountID);
				System.out.println("This account has been removed");
				return true;
				}
			else {
				System.out.println("Sorry you can't delete this account");
				return false;
			}
			
		}
		else{
			return false;
			}
	}
	
	//print all accounts
	public void printAccounts(){
		accounts temp;
		for(Object key: bank.keySet()){
			temp= (accounts)bank.get(key);
			temp.printAccountInfo();
		}
	}
}