package fr.ex.operation;

// Question 6.6
public class MultiplyMatrixByScalar {
	
	/**
     * Multiplies each element of a matrix by a scalar value.
     *
     * @param matrix the input matrix
     * @param scalar the scalar value to multiply each element by
     * @return a new matrix containing the scaled values
     */
	public static int[][] multiplyByScalar(int[][] matrix, int scalar){
		
		int rows = matrix.length;
		int cols = matrix[0].length;
		
		int[][] result = new int[rows][cols];
		
		
		// We multiply each element by the scalar
		for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix[i][j] * scalar;
            }
        }
		
		return result;
	}

	public static void main(String[] args) {
		/**
         * Main method:
         * - Initializes a sample matrix and a scalar value
         * - Calls multiplyByScalar to perform the operation
         * - Prints the resulting matrix using the printMatrix method from SumAndSubMatrix
         */
        
		int[][] matrix3 = {
				{0, 2},
				{1, 2},
				{1, 1}	
				
		};

		// Multiply the matrix by the scalar
		int scalar = 2;
		int[][] matrix3Scalar = multiplyByScalar(matrix3, scalar);
		
		// Print the result using the method from the SumAndSubMatrix class
		SumAndSubMatrix.printMatrix(matrix3Scalar);

	}
}
