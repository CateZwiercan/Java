
public class CircleExerciseConstruction {
	// Define the circle class with two constructors
		public class Circle {
		    double radius;        // This is the only property for a Circle
		    
		    /* Construct a circle with radius 1 - the default circle */
		    Circle() {
		        radius = 1;
		    }
		    
		    /* Construct a circle with specified radius */
		    Circle(double newRadius) {
		        radius = newRadius;
		    }
		    
		    /* Methods */
		    
		    /* Return the area of the circle */
		    double getArea() {
		        return radius * radius * Math.PI;
		    }
		    
		    /* Return the perimeter of the circle */
		    double getPerimeter() {
		        return 2 * radius * Math.PI;
		    }
		    
		    /* Set the radius for the circle */
		    void setRadius(double newRadius) {
		        radius = newRadius;
		    }
		}
}
