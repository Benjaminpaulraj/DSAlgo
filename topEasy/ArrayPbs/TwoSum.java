package leetCode.topEasy.ArrayPbs;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] inp = {3,2,4};
		int[] res = twoSum(inp, 6);
		
	}
    public static int[] twoSum(int[] nums, int target) {

    	int[] res = new int[2];

    	HashMap<Integer, Integer> map = new HashMap<>();
        
    	for(int i=0 ;i< nums.length;i++) {
    		map.put(nums[i], i);
    	}
    	
    	
    	for(int i=0; i<nums.length;i++) {
    		Integer val =map.get(target-nums[i]);
    		if(val != null && val !=i) {
    			res[0] =i;
    			res[1] = map.get(target-nums[i]);
    			System.out.println(i+"="+res[1]);
    			break;
    		}
    	}
        return res;
    }
    
    public static int[] twoSum1(int[] nums, int target) {
        int[] res = new int[2];
    	Arrays.parallelSort(res);
        
    	for(int i=0, j=nums.length-1; i<nums.length;) {
    		System.out.println(nums[i]+","+nums[j]+","+target);
    		if(nums[i]+nums[j]==target) {
    			res[0] = i;
    			res[1] = j;
    			System.out.println(i+"="+j);
    			break;
    		}
    		if(nums[i]+nums[j]>target)j--;
    		else i++;
    	}
        return res;
    }

}
