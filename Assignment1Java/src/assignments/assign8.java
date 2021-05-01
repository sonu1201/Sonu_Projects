package assignments;

import java.util.Scanner;

public class assign8 {

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		
		System.out.println("Enter length of rectangle");
		int l = s.nextInt();
		
		System.out.println("Enter breadth of rectangle");
		int b = s.nextInt();
		
		int p = 2 * (l + b);
		System.out.println("Perimeter of Rectangle:  " + p);
		
		int a = l * b;
		System.out.println("Area of Rectangle:  " + a);

	}

}
