package fr.ex.operation;

public class SumMatrix {
	
	public static int[][] addMatrices(int[][] A, int[][] B){
		
		int rows = A.length;
		int cols = A[0].length;
		
		int[][] result = new int[rows][cols];
		
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				result[i][j] = A[i][j] + B[i][j];
				
			}
		}
		
		return result;
	}

	public static void main(String[] args) {

		int[][] matrix1 = {
				{1, 2, 0},
				{4, 3, -1}
		};

		int[][] matrix2 = {
				{5, 2, 3},
				{1, 3, 4}
		};
		
		System.out.println(addMatrices(matrix1, matrix2));
		
	}

}
