
public class rectangle {
	//properties
	double length;
	double width;
	
	// constructors
	rectangle() {
		length=1;
		width=1;
	}
	rectangle (double newLength, double newWidth){
		length=newLength;
		width=newWidth;
	}
	
	//Methods
	
	// area
	double getArea(){
		return length * width;
	}
	// perimeter
	 double perimeter(){
		 return (length *2) + (width *2);
	 }
	 
}

