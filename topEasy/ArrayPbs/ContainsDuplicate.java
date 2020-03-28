package leetCode.topEasy.ArrayPbs;

import java.util.HashSet;

public class ContainsDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = {1,1,2};
	 	System.out.println(containsDuplicate(nums));
	}
	
    public static boolean containsDuplicate(int[] nums) {
    	HashSet<Integer> hset = new HashSet<>();
    	for(int i=0; i<nums.length;i++) {
    		if(!hset.add(nums[i]))return true;
    	}
    	return false;
    }

}
