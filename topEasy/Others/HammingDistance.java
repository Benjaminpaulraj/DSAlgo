package leetCode.topEasy.Others;

public class HammingDistance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(hammingDistance(0, -1));
	}
    public static int hammingDistance(int x, int y) {
    	int mask = 1;
    	int res =0;
    	for (int i=0; i< 32; i++) {
    		if ( (x & mask) != (y & mask)) res++;
    		mask = mask << 1;
    	}
    	return res;
    }
}	
