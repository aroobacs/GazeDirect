public class D {
	static int method(int num) {
		if (num <= 1)
			return num;
		return method(num - 1) + method(num - 2);
	}

	public static void main(String args[]) {
		int num = 3;
		System.out.println(method(num));
	}
}
