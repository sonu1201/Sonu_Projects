package Assign2;

import java.util.Scanner;

//Program to count total number of  500,100,50,20 and 10 notes in a given amount

public class note_count {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter the amount :");
		
		int amt = scn.nextInt();
		int note=0;
		
		if (amt > 1000) {
			
			note = amt/1000; //20
			
			System.out.println( note + " : notes of 1000" );
			
			
						
			note = amt/500;
			System.out.println( note + " : notes of 500" );
			
			note = amt/100;
			System.out.println( note + " : notes of 100" );
			
			note = amt/10;
			System.out.println( note + " : notes of 10" );
			
			
		}
		
		else if( amt >500) {
			
			note = amt/500;
			System.out.println( note + " : notes of 500" );
			
			note = amt/100;
			System.out.println( note + " : notes of 100" );
			
			note = amt/10;
			System.out.println( note + " : notes of 10" );
		
						
		}
		
		else if(amt > 100) {
			note = amt/100;
			System.out.println( note + " : notes of 100" );
			
			note = amt/10;
			System.out.println( note + " : notes of 10" );
			
		} else if (amt >10) {
			
			note = amt/10;
			System.out.println( note + " : notes of 10" );
			
		} else {
			System.out.println("Amount is less than 10");
		}

	}

}
