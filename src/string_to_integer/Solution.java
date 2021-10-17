package string_to_integer;

public class Solution {

	public int myAtoi(String s) {
        
        s = s.trim();

        
        if (s == null || s.isEmpty()) {
            return 0;
        }
                
        char flag = '+';
        
        int start = 0;
        
        if (s.charAt(0) == '-') {
            flag = '-';
            start++;
        }
        
        if (s.charAt(0) == '+') {
            start++;
        }
        
        double result = 0;
        
        while (start < s.length() && s.charAt(start) >= '0' && s.charAt(start) <= '9') {
            result = result * 10 + (s.charAt(start) - '0');
            start++;
        }
        
        if (flag == '-') {
            result = result * -1;
        }
        
        if (result > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }
        
        if (result < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        
        return (int)result;
    }
}
