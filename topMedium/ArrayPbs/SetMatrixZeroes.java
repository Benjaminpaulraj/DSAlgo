package leetCode.topMedium.ArrayPbs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SetMatrixZeroes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int[][] input = new int[][] {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
		int[][] input = new int[][] {{1,0,1,1},{3,1,1,2},{1,3,1,5}};
		System.out.println(Arrays.deepToString(input));
		
		setZeroes(input);
		System.out.println("==="+Arrays.deepToString(input));
		
		//input = new int[][] {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
		input = new int[][] {{1,0,1,1},{3,1,1,2},{1,3,1,5}};		
		setZeroes1(input);
		System.out.println("==="+Arrays.deepToString(input));
		
	}
	
    public static void setZeroes1(int[][] matrix) {
        
    	Set<Integer> iIndex = new HashSet<>();
    	Set<Integer> jIndex = new HashSet<>();
    	
    	for(int i= 0; i < matrix.length; i++) {
    		for (int j=0; j< matrix[i].length; j++) {
    			if(matrix[i][j]==0) {
    				iIndex.add(i);
    				jIndex.add(j);
    			}
    		}
    	}
    	for(int i= 0; i < matrix.length; i++) {
    		for (int j=0; j< matrix[i].length; j++) {
    			if(iIndex.contains(i) || jIndex.contains(j)) {
    				matrix[i][j] =0;
    			}
    		}
    	}
    	
    }
    public static void setZeroes(int[][] matrix) {
    	
    	boolean isFirstColZero = false;
    	boolean isFirstRowZero = false;
    	
    	//find the row and column header.
    	for(int i =0; i < matrix.length; i++) {
    		if(matrix[i][0]==0) {
    			isFirstRowZero = true;
    		}
    	}
    	for(int j =0; j < matrix[0].length; j++) {
    		if(matrix[0][j]==0) {
    			isFirstColZero = true;
    		}
    	}
    	
    	//set row and colum header based on the inner array val
    	for(int i =1; i <matrix.length; i++) {
    		for(int j=1; j<matrix[0].length; j++) {
    			if(matrix[i][j] == 0) {
    				matrix[0][j] =0;
    				matrix[i][0] =0;
    			}
    		}
    	}
    	System.out.println(Arrays.deepToString(matrix));
    	
    	
/*    	
    	for(int i= 1; i < matrix.length; i++) {
    		if(matrix[i][0] != 0) continue;
    		for (int j=1; j< matrix[0].length; j++) {
    			matrix[i][j]=0;
    		}
    	}
    	System.out.println(Arrays.deepToString(matrix));
    	
    	for(int i= 1; i < matrix[0].length; i++) {
    		if(matrix[0][i] != 0) continue;
    		for (int j=1; j< matrix.length; j++) {
    			matrix[j][i]=0;
    		}
    	}
*/    	
    	
    	for(int i= 1; i < matrix.length; i++) {
    		for (int j=1; j< matrix[i].length; j++) {
    			if(matrix[i][0] == 0 || matrix[0][j]== 0) {
    				matrix[i][j] =0;
    			}
    		}
    	}    	
    	
    	
    	//Set the header
    	for(int i =0; isFirstRowZero == true && i < matrix.length; i++) {
    		matrix[i][0] = 0;
    	}
    	for(int j =0; isFirstColZero == true && j < matrix[0].length; j++) {
    		matrix[0][j] = 0;
    	}    	
    	
    	
    }
    public static void setZeroesNotWorking(int[][] matrix) {

    	for(int i= 0; i < matrix.length; i++) {
    		boolean updateRow = false;
    		int colIndex = -1;
    		for (int j=0; j< matrix[i].length; j++) {
    			if(!updateRow && matrix[i][j]==0) {
    				updateRow = true;
    				colIndex = j;
    				j=-1;
    			}else if(updateRow){
    				matrix[i][j]=0;
    			}
    		}
    	}
    	System.out.println(Arrays.deepToString(matrix));
    	for(int i= 0; i < matrix[0].length; i++) {
    		boolean updateCol = false; 
    		for (int j=0; j< matrix.length; j++) {
    			if(!updateCol && matrix[j][i]==0) {
    				updateCol = true;
    				j=-1;
    			}else if(updateCol){
    				matrix[j][i]=0;
    			}
    		}
    	}
    	
    }	

}
