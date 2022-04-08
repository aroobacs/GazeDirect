public class G {
public static void main(String[] args) {
		int n = 15;
		method(n);
	}
	public static void method(int num) {
		int i = 2;
		if (num == 1)
			return;
		while (num % i != 0)
			i++;
		System.out.print(i + " ");
		method(num / i);
	}

	
}
