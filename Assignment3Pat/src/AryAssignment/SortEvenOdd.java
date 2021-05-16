package AryAssignment;

//Program to Sort an array Elements and then segregate the even and odd elements of an array

public class SortEvenOdd {

	public static void main(String[] args) {

		int[] sarr = { 23, 45, 67, 78, 68, 98, 3, 4 };

		int temp;
		int i;

		for (i = 0; i < sarr.length; i++) {

			for (int j = i + 1; j < sarr.length; j++) {

				if (sarr[j] < sarr[i]) {

					temp = sarr[j];
					sarr[j] = sarr[i];
					sarr[i] = temp;
				}
			}

			System.out.print(sarr[i] + " ");

		}
		System.out.println();		
		System.out.println("Odd number array  ");
		for (i = 0; i < sarr.length; i++) {
			if (sarr[i] % 2 != 0) {

				System.out.print(sarr[i] + " ");
			}
		}
		System.out.println();
		System.out.print("Even number array: ");
		System.out.println();
		
		for (i = 0; i < sarr.length; i++) {
			if (sarr[i] % 2 == 0) {

				System.out.print(sarr[i] + " ");
			}
		}

	}

}
