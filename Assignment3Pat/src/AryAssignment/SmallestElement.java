package AryAssignment;

//Program to find the smallest element of an array

public class SmallestElement {

	public static void main(String[] args) {

		
		int[] sml = {3, 4, 6, 2, 16};
		
		int min= sml[0];					
		
		for (int i =0; i < sml.length; i++){
			
			if(sml[i]< min) {
				
				min = sml[i];
				
			}
			
		}
		System.out.println("Smallest element is: " + min);
		
		

	

	}

}
