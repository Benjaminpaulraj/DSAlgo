package leetCode.topEasy.ArrayPbs;

public class RemoveDuplicatesfromSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int[] nums = {0,0,1,1,1,2,2,3,3,4};
		int[] nums = {1,1,2};
		for(int i =0; i <nums.length;i++) {
			System.out.print(nums[i]+",");
		}
		System.out.println("\n====");
		System.out.println(new Solution().removeDuplicates(nums));
		for(int i =0; i <nums.length;i++) {
			System.out.print(nums[i]+",");
		}		
	}

}

class Solution {
    public int removeDuplicates(int[] nums) {
    	int noDup =0;
    	for(int i =1; i <nums.length;i++) {
    		if(nums[noDup] != nums[i]) {
    			nums[++noDup] = nums[i];
    		}
    	}
    	
    	return ++noDup;
    }
}
