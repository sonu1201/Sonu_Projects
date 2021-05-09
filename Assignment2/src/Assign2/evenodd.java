package Assign2;

import java.util.Scanner;

// Program to check whether a number is even or odd


public class evenodd {

	public static void main(String[] args) {
		 
		Scanner scn = new Scanner (System.in);
		
		System.out.println("Enter the number you want to check of even/odd: ");
		 int a= scn.nextInt();
		 
		 if(a%2 == 0) {
			 System.out.println("Number is even ");
		 }else {
			 System.out.println("Number is odd ");
		 }
		 

		
	}

}
