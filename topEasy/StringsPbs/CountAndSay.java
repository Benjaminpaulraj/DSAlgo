package leetCode.topEasy.StringsPbs;

public class CountAndSay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(countAndSay1(10));
	}
	public static String countAndSay(int n) {
		
		if(n==0 || n==1) return "1";
		if(n==2) return "11";
		
		String res = countAndSay(n-1);
		
			StringBuilder temp = new StringBuilder();
			for (int j = 0, count =1; j < res.length(); j++) {
				if (j < res.length()-1 && res.charAt(j) == res.charAt(j+1)) {
					count++;
				} else {
					temp .append((count)).append(res.charAt(j));
					count = 1;
				}
			}
		return temp.toString();
	}

	public static String countAndSay1(int n) {
		
		String res = "1";
		for (int i = 1; i <= n; i++) {
			if(i == 1) {
				res = "1";
				continue;
			}
			StringBuilder temp = new StringBuilder();
			for (int j = 0, count =1; j < res.length(); j++) {
				if (j < res.length()-1 && res.charAt(j) == res.charAt(j+1)) {
					count++;
				} else {
					temp .append((count)).append(res.charAt(j));
					count = 1;
				}
			}
			res = temp.toString();
		}
		return res;

	}
}
