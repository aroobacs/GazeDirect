public class F {

public static void main(String[] mat1rgs) {
		int row1 = 3, col1 = 3, row2 = 3, col2 = 3;
		int mat1[][] = { { 1, 1, 1 }, { 2, 2, 2 }, { 3, 3, 3 } };
		int mat2[][] = { { 1, 1, 1 }, { 2, 2, 2 }, { 3, 3, 3 } };
		int[][] C = new int[3][3];
		method(row1, col1, mat1, row2, col2, mat2, C);
		for (int i = 0; i < row1; i++) {
			for (int j = 0; j < col2; j++)
				System.out.print(C[i][j] + " ");
			System.out.println();
		}
	}
	public static int i = 0, j = 0, k = 0;

	static void method(int row1, int col1, int mat1[][], int row2, int col2, int mat2[][], int C[][]) {
		if (i >= row1)
			return;
		if (j < col2) {
			if (k < col1) {
				C[i][j] += mat1[i][k] * mat2[k][j];
				k++;
				method(row1, col1, mat1, row2, col2, mat2, C);
			}
			k = 0;
			j++;
			method(row1, col1, mat1, row2, col2, mat2, C);
		}
		j = 0;
		i++;
		method(row1, col1, mat1, row2, col2, mat2, C);
	}

	
}
