class Solution {
    public int maxProfit(int[] prices) {
        int maxResult = 0;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            min = Math.min(min, prices[i]);
            maxResult = Math.max(maxResult, prices[i] - min);
        }
        return maxResult;
    }
}