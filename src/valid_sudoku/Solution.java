package valid_sudoku;

import java.util.HashSet;

public class Solution {
    public boolean isValidSudoku(char[][] board) {
        
    	HashSet<Object> covered = new HashSet<>();
    	
    	int size = 9;
    	
    	for (int row = 0; row < size; ++row) {
    		for (int col = 0; col < size; ++col) {
    			char character = board[row][col];
    			
    			if (character != '.') {
    				if (!covered.add(character + " in row " + row) ||
    						!covered.add(character + " in col " + col) ||
    						!covered.add(character + " in block " + row/3 + " - " + col/3)) {
    					return false;
    				}
    			}
    		}
    	}
    	
    	return true;
    }
}
