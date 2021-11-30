public class Fibonacci {
	static int findFibonacci(int num) {
		int arr[] = new int[num + 2];
		int i;
		arr[0] = 0;
		arr[1] = 1;
		for (i = 2; i <= num; i++) {
			arr[i] = arr[i - 1] + arr[i - 2];
		}
		return arr[num];
	}

	public static void main(String args[]) {
		int num = 3;
		System.out.println(findFibonacci(num));
	}
}
