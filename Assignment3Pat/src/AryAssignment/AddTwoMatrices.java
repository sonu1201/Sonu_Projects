package AryAssignment;

//Program to add the two matrices

public class AddTwoMatrices {

	public static void main(String[] args) {

		int n = 3;
		int a[][] = { { 1, 3, 4 }, { 2, 4, 3 }, { 3, 4, 5 } };
		int b[][] = { { 1, 3, 4 }, { 2, 4, 3 }, { 1, 2, 4 } };

		int c[][] = new int[3][3];

		for (int i = 0; i < n; i++) {

			for (int j = 0; j < n; j++) {

				c[i][j] = a[i][j] + b[i][j];

				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}

	}

}
