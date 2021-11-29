public class Power {
	public static void main() {
		int base = 3;
		int exponent = 3;
		System.out.println(power(base, exponent));
	}

	public static int power(int base, int exponent) {
		int result = base;
		for (int i = 2; i <= exponent; i += 1) {
			result = result * base;
		}
		return result;
	}
}

//Source: https://www3.ntu.edu.sg/home/ehchua/programming/java/J3a_OOPBasics.html