package fr.ex.operation;

import java.util.Arrays;
import java.util.List;

public class SumMaxArray {
	
	// A method to find the 2 maximum values in a List:
		public static int[] getTwoMaxValues(List<Integer> numbers) {
			if (numbers == null || numbers.size() < 2) {
				throw new IllegalArgumentException("The list must contain at least 2 integers!");
			}
			
			int max1 = Integer.MIN_VALUE;
			int max2 = Integer.MIN_VALUE;
			
			for (int num : numbers) {
				if (num >= max1){
					max2 = max1;
					max1 = num;
				} else if (num > max2) {
					max2 = num;
				}
			}
			return new int[] {max1,max2};
		}
		

	public static void main(String[] args) {
		
		List<Integer> myList = Arrays.asList(78, 6, -250,2, 12, 9);
		int[] top2Numbers = getTwoMaxValues(myList);
		System.out.println("The sum of the 2 highest numbers in " + myList + " is: " + Operators.add(top2Numbers[0], top2Numbers[1]));

	}

}
