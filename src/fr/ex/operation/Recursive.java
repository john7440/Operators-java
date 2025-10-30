package fr.ex.operation;
import java.util.Scanner;

public class Recursive {
	
	public static int factorial(int number) {
		
		if (number > 1) {
			
			return number * factorial(number -1);
		} else {
			return 1;
		}
	}

	public static void main(String[] args) {
		
		System.out.println("Factorial Check of: ");
		Scanner scan = new Scanner(System.in);
		int nums = scan.nextInt();
		scan.close();
		System.out.printf("Factorial of %d is: ", nums);
		System.out.print(factorial(nums));
		
		
	}

}
