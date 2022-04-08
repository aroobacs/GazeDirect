public class ReverseString {
public static void main(String[] args) {
		String str = "EyeTracking";
		reverseStr(str);
	}
	static void reverseStr(String str) {
		int num = str.length();
		char[] ch = str.toCharArray();
		char temp;
		for (int i = 0, j = num - 1; i < j; i++, j--) {
			temp = ch[i];
			ch[i] = ch[j];
			ch[j] = temp;
		}
		System.out.println(ch);
	}

	
}
