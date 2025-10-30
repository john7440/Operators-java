package fr.ex.operation;
import java.util.Scanner;

public class Recursive {
	
	// Recursive method to calculate the factorial of a number
	public static int factorial(int number) {
		
		// Base case: if number is greater than 1, we multiply it recursively
		if (number > 1) {
			return number * factorial(number -1);
		} else {
			// Base case: factorial of 1 or 0 is 1
			return 1;
		}
	}

	public static void main(String[] args) {
		
		 // Prompt the user to enter a number
		System.out.println("Factorial Check of: ");
		Scanner scan = new Scanner(System.in);
		int nums = scan.nextInt();
		scan.close();
		
		// Print the result using formatted output
		System.out.printf("Factorial of %d is: ", nums);
		System.out.print(factorial(nums));
		
		
	}

}
