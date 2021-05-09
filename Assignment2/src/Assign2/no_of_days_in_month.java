package Assign2;

import java.util.Scanner;

//Program to find the number of days in a month

public class no_of_days_in_month {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
			System.out.println("Enter the month number:  ");
			int month = scn.nextInt();
			int num_days = 0;
			
			 System.out.print("Enter a year: ");
		        int year = scn.nextInt();
			
			switch(month) {
			case 1:
				num_days = 31;
				System.out.println("Month is January and number of days are: " + num_days);
				
				break;
			case 2:				
				
				  if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
	                    num_days = 29;
	                    System.out.println("Month is February and number of days are: " + num_days);
	                } else {
	                    num_days = 28;	
	                    System.out.println("Month is February and number of days are: " + num_days);
	                		}
				  break;
			case 3:
				num_days = 31;
				System.out.println("Month is March and number of days are: " + num_days  );
				
				break;
			case 4:
				num_days = 30;
				System.out.println("Month is April and number of days are: " + num_days );
				
				  break;
			case 5:
				num_days = 31;
				System.out.println("Month is May and number of days are: " + num_days  );
				
				  break;
			case 6:
				num_days = 30;
				System.out.println("Month is June and number of days are: " + num_days  );
				  break;
			case 7:
				num_days = 31;
				System.out.println("Month is July and number of days are: " + num_days  );
				  break;
			case 8:num_days = 31;
			System.out.println("Month is August and number of days are: " + num_days  );
				  break;
			case 9:
				num_days = 30;
				System.out.println("Month is September and number of days are: " + num_days  );
				  break;
			case 10:num_days = 31;
			System.out.println("Month is October and number of days are: " + num_days  );
				  break;
			case 11:
				num_days = 30;
				System.out.println("Month is November and number of days are: " + num_days  );
				  break;
			case 12:
				num_days = 31;
				System.out.println("Month is December and number of days are: " + num_days  );
				  break;	
				  default:
					  System.out.println("Number is not correct");
		
	} 

}
}
