package dawson112.assignments;
import java.util.Scanner;

public class ShapeApplication {	
	public static void main(String[] args) {
		//Creates a scanner and asks the user for input
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Enter the X location of your circle");
		double circleX = reader.nextDouble();
		
		System.out.println("Enter the Y location of your circle");
		double circleY = reader.nextDouble();
		
		System.out.println("Enter the radius of your circle");
		double circleRadius = reader.nextDouble();
		
		System.out.println("Enter the upper left X coordinate of your rectangle");
		double rectangleUpperLeftX = reader.nextDouble();
		
		System.out.println("Enter the upper left Y coordinate of your rectangle");
		double rectangleUpperLeftY = reader.nextDouble();
		
		System.out.println("Enter the lower right X coordinate of your rectangle");
		double rectangleLowerRightX = reader.nextDouble();
		
		System.out.println("Enter the lower right Y coordinate of your rectangle");
		double rectangleLowerRightY = reader.nextDouble();
		
		//Creates a new circle and displays information about it
		Circle circle = new Circle(circleX, circleY, circleRadius);
		circle.display();
		
		//Creates a rectangle and displays information about it
		Rectangle rectangle = new Rectangle(rectangleUpperLeftX, rectangleUpperLeftY, rectangleLowerRightX, rectangleLowerRightY);
		rectangle.display();
		
		//Checks if any of the corners of the rectangle are contained in the circle
		if (rectanglePartyInsideCircle(circle, rectangle)) {
			//If so, print the successful message
			System.out.println("At least one of the 4 corners is contained in the circle");
		} else {
			//Else, print the unsuccessful message
			System.out.println("None of the 4 corners are contained in the circle");
			
			//Creates a counter to check the amount of time that the loop will repeat
			int counter = 0;
			
			//Increases the radius by one every time it checks for corners contained
			//in the circle and returns false
			while (rectanglePartyInsideCircle(circle, rectangle) == false) {
				circleRadius++;
				circle.setRadius(circleRadius);	
				counter++;
			}
			
			//Prints the amount of times the circle's radius grew
			System.out.println("After growing the radius " + counter + " times the circle now contains at least one corner of the rectangle");
		}
		
		//Closes the scanner
		reader.close();
	}
	
	//Method to check if any of rectangle's corners are contained in the circle
	public static boolean rectanglePartyInsideCircle(Circle circle, Rectangle rectangle) {
		return circle.contains(rectangle.getLowerRightX(), rectangle.getLowerRightY())
				|| circle.contains(rectangle.getLowerRightX(), rectangle.getUpperLeftY()) 
				|| circle.contains(rectangle.getUpperLeftX(), rectangle.getLowerRightY())
				|| circle.contains(rectangle.getUpperLeftX(), rectangle.getUpperLeftY());
	}
}
