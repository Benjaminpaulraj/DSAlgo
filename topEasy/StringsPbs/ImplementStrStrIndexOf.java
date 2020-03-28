package leetCode.topEasy.StringsPbs;

public class ImplementStrStrIndexOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(strStr("hello", "esll"));
		//System.out.println("st".length());
	}
	
    public static int strStr(String haystack, String needle) {
        
    	if(needle.length() ==0)return 0;
    	for(int i=0,j=0; i< haystack.length()-needle.length()+1;i++) {
    		//System.out.println(haystack.charAt(i)+"==="+needle.charAt(0));
    		if(haystack.charAt(i) == needle.charAt(0)) {
    			for(j=1; j < needle.length();j++) {
    				if(haystack.charAt(i+j) != needle.charAt(j))break;
    			}
    			//System.out.println(j+"======="+needle.length());
    			if(j ==  needle.length()) return i;
    		}
    	}
    	return -1;
    }	

}
