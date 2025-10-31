package fr.ex.operation;

// Question 6.4 and 6.5
public class SumAndSubMatrix {
	
    /**
     * Adds two matrices of the same dimensions.
     * Each element in the result is the sum of corresponding elements from A and B.
     *
     * @param A the first matrix
     * @param B the second matrix
     * @return a new matrix containing the element-wise sum
     */
	public static int[][] addMatrices(int[][] A, int[][] B){
		
		int rows = A.length;
		int cols = A[0].length;
		
		// We first check if both matrices have the same shape
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
	
	 /**
     * Subtracts matrix B from matrix A, assuming both have the same dimensions.
     * Each element in the result is the difference of corresponding elements from A and B.
     *
     * @param A the first matrix
     * @param B the second matrix
     * @return a new matrix containing the element-wise difference
     */
	public static int[][] subMatrices(int[][] A, int[][] B){
	
		int rows = A.length;
		int cols = A[0].length;
		
		// We first check if both matrices have the same shape
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
	
	  /**
     * Prints the contents of a matrix in a readable format.
     * Each row is printed on a new line, with values separated by commas.
     *
     * @param matrix the matrix to print
     */
	public static void printMatrix(int[][] matrix) {

		for (int[] row: matrix) {
			for (int value : row) {
				System.out.print(value + ", ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		
		// This is the main method, we initialize 2  sample matrices
		int[][] matrix1 = {
				{1, 2, 0},
				{4, 3, -1}
		};

		int[][] matrix2 = {
				{5, 2, 3},
				{1, 3, 4}
		};
		
		// Then perform addition and display the result
		int[][] newMatrixAdd = addMatrices(matrix1, matrix2);
		System.out.println("Result of matrix1 + matrix2:");
		printMatrix(newMatrixAdd);
		
		// Perform subtraction and display the result
		int[][] newMatrixSub = subMatrices(matrix1, matrix2);
		System.out.println("\nResult of matrix1 - matrix2:");
		printMatrix(newMatrixSub);
		
	}

}
