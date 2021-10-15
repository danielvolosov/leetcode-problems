package transpose_matrix;

public class Solution {
    public int[][] transpose(int[][] matrix) {
        
        int row = matrix.length;
        int col = matrix[0].length;
        
        int[][] copyMatrix = new int[col][row];
        
        for (int r = 0; r < row; r++) {
            for (int c = 0; c < col; c++) {
                copyMatrix[c][r] = matrix[r][c];
            }
        }
        
        return copyMatrix;
    }
}
