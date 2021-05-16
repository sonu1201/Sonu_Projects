package AryAssignment;

//Program to sort an array using built-in method and display the elements using  for-each  loop

import java.util.Arrays;

public class SortingInbuiltMethod {

	public static void main(String[] args) {
		int[] a = {100, 24, 98, 76, 67, 56, 36, 19};
		
		
		Arrays.sort(a);
		
		for(int val: a) {
			System.out.print( val+ ", ");
			
		}
		
		

	}

}
