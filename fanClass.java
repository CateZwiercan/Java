
public class fanClass {
	// properties
	private int newSpeed;
	private boolean onOrOff;
	private double newRadius;
	private String newColor;
	
	// default fan
	public fanClass(){
		newSpeed = 1;
		newRadius = 5;
		onOrOff = false;
		newColor = "blue";
	}
	
	// specific fan properties
	public fanClass (int speed, boolean on, double radius, String oldColor ){
		newSpeed = speed;
		onOrOff = on;
		newRadius = radius;
		newColor = oldColor;
		
	}
	
	// int named speed
	public void setSpeed (int speed){
		newSpeed = speed;
	}
	
	// get speed
	public int getSpeed(){
		return newSpeed;
	}
	
	//  boolean named on that specifies if the fan is on 
	public void setOn(boolean on){
		onOrOff = on;
		
	}
	
	// get if fan is on or not
	public boolean getOn(){
		return onOrOff;
	}
	
	//private double named radius that specifies the radius of the fan
	public void setRadius(double radius){
		newRadius = radius;
	}
	
	// get radius
	public double getRadius(){
		return newRadius;
	}
	//string named color that specifies the color of the fan 
	public void setColor (String oldColor){
		newColor = oldColor;
	}
	
	// get color
	public String getColor(){
		return newColor;
	}
	
	//method named toString() that returns a string description for the fan
	public String toString(){
		return "The speed is "+ newSpeed + ". The fan is on: " + onOrOff + ". The fan is " + newColor + ". The radius of the fan is "+ newRadius ;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// make fan 1
		fanClass fan1 = new fanClass(12, true, 10.0 , "yellow" );
		
		//make fan2
		fanClass fan2 = new fanClass(7, false, 5.0 , "blue" );
		
		// to string method for fan1
		System.out.println(fan1.toString());
		
		// to string method for fan2
		System.out.println(fan2.toString());
	}

}
