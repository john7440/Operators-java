package fr.ex.operation;

// Question 6.6
public class MultiplyMatrixByScalar {
	
	public static int[][] multiplyByScalar(int[][] matrix, int scalar){
		
		//This method can multiply a matrix by a scalar
		int rows = matrix.length;
		int cols = matrix[0].length;
		
		int[][] result = new int[rows][cols];
		
		for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix[i][j] * scalar;
            }
        }
		
		return result;
	}

	public static void main(String[] args) {
		// This is our main method, it initialize a matrix and a scalar,
		// then we call the multiplyByScalar method and print the result
		// with the printMatrix method from our class SumAndSubMAtrix:
		
		int[][] matrix3 = {
				{0, 2},
				{1, 2},
				{1, 1}	
				
		};

		int scalar = 2;
		int[][] matrix3Scalar = multiplyByScalar(matrix3, scalar);
		SumAndSubMatrix.printMatrix(matrix3Scalar);

	}
}
