package assignments;

import java.util.Scanner;

public class assign9 {

	public static void main(String[] args) {
		
		Scanner scn =new Scanner (System.in);
		System.out.println("Enter any digit between 0-1000: ");
		
		int num = scn.nextInt();
		int sum = 0;
		
		while(num!=0) {
			
			sum = sum + (num%10);
			num = num/10;
		}
		System.out.println("Sum is: " + sum);	
		

	}

}
