// Cate Zwiercan
public class CircleExercise {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Define the circle class with two constructors
		 // Create a circle with radius 1
        Circle circle1 = new Circle();        // no arguments - creates the default circle
        System.out.println("The area of the circle of radius " + circle1.radius + " is " + circle1.getArea());
        
        // Create a circle with radius 25
        Circle circle2 = new Circle(25);
        System.out.println("The area of the circle of radius " + circle2.radius + " is " + circle2.getArea());
        
        // Create a circle with radius 125 - you write this!
        
        
 
        
        // Modify radius of circle2 and get new area
        circle2.setRadius(100);
        System.out.println("The area of the circle of radius " + circle2.radius + " is " + circle2.getArea());
        
        // Modify radius of circle3 and get new area - you write this!
          Circle circle3 = new Circle(29);
          System.out.println("The area of the circle of radius " + circle3.radius + " is " + circle3.getArea());

          // new rectangle
          rectangle rectangle1= new rectangle(2,3);
          System.out.println("The area of the rectangle is "+ rectangle1.getArea() + " and the perimeter is "+ rectangle1.perimeter());
          
          //new triangle
          Triangle triangle1 = new Triangle(3,4);
          System.out.println("The area of this triangle is "+ triangle1.getArea());
 
    }

 
	}
