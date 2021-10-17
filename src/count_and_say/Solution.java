package count_and_say;

public class Solution {
    public String countAndSay(int n) {
        
        String sequence = "1";
        
        for (int i = 1; i < n; i++) {
        	char ch = sequence.charAt(0);
        	
        	StringBuilder sb = new StringBuilder();
        	
        	int count = 1;
        	
        	for (int j = 1; j < sequence.length(); j++) {
        		if (ch == sequence.charAt(j)) {
        			count++;
        		} else {
        			sb.append(count).append(ch);
        			ch = sequence.charAt(j);
        			count = 1;
        		}
        	}
        	
        	sb.append(count).append(ch);
        	sequence = sb.toString();
        }
        
        return sequence;
    }
}
