package leetCode.topEasy.TreesPbs;

public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        return isMirror(root, root);
    }
    
    public boolean isMirror(TreeNode left, TreeNode right){
        if(left == null && right == null) return true;
        return left !=null && right !=null && left.val == right.val
            && isMirror(left.left, right.right) && isMirror(left.right, right.left);
    }
}
