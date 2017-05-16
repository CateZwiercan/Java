
public class shapes {

	// properties
	String color;
	boolean filled;
	
	//constructor 1
	public shapes(){
		color = "black";
		filled = false;
	}
	
	// constructor 2
	public shapes(String newColor, boolean newFilled){
		color = newColor;
		filled = newFilled;
	}
	
	//methods
	public String getColor(){
		return color;
	}
	
	public void setColor(String newColor){
		color = newColor;
	}
	
	public boolean isFilled(){
		return filled;
	}
	
	public void setFilled(boolean newFilled){
		filled= newFilled;
	}
	
	public String toString(){
		return "color: "+ color + " and filled: " + filled;
	}
}
