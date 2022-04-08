class PrimeFactors {
public static void main(String[] args) {
		int n = 15;
		primeFactors(n);
	}
	public static void primeFactors(int num) {
		int i = 2;
		if (num == 1)
			return;
		while (num % i != 0)
			i++;
		System.out.print(i + " ");
		primeFactors(num / i);
	}

	
}
