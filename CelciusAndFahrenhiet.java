import java.util.Scanner;
public class CelciusAndFahrenhiet {
// celcius method
	public static void celsiusToFahrenhiet(double temp){	
	// convert celcius to fahrenheit
		double newFahrenhiet = (9.0 / 5) * temp +32;
		
	// print c vs. f
		System.out.println(temp+ " Celcsius = " + newFahrenhiet+ " Fahrenheit" );
		
	// print temp is too hot or cold
		if (newFahrenhiet > 90){
			System.out.println("Way too hot!");
		}
		else if (newFahrenhiet < 32){
			System.out.println("Super cold!");
		}
		return;
		// inputC.close();
	}
	
// fahrentheit method
	public static void fahrenheitToCelcius(double temp){
		// convert fahrentheit to celsius
			double newCelsius = (temp - 32) *5 /9;
			
		// print c vs. f
			System.out.println(newCelsius + " Celcsius = " + temp + " Fahrenheit" );
			
		// print temp is too hot or cold
			if (newCelsius > 33){
				System.out.println("Way too hot!");
			}
			else if (newCelsius < 0){
				System.out.println("Super cold!");
			}
			return;
		// inputF.close();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	// introduce program
		System.out.println("Welcome to the Convertinator! You will be able to convert your desired tempeature into \ncelsuis or fahrenheit!");
	
		// start while loop
		Scanner input = new Scanner(System.in);
		System.out.print("Would you like to begin?");
		String answer= input.nextLine();
	
		while (answer.equals("yes") || answer.equals("Yes")){
			//ask which degree they are using
			System.out.print("Which degree will you be using? Enter 'c' or 'f' ");
			String tempType = input.nextLine();
			
			//if statement for celcius
			if ( tempType.equals("c") | tempType.equals("C")){
				System.out.print("What tmeperature would you like to use?");
				double temp = input.nextInt();
				
				// call celcius method
				
				celsiusToFahrenhiet(temp);
			}
				
			//if statement for fahrenheit
			else if ( tempType.equals("f") || tempType.equals("F")){
				System.out.print("What tmeperature would you like to use?");
				double temp = input.nextInt();
				
	
				//call fahrenheit function
				fahrenheitToCelcius(temp);
			}
			System.out.print("Would you like to convert another temp? ");
			answer = input.nextLine();
		}
	
	 // input.close();
	}
	
}

