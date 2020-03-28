package leetCode.topEasy.Others;

public class Numberof1Bits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int val = -1;
		//System.out.println(Integer.toBinaryString(val));
		//System.out.println(getBits(val));
		
		System.out.println(Integer.bitCount(val));
		System.out.println(hammingWeight(val));
	}
	
	
	public static String getBits(int n) {
		StringBuilder b = new StringBuilder();
		String signbit = "0";
		if(n<0) {
			n = Integer.MAX_VALUE + n+1;
			signbit = "1";
		}
		while(n!=0) {
			b.append(n%2);
			n /=2; 
		}
		return signbit+b.reverse().toString();
	}
	
    public static int hammingWeight1(int n) {
    	String bits = getBits(n);
    	int count=0;
    	for (int i = bits.length()-1; i >=0; i--) {
    		if(bits.charAt(i) == '1')count++;
    	}
    	return count;
    }
    
    public static int hammingWeight2(int n) {
    	int count =0;
    	int mask =1;
    	
    	for (int i =0; i <32; i++) {
    		if( (n & mask) != 0) count++;
    		mask = mask << 1;
    	}
    	
    	return count;
    }

    public static int hammingWeight(int n) {
    	
    	int count =0;
    	
    	while(n !=0) {
    		count ++;
    		n = n & (n-1);
    	}
    	
    	return count;
    }
}
