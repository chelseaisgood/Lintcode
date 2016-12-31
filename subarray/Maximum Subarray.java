public class Solution {
    /**
     * @param prices: Given an integer array
     * @return: Maximum profit
     */
    public int maxProfit(int[] prices) {
        // write your code here
        if (prices == null || prices.length == 0) {
            return 0;
        }
        int best = 0;
        int minPrice= prices[0];
        
        for (int i = 1; i < prices.length; i++) {
            best = Math.max(best, prices[i] - minPrice);
            minPrice = Math.min(minPrice, prices[i]);
        }
        return best;
    }
}
