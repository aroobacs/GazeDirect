public class D {
public static void main(String args[]) {
		int num = 3;
		System.out.println(method(num));
	}
	static int method(int num) {
		int f[] = new int[num + 2];
		int i;
		f[0] = 0;
		f[1] = 1;
		for (i = 2; i <= num; i++) {
			f[i] = f[i - 1] + f[i - 2];
		}
		return f[num];
	}

	public static void main(String args[]) {
		int num = 3;
		System.out.println(method(num));
	}
}
