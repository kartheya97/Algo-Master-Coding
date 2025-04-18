package org.algomaster.arrays;

public class BestTimeToBuyAndSellStock {

    public int maxProfit(int[] prices) {

        // Time Complexitu : O(N), Space Complexity : O(1)
        int minPrice  = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int curPrice: prices){
            if(curPrice < minPrice){
                minPrice = curPrice;
            }else
                maxProfit = Math.max(maxProfit, curPrice - minPrice);
        }
        return maxProfit;

    }

}
