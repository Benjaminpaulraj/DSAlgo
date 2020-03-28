package leetCode.topEasy.StringsPbs;

public class StringtoIntegerAtoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//System.out.println(Integer.MAX_VALUE);
		System.out.println(myAtoi(" - "));
	}
	public static int myAtoi(String str) {
		int sign = 1, num =0, i=0;
		try {
		while(str.charAt(i) == ' ') i++;
		
		if(str.charAt(i) == '+' || str.charAt(i) == '-') {
			if(str.charAt(i++) == '-') sign = -1;
		}
		while(i < str.length() && str.charAt(i) >= '0' && str.charAt(i) <= '9') {
			int val = Integer.parseInt(Character.toString(str.charAt(i++)));
			int newNum = num*10 + val;
			if(newNum/10 != num || newNum%10 != val) {
				if(sign ==1 ) return Integer.MAX_VALUE;
				else return Integer.MIN_VALUE;
			}else num = newNum;
		}
		}catch(Exception e) {
			return 0;
		}
		return num*sign;
	}
    public static int myAtoi1(String str) {
        
    	Character sym = null;
    	Integer out = null;
    	
    	for(int i =0 ; i< str.length(); i++) {
    		char c = str.charAt(i);
    		//System.out.println(i+"=="+c+"---->"+(c>= '0' && c<='9'));
    		if(out == null) {
    			if(sym == null && c == ' ')continue;
    			if(!Character.isDigit(c) && c != '+' && c != '-') break;
    		}
    		if(sym == null) {
    			if(Character.isDigit(c)) {
    				out = Integer.parseInt(Character.toString(c));
    				sym = '+';
    				continue;
    			}
    			if(c == '+' || c == '-') 
    				sym = c;
    			continue;
    		}
    		
    		if(c>= '0' && c<='9') {
    			if(out ==  null)out = Integer.parseInt(Character.toString(c));
    			else {
    				int newValue = out *10 + Integer.parseInt(Character.toString(c));
    				if(newValue/10 == out && newValue%10 ==Integer.parseInt(Character.toString(c))) {
    					out = newValue;
    				}else {
    					if(sym == '+') return Integer.MAX_VALUE;
    					else return Integer.MIN_VALUE;
    				}
    			}
    		}else {
    			System.out.println("brak");
    			break;
    		}
    		System.out.println("===="+out);
    	}
    	if(sym != null && sym == '-' && out!=null) out*=-1;
    	if(out == null) return 0;
    	return out;
    }
    
    private static boolean isAlphapet(Character c) {
    	c = Character.toLowerCase(c);
    	return Character.toLowerCase(c) >= 'a' && Character.toLowerCase(c)<= 'z'; 
    	
    }
    
    
    
    
}
