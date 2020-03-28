package leetCode.topEasy.TreesPbs;

public class ConvertSortedArraytoBinarySearchTree {

    public TreeNode sortedArrayToBST(int[] nums) {
    	
    	nums = new int[]{1,2,3,4,5,6,7,8,9,10};
    	TreeNode node =sortedArrayToBST(nums, 0, nums.length-1);
    	
    	TreeNode.printInOrder(node);
    	return node;
    };	
    
    public TreeNode sortedArrayToBST(int[] nums, int start, int end) {
    	if(start>end) return null;
    	int mid = (start + end)/2;
    	TreeNode node = new TreeNode(nums[mid]);
    	System.out.println(nums[mid]);
    	node.left = sortedArrayToBST(nums, start, mid-1);
    	node.right = sortedArrayToBST(nums, mid+1, end);
    	return node;
    }
}
