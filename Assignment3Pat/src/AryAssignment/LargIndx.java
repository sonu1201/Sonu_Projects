package AryAssignment;

//Program to find the index number of largest element

public class LargIndx {

	public static void main(String[] args) {
		int[] a = {3, 1, 74, 6, 7, 8};
		int max = 0;
		int indexlarge=0;
		
		for (int i= 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
				indexlarge=i;
			}
		}
		System.out.println("Maximum number is: " +max + " and its index number is: " +indexlarge);

	}

}
