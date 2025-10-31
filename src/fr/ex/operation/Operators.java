package fr.ex.operation;

public class Operators {
	
	// Question 6.1
	
	// Method to add 2 integers
	public static int add(int x, int y) {
		return x + y;
	}
	
	// Method to subtract two integers
	public static int sub(int x, int y) {
		return x - y;
	}
	
	// Method to multiply 2 integers
	public static int multiply(int x, int y) {
		return x * y;
	}
	
	// Method to divide 2 integers, it returns the first integer if we try to divide by 0
	public static int divide(int x, int y) {
		if (y != 0) {
			return x / y;
		}
		return x;
	}

	public static void main(String[] args) {
		
		// Tests for each method
		System.out.println("Result of 5 + 2: " + add(5, 2));
		System.out.println("Result of 5 - 2: " + sub(5, 2));
		System.out.println("Result of 5 * 2: " + multiply(5, 2));
		System.out.println("Result of 3 / 0: " + divide(3, 0));
	}

}
