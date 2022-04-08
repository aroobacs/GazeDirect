public class Factorial {
public static void main(String[] args) {
		System.out.println(factorial(3));
	}
	static int factorial(int num) {
		int result;
		if (num == 0)
			return 1;
		else
		result= num * factorial(num - 1);
	return result;
	}

	
}
