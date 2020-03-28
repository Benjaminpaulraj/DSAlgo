package leetCode.topEasy.Design;

import java.util.Stack;

public class MinStack {
	
	private class Node{
		int value;
		int minValue;
		public Node(int val, Integer prevMinVal){
			value = val;
			minValue = (prevMinVal == null || prevMinVal > val) ?  val : prevMinVal;
		}
	}
	Stack<Node> s;
    public MinStack() {
       s = new Stack<>();
    }
    
    public void push(int x) {
    	Integer minVal = null; 
    	if(!s.isEmpty()) minVal = s.peek().minValue;
        Node node = new Node(x, minVal);
        s.push(node);
    }
    
    public void pop() {
        s.pop();
    }
    
    public int top() {
        return s.peek().value;
    }
    
    public int getMin() {
    	return s.peek().minValue;
    }	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MinStack m = new MinStack();
		//System.out.println(m.top()+"==="+m.getMin());
		m.push(5);
		System.out.println(m.top()+"==="+m.getMin());
		m.push(2);
		System.out.println(m.top()+"==="+m.getMin());
		m.push(7);
		System.out.println(m.top()+"==="+m.getMin());
		m.pop();
		System.out.println(m.top()+"==="+m.getMin());
		m.pop();
		System.out.println(m.top()+"==="+m.getMin());
	}

	
}
