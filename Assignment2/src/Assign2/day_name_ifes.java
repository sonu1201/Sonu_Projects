package Assign2;

// Program to enter the days of week and print name of  day--Ladder if else

import java.util.Scanner;

public class day_name_ifes {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
				System.out.println("Enter a vaild number of day from (0-7): ");
		
		int b = scn.nextInt();
		
		   

	       if(b==1) {
	    	   System.out.println("Monday");
	       }

	       else if(b==2) {
	    	   System.out.println("Tuesday");
	       }

	       else if(b==3)  {
	    	   System.out.println("Wednesday");
	       }

	       else if(b==4) {
	    	   System.out.println("Thursday");
	       }

	       else if(b==5) {
	    	   System.out.println("Friday");
	       }

	       else if(b==6) {
	    	   System.out.println("Saturday");
	       }

	       else if(b==7) {
	    	   System.out.println("Sunday");
	       }

	       else        {
	    	   System.out.println("Wrong input.");
	       }

	}

}
