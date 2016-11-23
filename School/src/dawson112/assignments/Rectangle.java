package dawson112.assignments;

public class Rectangle {
	//Creates the private variables
	private double upperLeftX;
	private double upperLeftY;
	private double lowerRightX;
	private double lowerRightY;
	
	//Creates the constructor which assigns all values to variables once called
	public Rectangle(double upperLeftX, double upperLeftY, double lowerRightX, double lowerRightY) {
		this.upperLeftX = upperLeftX;
		this.upperLeftY = upperLeftY;
		this.lowerRightX = lowerRightX;
		this.lowerRightY = lowerRightY;
	}
	
	//Method to get the upper left x coordinate
	public double getUpperLeftX() {
		return this.upperLeftX;
	}
	
	//Method to get the upper left y coordinate
	public double getUpperLeftY() {
		return this.upperLeftY;
	}
	
	//Method to get the lower right x coordinate
	public double getLowerRightX() {
		return this.lowerRightX;
	}
	
	//Method to get the lower right y coordinate
	public double getLowerRightY() {
		return this.lowerRightY;
	}
	
	//Method to get the area of the rectangle
	public double getArea() {
		return (this.lowerRightX - this.upperLeftX) * (this.upperLeftY - this.lowerRightY);
	}
	
	//Method to get the perimeter of the rectangle
	public double getPerimeter() {
		return ((this.lowerRightX - this.upperLeftX) * 2) + ((this.upperLeftY - this.lowerRightY) * 2);
	}
	
	//Method to display information about the rectangle
	public void display() {
		 System.out.println("The rectangle's upper left coordinate is at (" + this.upperLeftX + "," + this.upperLeftY 
				 + ") and lower right coordinate is at (" + this.lowerRightX + "," + this.lowerRightY + ")");
		 System.out.println("The rectangle has an area of " + this.getArea() + " and a perimeter of " + this.getPerimeter());
	}
	
	//Method to check if a certain point is contained in the rectangle
	public boolean contains(double aCoord, double bCoord) {
		return aCoord <= this.lowerRightX && aCoord >= this.upperLeftX && bCoord <= this.upperLeftY && bCoord >= this.lowerRightY;
	}
}
