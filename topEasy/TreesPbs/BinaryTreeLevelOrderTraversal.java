package leetCode.topEasy.TreesPbs;
import java.util.*;
public class BinaryTreeLevelOrderTraversal {

    public List<List<Integer>> levelOrder1(TreeNode root) {
    
    	System.out.println("levale aorger");
    	List<List<Integer>> lev = new LinkedList<List<Integer>>();
    	List<TreeNode> q = new LinkedList<TreeNode>();
    	if(root == null) return lev;
    	q.add(root);
    	
    	while(!q.isEmpty()){
    		
    		List<Integer> nodeVals = new LinkedList<Integer>();
    		for(TreeNode temp : q) {
    			nodeVals.add(temp.val);
    		}
    		lev.add(nodeVals);
    		
    		LinkedList<TreeNode> q2 = new LinkedList<TreeNode>();
    		
    		for(TreeNode temp : q) {
    			if(temp.left != null) q2.add(temp.left);
    			if(temp.right != null) q2.add(temp.right);
    		}
    		q = q2;
    	}
    	lev.forEach(temp -> {
    		temp.forEach( val -> System.out.print(val+" "));
    		System.out.println();
    			});
    	
    	return lev;
    }
    
    public List<List<Integer>> levelOrder3(TreeNode root) {
    
    	List<List<Integer>> res = new LinkedList<List<Integer>>();
    	
    	if(root == null) return res;
    	
    	Queue<TreeNode> q = new LinkedList<TreeNode>();
    	q.add(root);
    	
    	while(!q.isEmpty()) {
    		List<Integer> levValues = new LinkedList<Integer>();
    		int qSize = q.size();
    		
    		while(qSize-- != 0) {
    			if(q.peek().left != null) q.add(q.peek().left);
    			if(q.peek().right != null) q.add(q.peek().right);
    			levValues.add(q.poll().val);
    		}
    		res.add(levValues);
    	}
    	
    	
    	res.forEach(temp -> {
    		temp.forEach( val -> System.out.print(val+" "));
    		System.out.println();
    			});    	
    	
    	
    	
    	return res;
    }
    
    public List<List<Integer>> levelOrder(TreeNode root) {
    	List<List<Integer>> res = new ArrayList<List<Integer>>();
    	levelOrderDFS(res, root, 0);
    	/*res.forEach(temp -> {
    		temp.forEach( val -> System.out.print(val+" "));
    		System.out.println();
    			});
    			*/ 
    	return res;
    }
    private List<List<Integer>> levelOrderDFS(List<List<Integer>> res, TreeNode root, int height) {
    	if(root == null ) return res;
    	if(res.size() <= height) {
    		res.add(new ArrayList<Integer>());
    	}
    	res.get(height).add(root.val);
    	levelOrderDFS(res, root.left, height+1);
    	levelOrderDFS(res, root.right, height+1);
    	return res;
    }
	
}
