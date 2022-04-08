public class B {
public static void main(String[] args) {
		int arr[] = { 23, 16, 3, 42, 75, 536, 61 };
		method(arr, arr.length);
		System.out.println(Arrays.toString(arr));
	}
	static void method(int arr[], int num) {
		if (num == 1)
			return;
		for (int i = 0; i < num - 1; i++)
			if (arr[i] > arr[i + 1]) {
				int temp = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = temp;
			}
		method(arr, num - 1);
	}

	
}
