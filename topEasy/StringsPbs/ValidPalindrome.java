package leetCode.topEasy.StringsPbs;

import java.util.Stack;

public class ValidPalindrome {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s =" "; int i =0;
		System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
		System.out.println(isAlphaNumeric(':'));
		System.out.println((int)':');
		
	}

	public static boolean isPalindrome(String s) {
		s= s.toLowerCase();
		for (int i = 0, j = s.length()-1; i <= j;) {
			System.out.println(i+"=="+j);
			System.out.println(s.charAt(i)+"===="+s.charAt(j));
				
			if (!isAlphaNumeric(s.charAt(i))) {
				i++;
				continue;
			} 
			if (!isAlphaNumeric(s.charAt(j))) {
				j--;
				continue;
			}
			if (i == j)
				return true;
			if (s.charAt(i) != s.charAt(j)) {
				System.out.println(s.charAt(i)+"==!!!!=="+s.charAt(j));
				return false;
			}else {
				System.out.println("ee");
				i++;
				j--;
			}
		}
		return true;
	}
	
	private static boolean isAlphaNumeric(Character c) {
		if(Character.isDigit(c) || (c >='a' && c <='z'))return true;
		return false;
	}
	
}
