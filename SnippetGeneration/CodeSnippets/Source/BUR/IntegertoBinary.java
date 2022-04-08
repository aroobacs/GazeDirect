public class E {
public static void main(String[] args) {
		int n = 17;
		method(n);
	}
	static void method(int num) {
		if (num == 0)
			return;
		method(num / 2);
		System.out.print(num % 2);
	}

	
}
