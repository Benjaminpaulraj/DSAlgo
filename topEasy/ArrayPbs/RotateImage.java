package leetCode.topEasy.ArrayPbs;

public class RotateImage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] m = {{1,2,3},{4,5,6},{7,8,9}};

		for(int i=0; i< m.length; i++) {
			for(int j=0; j< m.length;j++) {
				System.out.print(m[i][j]);
			}
			System.out.println();
		}
		
		rotate(m);
		
		for(int i=0; i< m.length; i++) {
			for(int j=0; j< m.length;j++) {
				System.out.print(m[i][j]);
			}
			System.out.println();
		}
		
		
	}
	public static void rotate(int[][] matrix) {
		int len = matrix.length-1;
		for(int i=0; i< len; i++) {
			for(int j=i; j< len-i;j++) {
				int top = matrix[i][j];
				int rig = matrix[j][len-i];
				int bot = matrix[len-i][len-j];
				int lef = matrix[len-j][i];

				System.out.println(top+","+rig+","+bot+","+lef);
				
				matrix[i][j] = lef;
				matrix[j][len-i] = top;
				matrix[len-i][len-j] = rig;
				matrix[len-j][i] = bot;
				
				
				top = matrix[i][j];
				bot = matrix[len-i][len-j];
				lef = matrix[len-j][i];
				rig = matrix[j][len-i];
				System.out.println("=="+top+","+rig+","+bot+","+lef);				
			}
		}
	}
}
