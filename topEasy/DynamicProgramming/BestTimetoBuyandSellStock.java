package leetCode.topEasy.DynamicProgramming;

public class BestTimetoBuyandSellStock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(maxProfit(new int[] {2,1,2,1,0,1,2}));
		
	}
    public static int maxProfit(int[] prices) {
        
    	int profit = 0;
    	Integer min = null, max = null;
    	for(int i=0; i < prices.length;i++) {
    		//System.out.println(prices[i]);
    		if(min ==null || prices[i] < min) {
    			min = prices[i];
    			max = null;
    			continue;
    		}
    		if(max == null || prices[i] > max) {
    			max = prices[i];
    			if(max-min > profit) {
    				profit = max-min;
    			}
    		}
    	}
    	return profit;
    }
}
