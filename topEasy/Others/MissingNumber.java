package leetCode.topEasy.Others;

import java.util.Arrays;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(missingNumber(new int[]{1,2,3,0}));
	}
    public static int missingNumber(int[] nums) {
        int sum = Arrays.stream(nums).sum();;
        int calSum = nums.length * (nums.length+1)/2;
        return calSum - sum;
        
    }
}
