package leetCode.topEasy.TreesPbs;

import java.util.Stack;

public class TreeNode {

	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
	}

	public static TreeNode createTree1() {
		/**
		 *                10 
		 *              /   \ 
		 *            2       18 
		 *          /  \     /  \ 
		 *         1    3 15     21
		 *               \ 
		 *                4
		 * 
		 */

		TreeNode t = new TreeNode(10);
		t.left = new TreeNode(2);
		t.right = new TreeNode(18);

		t.left.left = new TreeNode(1);
		t.left.right = new TreeNode(3);

		t.right.left = new TreeNode(15);
		t.right.right = new TreeNode(21);

		t.left.right.right = new TreeNode(4);
		return t;
	}

	public static void printPreOrder(TreeNode node) {
		if(node==null) return;
		System.out.print(node.val+",");
		printPreOrder(node.left);
		printPreOrder(node.right);
	}
	public static void printPreOrder1(TreeNode node) {
		Stack<TreeNode> s = new Stack<>();
		while(node != null || !s.isEmpty()) {
			while(node !=null) {
				System.out.println(node.val);
				s.push(node);
				node = node.left;
			}
			node = s.pop();
			node = node.right;
		}
	}
	public static void printInOrder(TreeNode node) {
		
		if(node == null) return;
		printInOrder(node.left);
		
		
		System.out.println(node.val);
		
		printInOrder(node.right);
	}
	public static void printInOrder1(TreeNode root) {
		Stack<TreeNode> stack = new Stack<>();
		TreeNode node = root;
		while(node != null || !stack.isEmpty()) {
			while(node != null) {
				stack.push(node);
				node = node.left;
			}
			node = stack.pop();
			System.out.println(node.val);
			node = node.right;
		}
	}
	public static void printPostOrder(TreeNode root) {
		//if(root == null) return;
		if(root != null)printPostOrder(root.left);
		if(root != null)printPostOrder(root.right);
		if(root != null)System.out.println(root.val);
		
	}
	public static void printPostOrder1(TreeNode root) {
		Stack<TreeNode> s = new Stack<TreeNode>();
		s.push(root);
		while(!s.isEmpty()) {
			//if(node !=null) System.out.println("val===>"+node.val);
			//else System.out.println("else==>"+node.val);
			
			if(s.peek().left != null) {
				s.push(s.peek().left);
			}else if(s.peek().right != null) {
				System.out.println("r=="+s.peek().val);
				s.push(s.peek().right);
			}else if(s.peek().left != null && s.peek().left != null) {
				//TreeNode node = s.pop();
				System.out.println("pop=="+s.pop().val);
			}
		//System.out.println("peek"+s.peek().val);
		}
			
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeNode root = TreeNode.createTree1();
		//TreeNode.printPostOrder1(TreeNode.createTree1());
		//System.out.println(new ValidateBinarySearchTree().isValidBST(root));
		
		
		//new BinaryTreeLevelOrderTraversal().levelOrder(root);
		
		new ConvertSortedArraytoBinarySearchTree().sortedArrayToBST(new int[] {});
		
	}

}
