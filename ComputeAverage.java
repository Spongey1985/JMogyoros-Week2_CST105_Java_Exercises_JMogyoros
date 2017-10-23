package computeaverage;

/**
 * Summary: Enter 5 integers to get the sum of the integers.
 * Author: Jay S. Mogyoros
 * Date: October 21, 2017
 */
import java.util.Scanner; // Scanner is in the java.util package

public class ComputeAverage {
	public static void main(String[] args) {
		// Create a Scanner object
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter five numbers
		System.out.print("Enter five numbers: ");
		double number1 = input.nextDouble();
		double number2 = input.nextDouble();
		double number3 = input.nextDouble();
		double number4 = input.nextDouble();
		double number5 = input.nextDouble();
		
		
		// Compute average
		double average = (number1 + number2 + number3 + number4 + number5);
		
		// Display results
		System.out.println("The average of " + number1 + " " + number2 + " " + number3 + " " + number4 + " " + number5 + "is" + average);
	}
	
}