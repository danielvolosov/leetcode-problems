package valid_palindrome;

public class Solution {
    public boolean isPalindrome(String s) {
    	
    	StringBuilder sb = new StringBuilder();
    	
    	s = s.toLowerCase();
    	
    	for (char ch : s.toCharArray()) {
    		if (Character.isLetterOrDigit(ch)) {
    			sb.append(ch);
    		}
    	}
    	
    	int start = 0;
    	int end = sb.length() - 1;
    	
    	while (start < end) {
    		if (sb.charAt(start) != sb.charAt(end)) {
    			return false;
    		}
    		
    		start++;
    		end--;
    	}
    	
    	return true;
    }
}
