public class A {
	static int method(int arr[], int num) {
		int l = 0, result = arr.length - 1;
		while (l <= result) {
			int temp = l + (result - l) / 2;
			if (arr[temp] == num)
				return temp;
			if (arr[temp] < num)
				l = temp + 1;
			else
				result = temp - 1;
		}
		return -1;
	}

	public static void main(String args[]) {
		int arr[] = { 2, 3, 4, 10, 40 };
		int num = 10;
		int position = method(arr, num);
		if (position == -1)
			System.out.println("Element not present");
		else
			System.out.println(position);
	}
}
