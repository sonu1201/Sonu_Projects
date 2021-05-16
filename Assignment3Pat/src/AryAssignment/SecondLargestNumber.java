package AryAssignment;

//Program to find the second largest number  of an array

public class SecondLargestNumber {

	public static void main(String[] args) {

		int[] a = { 9, 25, 28, 92, 54, 36 };
		int larg = 0;
		int sec_larg = 0;

		for (int i = 0; i < a.length; i++) {

			if (a[i] > larg) {
				sec_larg = larg;
				larg = a[i];

			} else if (a[i] > sec_larg) {
				sec_larg = a[i];
			}

		}
		System.out.println(sec_larg);

	}

}
