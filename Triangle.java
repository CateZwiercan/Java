
public class Triangle {
	
	// properties
	double base;
	double height;
	
	//constructors
	Triangle(){
		base=1;
		height=2;
	}
	Triangle ( double newBase, double newHeight){
		base=newBase;
		height=newHeight;
	}
	
	//methods
	
	//area
	double getArea(){
		return .5 * base * height;
	}

	
}
