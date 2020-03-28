package leetCode.topEasy.DynamicProgramming;

public class ClimbingStairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(climbStairs(6));
	}
    public static int climbStairs(int n) {
        int s1 =1, s2=2, s3=0;
    	if(n==0) return 0;
    	if(n==1) return s1;
    	if(n==2) return s2;
    	
    	while(n-- -2 != 0) {
    		if((long)s1+s2 > Integer.MAX_VALUE ) return -1;
    		s3= s1+s2;
    		s1= s2;
    		s2 = s3;
    		
    	}
    	return s3;
    }
}
