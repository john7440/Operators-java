package fr.ex.operation;
import java.util.Scanner;

public class Recursive {
	
	/**
     * Recursive method to calculate the factorial of a number.
     * The factorial of n (n!) is defined as n * (n-1) * ... * 1.
     * Base case: factorial of 0 or 1 is 1.
     *
     * @param number the number to calculate the factorial of
     * @return the factorial result
     */
	public static int factorial(int number) {
		
		// Recursive : if number is greater than 1, we multiply it recursively
		if (number > 1) {
			return number * factorial(number -1);
		} else {
			// Base case: factorial of 1 or 0 is 1
			return 1;
		}
	}

	public static void main(String[] args) {
		
		// Prompt the user to enter a number for factorial calculation
		System.out.println("Factorial Check of: ");
		Scanner scan = new Scanner(System.in);
		int nums = scan.nextInt();
		scan.close();
		
		// Display the result using formatted output
		System.out.printf("Factorial of %d is: ", nums);
		System.out.print(factorial(nums));
		
		
	}

}
