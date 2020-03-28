package leetCode.topEasy.ArrayPbs;

import java.util.Arrays;

public class SingleNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] n = {1,2,1,2};
		System.out.println(singleNumber(n));
	}

    public static int singleNumber1(int[] nums) {
    	Arrays.parallelSort(nums);
    	for(int i =0; i<nums.length; i++) {
    		if(i == nums.length-1) return nums[nums.length-1];
    		else if(nums[i] == nums[i+1]) i++;
    		else return nums[i];
    	}
    	return nums[nums.length-1];
    }
    public static int singleNumber(int[] nums) {
    	int xorValue = nums[0];
    	for(int i =1; i<nums.length; i++) {
    		xorValue = xorValue ^ nums[i];
    	}
    	return xorValue;
    }    
}
