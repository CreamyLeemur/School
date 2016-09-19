package dawson112.labexercises;

import java.util.Scanner;

public class TemperatureConverter {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Enter temperature in Fahrenheit:");
		double tempFahrenheit = reader.nextDouble();
		
		double tempCelcius = (tempFahrenheit - 32) * 5 / 9;
		
		System.out.println(tempFahrenheit + " °F equals to " + tempCelcius + " °C");
		
		reader.close();
	}
}
