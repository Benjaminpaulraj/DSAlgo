package leetCode.topEasy.ArrayPbs;

public class RotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,3,4};
		for(int i =0; i <nums.length;i++) {
			System.out.print(nums[i]+",");
		}
		System.out.println("\n====");
		
		new Solution1().rotate(nums, 2);
		for(int i =0; i <nums.length;i++) {
			System.out.print(nums[i]+",");
		}		

	}
	
}

	class Solution1 {
	    public void rotate(int[] nums, int k) {
	    	int len = nums.length-1;
	    	for(int j=0; j<k;j++) {
		        for(int i=0; i<len;i++) {
		        	swap(nums, i, len);
		        }
	    	}
	    }
	    
	    public void rotateOnce(int[] nums) {
	    	int len = nums.length-1;
	        for(int i=0; i<len;i++) {
	        	swap(nums, i, len);
	        }
	    }
	    private void swap(int[] nums, int p1, int p2) {
	    	int temp = nums[p1];
	    	nums[p1] = nums[p2];
	    	nums[p2] = temp;
	    }
	}




