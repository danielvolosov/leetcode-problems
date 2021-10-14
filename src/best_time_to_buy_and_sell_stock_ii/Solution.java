package best_time_to_buy_and_sell_stock_ii;

public class Solution {
	
    public int maxProfit(int[] prices) {
    	
    	if (prices.length == 0 || prices == null) {
    		return 0;
    	}
    	
        int maxAmount = 0;
        
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1])
                maxAmount += prices[i] - prices[i - 1];
        }
        
        return maxAmount;
    }
}
