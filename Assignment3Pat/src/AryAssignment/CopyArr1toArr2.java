package AryAssignment;

import java.util.Arrays;

//Program to copy an array elements into new array and print the new array values

public class CopyArr1toArr2 {

	public static void main(String[] args) {

		int[] arr1 = { 34, 54, 67, 23, 98 };

		int[] arr2 = new int[5];

		for (int i = 0; i < arr1.length; i++) {

			arr2[i] = arr1[i];

		}
		System.out.println(Arrays.toString(arr2));

	}

}
