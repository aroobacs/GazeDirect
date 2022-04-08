public class IntegertoBinary {
public static void main(String[] args) {
		int n = 17;
		decToBinary(n);
	}
	static void decToBinary(int num) {
		if (num == 0)
			return;
		decToBinary(num / 2);
		System.out.print(num % 2);
	}

	
}
