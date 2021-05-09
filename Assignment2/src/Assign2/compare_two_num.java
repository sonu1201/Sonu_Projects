package Assign2;

import java.util.Scanner;

//program to compare two numbers

public class compare_two_num {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner (System.in);
		
		System.out.println("Enter a number1: ");
		
		int num1 = scn.nextInt();		
		
		System.out.println("Enter number2");
		int num2 = scn.nextInt();
		
		if (num1 > num2) {
			System.out.println( num1 + " is greater than : " + num2);
		}else if(num1 == num2) {
			System.out.println( num1 + " is equal to : " + num2);
		} else {
			System.out.println( num1 + " is less than : " + num2);
		}
			
				

	}

}
