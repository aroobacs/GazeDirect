public class BinarySearch {
public static void main(String args[]) {
		int arr[] = { 2, 3, 4, 10, 40 };
		int n = arr.length;
		int num = 10;
		int position = binarySearch(arr, 0, n - 1, num);
		if (position == -1)
			System.out.println("Element not present");
		else
			System.out.println(position);
	}
	static int binarySearch(int arr[], int len, int arrlen, int num) {
		if (arrlen >= len) {
			int mid = len + (arrlen - len) / 2;
			if (arr[mid] == num)
				return mid;
			if (arr[mid] > num)
				return binarySearch(arr, len, mid - 1, num);
			return binarySearch(arr, mid + 1, arrlen, num);
		}
		return -1;
	}

	
}
