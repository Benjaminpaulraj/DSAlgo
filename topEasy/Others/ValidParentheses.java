package leetCode.topEasy.Others;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isValid("{[(]}"));
	}
	static Map< Character, Character> map = new HashMap<>();
	static {
    	map.put('{', '}');
    	map.put('(', ')');
    	map.put('[', ']');		
	}
	
	
    public static boolean isValid(String s) {
    	
        Stack<Character> stack = new Stack<>();
    	    	
    	
    	for (int i =0; i < s.length(); i++) {
    		char c = s.charAt(i);
    		if(map.containsKey(c)) {
    			stack.push(c);
    		}else if(stack.isEmpty() || map.get(stack.pop()).compareTo(c) != 0) {
    			return false;
    		}
    	}
    	return stack.isEmpty();
    }	
}
