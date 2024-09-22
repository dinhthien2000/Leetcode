package leetcode.code;

public class MergeStringsAlternately {

	public String mergeAlternately(String word1, String word2) {
		
		String string = "";
		int max_length = word1.length() > word2.length() ? word1.length() : word2.length();
		for (int i = 0; i < max_length; i++) {
			if (i >= word1.length() && i <= word2.length()) {
				string += "" + String.valueOf(word2.charAt(i));
			} else if (i <= word1.length() && i >= word2.length()) {
				string += String.valueOf(word1.charAt(i));
			} else {
				string += String.valueOf(word1.charAt(i)) + String.valueOf(word2.charAt(i));
			}
		}
		return string;
	}
}
