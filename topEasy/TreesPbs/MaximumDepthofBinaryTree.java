package leetCode.topEasy.TreesPbs;

public class MaximumDepthofBinaryTree {
    
	public int maxDepth(TreeNode root) {
    
    	if(root == null) {
    		return 0;
    	}else {
    		int lv = maxDepth(root.left);
    		int rv = maxDepth(root.right);
    		if(lv>rv) {
    			return lv+1;
    		}else {
    			return rv+1;
    		}
    	}
    }
}
