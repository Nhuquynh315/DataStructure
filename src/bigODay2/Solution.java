package bigODay2;

public class Solution {

	public static void main(String[] args) {
		String string = "aaabbaaabbbbbaa";
		String string1 = "abababaaaabbbb";
		String string2 = "abababa";
		String string3 = "bbbaabbbbabbb";

		Solution(string);
		Solution(string1);
		Solution(string2);
		Solution(string3);

	}

	public static void Solution(String string) {
		int count = 0;
		for (int i = 1; i < string.length() - 1; i++) {
			if (string.charAt(i) == string.charAt(i - 1) && string.charAt(i) == string.charAt(i + 1)) {
				count++;
			}
		}
		System.out.println(count);
	}
}
