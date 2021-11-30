public class H {
	public static String method(String str) {
		if (str.isEmpty())
			return str;
		return method(str.substring(1)) + str.charAt(0);
	}

	public static void main(String[] args) {
		String str = "Eye Tracking";
		String reversed = method(str);
		System.out.println(reversed);
	}
}
