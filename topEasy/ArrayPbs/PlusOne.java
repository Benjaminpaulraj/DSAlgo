package leetCode.topEasy.ArrayPbs;

import java.util.ArrayList;
import java.util.List;

public class PlusOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] d = {9,4};
		
		
		
		
		d = plusOne(d);
		
		
		for(int i =0; i <d.length;i++) {
			System.out.print(d[i]+",");
		}
		

	}
    public static int[] plusOne1(int[] digits) {
         
        List<Integer> res = new ArrayList<>();
    	int carry =1;
        for(int i=digits.length-1;i>=0;i--) {
        	if(i==0 && digits[i]==9 && carry==1) {
        		res.add(0);
        		res.add(1);
        	}else if(digits[i]==9 && carry==1) {
        		carry=1;
        		res.add(0);
        	}else if(carry==1) {
        		res.add(digits[i]+1);
        		carry =0;
        	}else {
        		res.add(digits[i]);
        	}
        }
        int[] r = new int[res.size()];
        
        for(int i=res.size()-1, j=0;i>=0;i--) {
        	r[j++] = res.get(i);
        }
    	return r;
    }
    
    public static int[] plusOne(int[] digits) {
        
        
        for (int i = digits.length-1; i >= 0; i--) {
            if (digits[i] == 9) {
                digits[i] = 0;
            } else {
                digits[i]++;
                return digits;
            }
        }
        int[] out = new int[digits.length+1];
        out[0] = 1;
        for (int i = digits.length-1, j=1; i >= 0; i--) {
        	out[j++] = digits[i];
        }
        
        return out;
    }	
    
}
