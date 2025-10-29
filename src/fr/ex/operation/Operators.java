package fr.ex.operation;

public class Operators {
	
	// Question 6.1
	public static int add(int x, int y) {
		return x + y;
	}
	
	public static int sub(int x, int y) {
		return x - y;
	}
	
	public static int multiply(int x, int y) {
		return x * y;
	}
	
	public static int divide(int x, int y) {
		if (x != 0 && y !=0) {
			return x / y;
		}
		return 0;
	}

	public static void main(String[] args) {
		
		
		// Tests
		System.out.println("Result of 5 + 2: " + add(5, 2));
		System.out.println("Result of 5 - 2: " + sub(5, 2));
		System.out.println("Result of 3 / 0: " + divide(3, 0));
	}

}
