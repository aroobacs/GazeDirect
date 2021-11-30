public class Multiply3x3Matrix {
	static void multiply(int mat1[][], int mat2[][], int res[][]) {
		int i, j, k;
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				res[i][j] = 0;
				for (k = 0; k < 3; k++)
					res[i][j] += mat1[i][k] * mat2[k][j];
			}
		}
	}

	public static void main(String[] args) {
		int mat1[][] = { { 1, 1, 1 }, { 2, 2, 2 }, { 3, 3, 3 } };
		int mat2[][] = { { 1, 1, 1 }, { 2, 2, 2 }, { 3, 3, 3 } };
		int res[][] = new int[3][3];
		int i, j;
		multiply(mat1, mat2, res);
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++)
				System.out.print(res[i][j] + " ");
			System.out.println();
		}
	}
}
