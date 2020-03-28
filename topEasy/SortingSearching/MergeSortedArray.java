package leetCode.topEasy.SortingSearching;

import java.util.Arrays;

public class MergeSortedArray {
    public int[] merge1(int[] nums1, int m, int[] nums2, int n) {
        int[] res = new int[m+n];
        for(int i=0, j=0, k=0; k!=m+n; k++) {
        	if(j!=n && nums1[i] > nums2[j]) res[k] = nums2[j++];
        	else res[k] = nums1[i++];
        }
        return res;
    }
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        for(int i=m-1, j=n-1, k=m+n-1; j != -1; k--) {
        	if(i>=0 && nums1[i] > nums2[j]) nums1[k] = nums1[i--];
        	else nums1[k] = nums2[j--];
        }
    }
    
    public static void main(String a[]) {
    	int[] nums1 = new int[] {5,0};
    	int[] nums2 = new int[] {2};
    	Arrays.stream(nums1).forEach(v -> System.out.print(v+" "));
    	new MergeSortedArray().merge(nums1, 1, nums2, 1);
    	System.out.println();
    	Arrays.stream(nums1).forEach(v -> System.out.print(v+" "));
    }
}
