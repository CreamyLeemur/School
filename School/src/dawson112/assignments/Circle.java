package dawson112.assignments;

public class Circle {
	//Creates the private variables
	private double xCoord;
	private double yCoord;
	private double radius;
	
	//Creates the constructor which assigns all values to variables once called
	public Circle(double xCoord, double yCoord, double radius) {
		this.xCoord = xCoord;
		this.yCoord = yCoord;
		this.radius = radius;
	}
	
	//Method to get the x coordinate
	public double getXCoord() {
		return this.xCoord;
	}
	
	//Method to get the y coordinate
	public double getYCoord() {
		return this.yCoord;
	}
	
	//Method to get the radius
	public double getRadius() {
		return this.radius;
	}
	
	//Method to set the x coordinate
	public void setXCoord(double xCoord) {
		this.xCoord = xCoord;
	}
	
	//Method to set the y coordinate
	public void setYCoord(double yCoord) {
		this.yCoord = yCoord;
	}
	
	//Method to set the radius
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	//Method to get the area of the circle
	public double getArea() {
		return Math.pow(this.radius, 2) * Math.PI;
	}
	
	//Method to get the circumference of the circle
	public double getPerimeter() {
		return (2 * this.radius) * Math.PI;
	}
	
	//Method to display information about the circle
	public void display() {
		System.out.println("The circle is centered at (" + this.xCoord + "," + this.yCoord + ") and has a radius of " + this.radius);
		System.out.println("The circle has an area of " + this.getArea() + " and a perimeter of " + this.getPerimeter());
	}
	
	//Method to check if a certain point is contained in the circle using the given formula
	public boolean contains(double aCoord, double bCoord) {
		return Math.sqrt((this.xCoord - aCoord) * (this.xCoord - aCoord) + (this.yCoord - bCoord) * (this.yCoord - bCoord)) < this.radius;
	}
}
