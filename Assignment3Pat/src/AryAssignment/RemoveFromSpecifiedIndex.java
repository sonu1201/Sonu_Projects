package AryAssignment;

import java.util.Arrays;

//Program to remove the element on specific index number form an array

public class RemoveFromSpecifiedIndex {

	public static void main(String[] args) {

		int[] arr1 = { 3, 4, 1, 8, 6, 9 };

		int rmv_num = arr1[0];
		int[] arr2 = new int[arr1.length - 1];
		int j = 0;

		for (int i = 0; i < arr1.length; i++) {

			if (arr1[i] == rmv_num) {
				continue;
			}
			arr2[j] = arr1[i];
			j++;
		}
		System.out.println(Arrays.toString(arr2));

	}

}
