package leetCode.topEasy.StringsPbs;

public class FirstUniqueCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(firstUniqChar("abbcac"));
	}
    public static int firstUniqChar(String s) {
        int[] charArr = new int[26];
        for(int i=0;i<26;i++) {
        	charArr[i] = 0;
        }
        for(int i =0;i < s.length();i++) {
        	charArr[(int)s.charAt(i) - (int)'a'] += 1;
        }
        for(int i =0;i < s.length();i++) {
        	if(charArr[(int)s.charAt(i) - (int)'a'] == 1)return i;
        }
    	return -1;
    }
}
