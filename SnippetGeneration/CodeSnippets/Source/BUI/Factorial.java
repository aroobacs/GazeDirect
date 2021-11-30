public class C {
	static int method(int num) {
		int result = 1;
		for (int i = 2; i <= num; i++)
			result *= i;
		return result;
	}

	public static void main(String[] args) {
		System.out.println(method(5));
	}
}
