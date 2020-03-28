package leetCode.topEasy.ArrayPbs;

import java.util.*;

public class ValidSudoku {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[][] b = new char[9][9];
		for(int i=0; i<9;i++) {
			for(int j=0;j<9;j++) {
				b[i][j] = '.';
			}
		}
		b[0][1] = '5';
		b[7][3] = '2';
		
		System.out.println(isValidSudoku(b));
		
	}

	
    public static boolean isValidSudoku(char[][] board) {
        List<Set<Character>> row = new ArrayList<>();
        List<Set<Character>> col = new ArrayList<>();
        List<Set<Character>> box = new ArrayList<>();
    	for(int i=0;i<9;i++) {
    		row.add(new HashSet<>());
    		col.add(new HashSet<>());
    		box.add(new HashSet<>());
    	}
    	 
    	for(int i=0; i< 9; i++) {
    		for(int j=0; j<9; j++) {
    			if(board[i][j] =='.')continue;
    			Set<Character> rowSet = row.get(i);
    			Set<Character> colSet = col.get(j);
    			System.out.println(box.size()+"=="+i/3+(j/3)*3);
    			Set<Character> boxSet = box.get(i/3+(j/3)*3);
    			System.out.print(i+","+j+"==="+board[i][j]);
    			if(!rowSet.add(board[i][j]))return false;
    			if(!colSet.add(board[i][j]))return false;
    			if(!boxSet.add(board[i][j]))return false;
    			
    		}
    	}
    	return true;
    }
}
