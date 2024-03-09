import java.util.HashSet;

// CS108 HW1 -- String static methods

public class StringCode {

	/**
	 * Given a string, returns the length of the largest run.
	 * A a run is a series of adajcent chars that are the same.
	 * @param str
	 * @return max run length
	 */
	public static int maxRun(String str) {
		int maxx = 0;
		int cnt = 0;
		if (str.isEmpty()) return 0;
		char cur = str.charAt(0);
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == cur) {
				cnt++;
			} else {
				cur = str.charAt(i);
				maxx = Integer.max(maxx, cnt);
				cnt = 1;
			}
		}
		maxx = Integer.max(maxx, cnt);
		return maxx;
	}

	
	/**
	 * Given a string, for each digit in the original string,
	 * replaces the digit with that many occurrences of the character
	 * following. So the string "a3tx2z" yields "attttxzzz".
	 * @param str
	 * @return blown up string
	 */
	public static String blowup(String str) {
		String ans = "";
		for (int i = 0; i < str.length(); i++) {
			if ((str.charAt(i) >= '0') && (str.charAt(i) <= '9') && i < str.length() - 1) {
				int cnt = (int) (str.charAt(i) - '0');
				while (cnt != 0) {
					ans += str.charAt(i + 1);
					cnt--;
				}
			} else if ((str.charAt(i) < '0') || (str.charAt(i) > '9')) {
				ans += str.charAt(i);
			}
		}
		return ans;
	}
	
	/**
	 * Given 2 strings, consider all the substrings within them
	 * of length len. Returns true if there are any such substrings
	 * which appear in both strings.
	 * Compute this in linear time using a HashSet. Len will be 1 or more.
	 */
	public static boolean stringIntersect(String a, String b, int len) {
		HashSet<String> save = new HashSet<String>();
		for (int i = 0; i <= a.length() - len; i++) {
			save.add(a.substring(i, i + len));
		}
		for (int i = 0; i < b.length() - len; i++) {
			if (save.contains(b.substring(i, i + len))) {
				return true;
			}
		}
		return false;
	}
}
