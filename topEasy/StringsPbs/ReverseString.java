package leetCode.topEasy.StringsPbs;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] a = {'a','b','c','d'};
		System.out.println(a);
		reverseString(a);
		System.out.println(a);
	}

    public static void reverseString(char[] s) {
        for(int i = 0; i<s.length/2;i++) {
        	char t = s[i];
        	s[i] = s[s.length-1-i];
        	s[s.length-1-i] = t;
        }
    }
}
