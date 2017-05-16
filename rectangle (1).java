
public class rectangle extends shapes {
	// properties
	double length;
	double width;
	
	//constructors
	public rectangle (){
		length= 1;
		width = 2;
	}
	
	//constructors 2
	public rectangle(double newLength, double newWidth){
			length = newLength;
			width = newWidth;
		}
	
	//constructors with shapes properties
	public rectangle(double newLength, double newWidth,String newColor, boolean newFilled){
		length = newLength;
		width = newWidth;
		setColor(newColor);
		setFilled(newFilled);
	}
	
	//methods
	
	//set length
	void setLength(double newLength) {
		length = newLength;
	}
	
	//set width
	void setWidth(double newWidth) {
		width= newWidth;
	}
	
	//get length
	double getLength(){
		return length;
	}
	
	//get width
	double getWidth(){
		return width;
	}
	
	//area of rectangle
	double getArea(){
		return length * width;
	}
	//perimeter of rectangle
	double getPerimeter(){
		return length + length + width + width;
	}
	
	//print
	public void printRectangle(){
		System.out.println("Length: "+ length+ " Width: "+ width);
		System.out.println(toString());
	}
}
