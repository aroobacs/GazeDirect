public class ReverseString {
public static void main(String[] args) {
		String str = "Eye Tracking";
		String reversed = reverseString(str);
		System.out.println(reversed);
	}
	public static String reverseString(String str) {
		if (str.isEmpty())
			return str;
		return reverseString(str.substring(1)) + str.charAt(0);
	}

	
}
