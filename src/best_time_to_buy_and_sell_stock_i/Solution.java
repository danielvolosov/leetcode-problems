package best_time_to_buy_and_sell_stock_i;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int maxProfit(int[] prices) {
    	
    	if (prices.length == 0 || prices == null) {
    		return 0;
    	}
    	
    	int minAmount = Integer.MAX_VALUE;
    	int maxAmount = 0;
    	
    	for (int i = 0; i < prices.length; i++) {
    		
    		if (prices[i] < minAmount) {
    			minAmount = prices[i];
    		}
    		
    		if (prices[i] - minAmount > maxAmount) {
    			maxAmount = prices[i] - minAmount;
    		}
    	}
    	
    	return maxAmount;
    }
}
