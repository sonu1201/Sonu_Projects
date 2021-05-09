package Assign2;

import java.util.Scanner;

//Program to check  whether  number is positive or negative number

public class positive_negative {

	public static void main(String[] args) {
		
		
		Scanner scn = new Scanner(System.in) ;
		
		System.out.println("Enter the number you want to check:  ");
		
		int n = scn.nextInt();
		
		if(n > 0)
		{
			System.out.println("The entered number " + n + " is a +ve number");
		}
		if (n<0) {
			System.out.println("The entered number " + n + " is a -ve number");
		}
		if (n == 0) {
			System.out.println("The entered number " + n + " is neighter +ve nor -ve number");
		}
		
		
		
	}

}
