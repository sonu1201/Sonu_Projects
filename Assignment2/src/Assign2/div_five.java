package Assign2;

import java.util.Scanner;

//Check whether a number is divisible by 5 and 11

public class div_five {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.print(" Please Enter any Number to Check whether it is Divisible by 5 and 11 : ");
		int num = scn.nextInt();	
		
		if((num % 5 == 0) && (num % 11 == 0))
		{
			System.out.println("\n Given number " + num + " is Divisible by 5 and 11"); 
		}
		else
		{
			System.out.println("\n Given number " + num + " is Not Divisible by 5 and 11"); 
		}	

	}

}
