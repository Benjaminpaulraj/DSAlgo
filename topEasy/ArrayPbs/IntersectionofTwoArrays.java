package leetCode.topEasy.ArrayPbs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionofTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1 = {1,4,3,21};
		int[] nums2 = {1,2,3};
		
		nums1 = intersect(nums1, nums2);
		for(int i=0; i< nums1.length;i++) {
			System.out.print(nums1[i]+",");
		}
		
	}

    public static int[] intersect(int[] nums1, int[] nums2) {
        Arrays.parallelSort(nums1);
        Arrays.parallelSort(nums2);
        List<Integer> res = new ArrayList<Integer>(); 
        for(int i=0, j=0; i< nums1.length && j <nums2.length;) {
        	if(nums1[i] == nums2[j]) {
        		res.add(nums1[i++]);
        		j++;
        	}
        	else if (nums1[i] > nums2[j]) j++;
        	else i++;
        }
        res.forEach(System.out::println);
        int[] result = new int[res.size()];
        int c =0;
        for (Integer i : res) {
			result[c++] = i;
		}
        return result;
    }
}
