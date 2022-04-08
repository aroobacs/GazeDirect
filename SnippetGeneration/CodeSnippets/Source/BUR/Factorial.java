public class C {
public static void main(String[] args) {
		System.out.println(method(3));
	}
	static int method(int num) {
		if (num == 0)
			return 1;
		return num * method(num - 1);
	}

	
}
