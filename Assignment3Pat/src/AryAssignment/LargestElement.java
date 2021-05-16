package AryAssignment;

////Program to find the largest element of an array

public class LargestElement {

	public static void main(String[] args) {

		int[] lar = { 199, 12, 15, 1000, 13 };

		int m = 0;
		
		for (int i = 0; i < lar.length; i++) {
			if (lar[i] > m) {
				m = lar[i];

			}

		}
		System.out.println("Maximun Number is :" + m);

	}

}
