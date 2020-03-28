package leetCode.topEasy.SortingSearching;

public class FirstBadVersion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//System.out.println(Integer.MAX_VALUE - 1702766719);
		
		System.out.println("result"+new FirstBadVersion().firstBadVersion(100));
	}

    public int firstBadVersion(int n) {
    	int start =0, end = n, mid = start;
    	while(start != end) {
    		mid = start + (end-start)/2;
    		if(isBadVersion(mid)) {
    			end = mid;
    		}else {
    			start = mid+1;
    		}
    	}
    	
    	return start;
    }
    
    
    
    boolean isBadVersion(int version) {
    	System.out.println(version);
    	return version >=20;
    }
}
