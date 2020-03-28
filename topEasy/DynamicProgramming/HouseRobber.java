package leetCode.topEasy.DynamicProgramming;

public class HouseRobber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//System.out.println(rob(new int[] {2,7,9,3,1}));
		System.out.println(rob(new int[] {2,1,1,2,3}));
	}
	
    public static int rob(int[] nums) {
    	if(nums.length == 0) return 0;
		int prevMax = 0;
		int curMax = 0;
    	for(int i=0; i<nums.length; i++) {
    		int temp = curMax > prevMax ? curMax : prevMax;
    		curMax = prevMax + nums[i]; 
    		prevMax = temp;
    	}
        System.out.println(curMax+">"+prevMax);
    	return curMax > prevMax ? curMax : prevMax;   
    }	

}
