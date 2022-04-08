public class B {
public static void main(String[] args) {
		int arr[] = { 23, 16, 3, 42, 75, 536, 61 };
		method(arr, arr.length);
		System.out.println(Arrays.toString(arr));
	}
	static void method(int[] arr, int num) {
		int temp = 0;
		for (int i = 0; i < num; i++) {
			for (int j = 1; j < (num - i); j++) {
				if (arr[j - 1] > arr[j]) {
					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		int arr[] = { 23, 16, 3, 42, 75, 536, 61 };
		method(arr, arr.length);
		System.out.println(Arrays.toString(arr));
	}
}
