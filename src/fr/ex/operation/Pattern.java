package fr.ex.operation;

import java.util.Scanner;

public class Pattern {
	
	// Question 6.2
	/**
     * Prints a centered triangle pattern of a given height using (*).
     * Each row contains spaces followed by an odd number of stars to form a pyramid shape.
     *
     * @param height the number of rows in the triangle
     */
	public static void patternForTriangle(int height) {
		
		// Loop through each row from 1 to the specified height
		for (int i = 1; i <= height; i++) {
			
			// then we print spaces to center the stars
			for (int space = 1; space <= height -i ; space++) {
				System.out.print(" ");
			}
			
			// and we increase the number of (*) by 2 at each row
			for (int star = 1; star <= (2 * i - 1); star++) {
	            System.out.print("*");
	        }
			
			// We move to the next line after each row
	        System.out.println();
			
		}
	}

	public static void main(String[] args) {
		
		// Prompt the user to enter the desired height for the triangle (<40)
		System.out.println("Which height for the triangle ? (<40)");
		Scanner scan = new Scanner(System.in);
		int height = scan.nextInt();
		scan.close();
		
		// Validate the input, it display the pattern if the height is correct,
		// print out an error message otherwise
		if  (height > 0 && height <= 40)  patternForTriangle(height);
		else System.out.println("Invalid input! Please try again!");
		
			
	}

}
