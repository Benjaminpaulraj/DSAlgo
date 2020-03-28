package leetCode.topEasy.ArrayPbs;

public class BestTimetoBuyandSellStock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] prices = {1,2,8,9,22};// {10,20,20,40,50}
		System.out.println(maxProfit(prices));
		
	}
	
    public static int maxProfit(int[] prices) {
    	int profit=0;
    	for(int i =0; i< prices.length-1; i++) {
    		if(prices[i+1] > prices[i]) {
    			profit += (prices[i+1] - prices[i]);
    		}
    		
    	}
    	
    	return profit;
    }	

}
