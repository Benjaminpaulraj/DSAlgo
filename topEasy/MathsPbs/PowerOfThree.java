package leetCode.topEasy.MathsPbs;

public class PowerOfThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//System.out.println(Math.pow(3, 19));
		for(int i =1; i< Integer.MAX_VALUE; i*=3) {
			
			if(isPowerOfThree2(i))
				System.out.println(i);
		}
	}
    public static boolean isPowerOfThree(int n) {     
    	while (n%3 == 0) {
    		n = n/3;
    	}
    	return n == 1;
    }
    
    public static boolean isPowerOfThree1(int n) {
    	return Integer.toString(n,3).matches("^10*$");
    }
    public static boolean isPowerOfThree2(int n) {
    	return n>0 && 1162261467 %n ==0;
    }
}
