package PatternAssignment;

public class Pattern1 {

	public static void main(String[] args) {

		int n = 4;

		for (int i = 1; i <= n; i++) {

			int num = 1;

			for (int j = 1; j <= i; j++) {
				System.out.print(num + " ");
				num++;
			}

			for (int k = i - 1; k >= 1; k--) {

				System.out.print(k + " ");

			}

			System.out.println();
		}
	}

}
