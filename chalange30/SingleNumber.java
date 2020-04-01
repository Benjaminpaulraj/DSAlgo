package leetCode.chalange30;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.UnaryOperator;

/*
 * 
 * 
Given a non-empty array of integers, every element appears twice except for one. Find that single one.

Note:

Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

Example 1:

Input: [2,2,1]
Output: 1
Example 2:

Input: [4,1,2,1,2]
Output: 4
*/
public class SingleNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(singleNumber(new int[] {}));
	}

	public static int singleNumber(int[] nums) {
		if(nums.length == 0) return -1;
		int output = nums[0];
		for(int i = 1; i< nums.length; i++) {
			output ^= nums[i]; 
		}
		AtomicInteger out = new AtomicInteger(0);
		Arrays.stream(nums).forEach(val -> out.set(out.get()^val));		
		return out.get();
	}
}
