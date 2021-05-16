package PatternAssignment;

public class Pattern3 {

	public static void main(String[] args) {

		int n = 9;

		for (int i = 1; i <= n; i++) {
			
			if (i==2 || i==4 ||i==6 ||i==8) {
				continue;
			}

			for (int j = 1; j <= i; j++) {

				System.out.print("* ");
				
			}

			System.out.println();

		}

	}

}
