package fr.ex.operation;

// Question 6.4 and 6.5
public class SumAndSubMatrix {
	
	public static int[][] addMatrices(int[][] A, int[][] B){
		// This method take 2 matrix (same shape!!) and 
		// add each rows to the other one (the same row),
		// then it returns the result:
		int rows = A.length;
		int cols = A[0].length;
		
		if (B.length != rows || B[0].length != cols) {
            throw new IllegalArgumentException("Matrixes must be the same shape!");
        }
		
		int[][] result = new int[rows][cols];
		
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				result[i][j] = A[i][j] + B[i][j];
				
			}
		}
		
		return result;
	}
	
	public static int[][] subMatrices(int[][] A, int[][] B){
		// This method take 2 matrix (same shape!!) and 
		// Subtract each rows to the other one (the same row),
		// then it returns the result:
		int rows = A.length;
		int cols = A[0].length;
		
		if (B.length != rows || B[0].length != cols) {
            throw new IllegalArgumentException("Matrixes must be the same shape!");
        }
		
		int[][] result = new int[rows][cols];
		
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				result[i][j] = A[i][j] - B[i][j];
				
			}
		}
		
		return result;
	}
	
	public static void printMatrix(int[][] matrix) {
		// This method is made to display the matrix to make
		// it easy to read:
		for (int[] row: matrix) {
			for (int value : row) {
				System.out.print(value + ", ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// This is the main method, we initialize 2 matrix
		// and perform different operations on them (add, sub):

		int[][] matrix1 = {
				{1, 2, 0},
				{4, 3, -1}
		};

		int[][] matrix2 = {
				{5, 2, 3},
				{1, 3, 4}
		};
		
		int[][] newMatrixAdd = addMatrices(matrix1, matrix2);
		System.out.println("Result of matrix1 + matrix2:");
		printMatrix(newMatrixAdd);
		
		int[][] newMatrixSub = subMatrices(matrix1, matrix2);
		System.out.println("\nResult of matrix1 - matrix2:");
		printMatrix(newMatrixSub);
		
	}

}
