public class Fibonacci {
	static int findFibonacci(int num) {
		if (num <= 1)
			return num;
		return findFibonacci(num - 1) + findFibonacci(num - 2);
	}

	public static void main(String args[]) {
		int num = 3;
		System.out.println(findFibonacci(num));
	}
}
