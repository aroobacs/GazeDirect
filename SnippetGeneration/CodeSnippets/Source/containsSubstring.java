
public class containsSubstring {

	public static void main(String[] args) {
		String word = "Hamburg";
		String substring = "test";
		System.out.println(containsSubstring(word, substring));
	}

	public static boolean containsSubstring(String word, String substring) {
		boolean containsSubstring = false;

		for (int i = 0; i < word.length(); i++) {
			for (int j = 0; j < substring.length(); j++) {
				if (i + j > word.length()) {
					break;
				}
				if (word.charAt(i + j) != substring.charAt(j)) {
					break;
				} else {
					if (j == substring.length() - 1) {
						containsSubstring = true;
						break;
					}
				}
			}
		}

		return containsSubstring;
	}

}