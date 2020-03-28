package leetCode.topEasy.StringsPbs;

public class MoveZeroes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] d = {1,0,9,0,4};
		
		
		
		
		moveZeroes(d);
		
		
		for(int i =0; i <d.length;i++) {
			System.out.print(d[i]+",");
		}

	}

    public static void moveZeroes(int[] nums) {
     
    	int numIndex = 0;
    	
    	for(int i=0; i<nums.length;i++) {
    		if(nums[i]!=0) {
    			nums[numIndex++] = nums[i];
    		}
    	}
    	for(; numIndex<nums.length;) {
    		nums[numIndex++] = 0;
    	}
    }	
}
