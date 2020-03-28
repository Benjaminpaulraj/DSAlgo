package leetCode.topEasy.MathsPbs;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		fizzBuzz(15).stream().forEach(System.out :: println);
	}
    public static List<String> fizzBuzz(int n) {
    	List<String> res = new ArrayList<>();    	
    	for (int i=1; i<= n;i++) {
    		if(i%3 ==0 && i%5 ==0) {
    			res.add("FizzBuzz");
    		}else if (i%3 ==0) {
    			res.add("Fizz");
    		}else if (i%5 ==0) {
    			res.add("Buzz");
    		}else {
    			res.add(i+"");
    		}
    	}
    	return res;
    }
}
