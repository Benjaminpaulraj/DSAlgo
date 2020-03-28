package leetCode.topEasy.StringsPbs;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] strs = { "flower", "flow", "flow" };
		System.out.println(longestCommonPrefix(strs));
	}

	
	
	public static String longestCommonPrefix1(String[] strs) {
		StringBuilder res = new StringBuilder();
		while (true) {
			if (strs.length == 0)
				return "";
			if (strs.length == 1)
				return strs[0];
			for (int i = 0; i < strs.length - 1; i++) {
				if (strs[i].length() <= res.length() || strs[i + 1].length() <= res.length()
						|| (int) strs[i].charAt(res.length()) != (int) strs[i + 1].charAt(res.length())) {
					return res.toString();
				}
			}
			res.append((char) strs[0].charAt(res.length()));
		}
	}

	
	
	
	static String longestCommonPrefix(String[] strs) {
		return commonPrefix(strs, 0, strs.length - 1);
	}

	static String commonPrefix(String[] strs, int s, int e) {
		if (s > e)
			return "";
		if (s == e)
			return strs[s];
		int mid = (s + e) >> 1;
		return compare(commonPrefix(strs, s, mid), commonPrefix(strs, mid + 1, e));
	}

	static String compare(String s1, String s2) {
		int i = -1;
		while (i + 1 < s1.length() && i + 1 < s2.length() && s1.charAt(i + 1) == s2.charAt(i + 1)) {
			i++;
		}
		return s1.substring(0, i + 1);
	}

	
	
}
