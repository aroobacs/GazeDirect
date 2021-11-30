public class C {
	static int method(int num) {
		if (num == 0)
			return 1;
		return num * method(num - 1);
	}

	public static void main(String[] args) {
		System.out.println(method(3));
	}
}
