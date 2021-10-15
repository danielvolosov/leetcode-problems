package rotate_image;

import java.util.HashSet;

public class Solution {
    public void rotate(int[][] matrix) {
        
    	int N = matrix.length;
    	
    	for (int row = 0; row < N; row++) {
    		for (int col = row; col < N; col++) {
    			int temp;
    			temp = matrix[row][col];
    			matrix[row][col] = matrix[col][row];
    			matrix[col][row] = temp;
    		}
    	}
    	
    	for (int row = 0; row < N; row++) {
    		for (int col = 0; col < (N/2); col++) {
    			int temp;
    			temp = matrix[row][col];
    			matrix[row][col] = matrix[row][N - 1 - col];
    			matrix[row][N - 1 - col] = temp;
    		}
    	}
    }
}
