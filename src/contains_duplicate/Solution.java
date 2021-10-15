package contains_duplicate;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean containsDuplicate(int[] nums) {
        
    	Map<Integer, Integer> map = new HashMap<>();
    	
    	for (int i = 0; i < nums.length; i++) {
    		if (map.containsKey(nums[i]) && map.get(nums[i]) != i) {
    			return true;
    		}
    			map.put(nums[i], i);
    	}
    	
    	return false;
    }
}
