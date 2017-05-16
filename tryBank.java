/* Cate Zwiercan
 * 4/25/16
 * 
 *  This program is adding, removing and printing accounts in a bank
 */
public class tryBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// make new bank
		bank TD = new bank();
		
		// give new account info
		accounts Bob = new accounts("123", "Bob");
		accounts Cindy = new accounts("456", "Cindy");
		accounts Carly = new accounts("789", "Carly");
		
	// add all accounts
		TD.addAccounts(Bob);
		TD.addAccounts(Cindy);
		TD.addAccounts(Carly);
		
	//deposit 500 in each
		Bob.deposit(500);
		Cindy.deposit(500);
		Carly.deposit(500);
	
	//print all accounts
		TD.printAccounts();
	
	//try removing account
		TD.removeAccountWithAccounID("456", 500);
	
	//withdrawl all money from one account
		Bob.withdrawl(500);
		
	//remove bob
		TD.removeAccountWithAccounID("123", 0);
	
	// print all accounts again
		TD.printAccounts();
		
	}

}
