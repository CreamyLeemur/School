package dawson112.labexercises;
import java.util.Scanner;

public class Average
{
 public static void main (String[] args)
 {
 //variable declarations
 int number1, number2, number3;
 double average;

 Scanner reader = new Scanner(System.in);
 //Accept the required data

 System.out.println("Enter the first number:");
 number1 = reader.nextInt();

 System.out.println("Enter the second number:");
 number2 = reader.nextInt();

 System.out.println("Enter the third number:");
 number3 = reader.nextInt();

 //Process the data in order to determine the average of the numbers
 average = (number1 + number2 + number3) / 3.0;

 //Display the output
 System.out.println ("************** Average ****************");
 System.out.println ();
 System.out.println ("Number 1:             " + number1);
 System.out.println ("Number 2:             " + number2);
 System.out.println ("Number 3:             " + number3);
 System.out.println ();
 System.out.println ("Average:              " + average);
 
 reader.close();
  } //end main method
} //end Average class