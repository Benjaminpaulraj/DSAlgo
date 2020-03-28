package leetCode.topEasy.MathsPbs;

import java.util.HashMap;

public class RomanToInteger {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//System.out.println(romanToInt("MCMXCIV"));
	}

	static HashMap<Character, Integer> map = new HashMap<Character, Integer>();	
	static {
    	map.put('I', 1);
    	map.put('V', 5);
    	map.put('X', 10);
    	map.put('L', 50);
    	map.put('C', 100);
    	map.put('D', 500);
    	map.put('M', 1000);		
	}
	
    public int romanToInt(String s) {
    	int res = 0;
    	for (int i =1; i< s.length(); i++) {
    		int l1 = (int)RomanToInteger.map.get(s.charAt(i-1));
    		int l2 = (int)RomanToInteger.map.get(s.charAt(i));
    		if(l1 >= l2) {
    			res += l1;
    		}else {
    			res -= l1;
    		}
    	}
    	res += (int)map.get(s.charAt(s.length()-1));
    	return res;
    }
}
