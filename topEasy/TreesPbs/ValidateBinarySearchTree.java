package leetCode.topEasy.TreesPbs;

import java.util.Stack;

public class ValidateBinarySearchTree {
    public boolean isValidBST(TreeNode root) {
        
    	Stack<TreeNode> s = new Stack<>();
    	Integer preVal = null;
    	while (root != null || !s.isEmpty()) {
    		while(root != null) {
    			s.push(root);
    			root = root.left;
    		}    		
    		root = s.pop();
    		if(preVal == null) preVal = root.val; 
    		else if(preVal >= root.val) return false; 
    		preVal = root.val;
    		root = root.right;
    		
    	}
    	
    	
    	return true;
    }
}
