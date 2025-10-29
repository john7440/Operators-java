package fr.ex.operation;

public class Pattern {
	
	// Question 6.2
	public static void patternForTriangle(int height) {
		
		for (int i = 1; i <= height; i++) {
			for (int space = 1; space <= height -i ; space++) {
				System.out.print(" ");
			}
			for (int star = 1; star <= (2 * i - 1); star++) {
	            System.out.print("*");
	        }
	        System.out.println();
			
		}
	}

	public static void main(String[] args) {
			
		// We test the pattern with height = 7, like in the example
		patternForTriangle(7);
			
	}

}
