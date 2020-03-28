package leetCode.topEasy.DynamicProgramming;

public class MaximumSubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub[]
		System.out.println(new MaximumSubarray().maxSubArray(new int[] {-1,-3,1,2,3,-1,4}));
	}
    public int maxSubArray(int[] nums) {
    	int max = nums[0], res = nums[0];
    	for(int i=1; i<nums.length;i++) {
    		if(max+nums[i] >nums[i]) {
    			max = max + nums[i];
    		}else {
    			max = nums[i];
    		}
    		if(res < max) {
    			res = max;
    		}
    	}
        return res;
    }
}
