package AryAssignment;

public class SearchElement {

	public static void main(String[] args) {

		int[] a = { 11, 22, 34, 67, 6, 9, 23 };
		int s = 46;
		int count = 0;
		int i;

		for (i = 0; i < a.length; i++) {

			if (a[i] != s) {
				continue;
			}if (a[i] == s) {
				System.out.println(s + " is at location " + i);
				count++;
			}
		}if (count == 0) {
			System.out.println(s + " is not present in array");
		} 

	}

}
