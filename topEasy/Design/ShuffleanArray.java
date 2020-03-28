package leetCode.topEasy.Design;

import java.util.Arrays;
import java.util.Random;

public class ShuffleanArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[] {2,3,4,5,6,7,8};
		Solution s = new ShuffleanArray().new Solution(nums);
		int[] suf = s.shuffle();
		Arrays.stream(suf).forEach(i -> System.out.print(i+","));
		suf = s.reset();
		System.out.println();
		Arrays.stream(suf).forEach(i -> System.out.print(i+","));
		//System.out.println(Arrays.toString(nums));
		
		//s.shuffle();
		
	}

	private class Solution {
		int[] array;
		int[] oarray;
		Random random = new Random();
		
		private void swap(int[] arr, int index1, int index2) {
			int temp = arr[index1];
			arr[index1] = arr[index2];
			arr[index2] = temp;
		}
		
		private int nextRandamIndex(int min, int max) {
			return random.nextInt(max - min) +min;
		}
		
	    public Solution(int[] nums) {
	        array = nums;
	        oarray = array.clone();
	    }
	    
	    /** Resets the array to its original configuration and return it. */
	    public int[] reset() {
	    	array = oarray.clone();
	        return array;
	    }
	    
	    /** Returns a random shuffling of the array. */
	    public int[] shuffle() {
	    	for(int i=0; i< array.length; i++) {
	    		int ranIndex = nextRandamIndex(i, array.length);
	    		System.out.println(i + " "+ ranIndex);
	    		swap(array, i, ranIndex);
	    	}
	        return array;
	    }
	}	
}
