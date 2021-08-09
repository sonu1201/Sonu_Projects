import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseArrayList {

	public static void main(String[] args) {

		  List<Integer> list = new ArrayList<Integer>();  
		  list.add(10);
		  list.add(20);
		  list.add(30);
		  list.add(40);
		  list.add(50);
		  
		  System.out.println("Before Reversing: " +list.toString() ); 
		  Collections.reverse(list);  
		  System.out.println("After Reversing: " +list);  
		  

	}

}
