package AryAssignment;

public class SumArrayElements {

	public static void main(String[] args) {
		
		int[] a = { 4, 8, 6, 3, 5, 2 };
		int sum = 0;

		for (int i = 0; i < a.length; i++) {

			sum = sum + a[i];

		}
		System.out.println("Sum of array is: " + sum);

	}

}
