package implement_strStr;

public class Solution {
    public int strStr(String haystack, String needle) {
        
    	if (needle.isEmpty() || needle == null) {
    		return 0;
    	}
    	
    	for (int i = 0; i < haystack.length(); i++) {
    		return haystack.indexOf(needle.substring(0, needle.length()));
    	}
    	
    	return -1;
    }
}
