package PatternAssignment;

public class Pattern4 {

	public static void main(String[] args) {

		
		int n = 5;
		int h = (n + 1) / 2;
		int count = 0;
		int num = 2;
		
		
		for (int i = 1; i <= n; i++) {

			if (i <= h) {
				count = i;
			} else {
				count--;
			}

			for (int j = 1; j <= count; j++) {
				
				System.out.print(num + " ");
				
				num = num + 2;
			}

			System.out.println();

		}
	
		

	}

}
