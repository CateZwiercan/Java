import java.util.Scanner;
public class stockClass {
//properties
	static String  symName;
	static String stockName;
	static double newCurrentPrice;
	static double newClosingPrice;

//constructor
	
	// constructor that creates stock with specific symbol and name
	public static void Stock (String newName, String newSymbol){
		symName = newSymbol;
		stockName = newName;
	}
	
//methods
	// string for symbol of stock
	public static void setSymbol(String symbol){
		 symbol = symName;
	}
	
	// string for name of stock
	public static void setName(String name){
		 name = stockName;
	}
	
	// get stock symbol
	public static String getStockSymbol(){
		return symName;
	}
	
	//get stock name
	public static String getStockName(){
		return stockName;
	}
	
	// double for  set previous Closing Price
		public static void setPreviousClosingPrice(double closingPrice){
			newClosingPrice = closingPrice;
		}
		
	// double  named set current price
		public static void setCurrentPrice(double currentPrice){
			newCurrentPrice = currentPrice;
		}
	
	// get previous closing price
		public static double getPreviousClosingPrice(){
			return newClosingPrice;
		}
		
	//get current price
		public static double getCurrentPrice(){
			return newCurrentPrice;
		}
		
	// method names  getChangedPercent()
	public static double getChangedPercent(){
		double difference = newClosingPrice - newCurrentPrice;
		double total = difference / newClosingPrice;
		double percentChanges = total * 100; 
		return percentChanges;
	}
	
	
	//**********************************************************/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ask for symbol name
		Scanner input = new Scanner(System.in);
		System.out.println("Enter symbol name: ");
		String symbolName = input.nextLine();
		
		
		// ask for stock name
		System.out.println("Enter stock name: ");
		String stockName = input.nextLine();
		
		// ask for previous closing price
		System.out.println("Enter yesterday's closing price: ");
		double closingPrice = input.nextDouble();
		
		//ask for current price
		System.out.println("Enter today's current price: ");
		double currentPrice = input.nextDouble();
		
		// Set up stock
		Stock(stockName, symbolName);
		
		// set current price
		setCurrentPrice(currentPrice);
		
		// set previous Price
		setPreviousClosingPrice(closingPrice);
		
		// get changed percent
		double percentChanged = getChangedPercent();
		
		
		System.out.println("Stock Name: "+ getStockName());
		System.out.println("Stock Symbol: "+ getStockSymbol());
		System.out.println("Stock previous closing price: "+ getPreviousClosingPrice());
		System.out.println("Stock current price: "+ getCurrentPrice());
		System.out.format("Stock percent change: %.2f %%", percentChanged );
	}

}
