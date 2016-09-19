package dawson112.labexercises;
import java.util.Scanner;

public class GravelTrack {
	public static void main(String[] args) {
		
		//Creates a scanner named reader for user input
		Scanner reader = new Scanner(System.in);
	
		//Gets the user's input and stores it as doubles
		System.out.println("Enter the diameter of the outer circle:");
		double radOuterCircle = reader.nextDouble() / 2;
		
		System.out.println("Enter the diameter of the inner circle:");
		double radInnerCircle = reader.nextDouble() / 2;
		
		//Calculates the area of the circles
		double areaOuterCircle = Math.PI * Math.pow(radOuterCircle , 2);
		double areaInnerCircle = Math.PI * Math.pow(radInnerCircle , 2);
		
		//Calculates the area of the gravel track
		double areaGravel = areaOuterCircle - areaInnerCircle;
		
		//Calculates then rounds the cost
		double cost = areaGravel * 2.5;
		
		cost = Math.round(cost * 100);
		cost = cost / 100;
		
		//Prints the final result
		System.out.println("The cost to cover the track with gravel will be $" + cost);
		
		//Closes the reader
		reader.close();
	}
	
}
