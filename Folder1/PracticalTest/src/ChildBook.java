
public class ChildBook extends Book {
	
	@Override
	void setTitle(String s) {
		System.out.println("Sample I/P:  A tale of two cities");
		}


	public static void main(String[] args) {
		Book obj = new ChildBook();
		
		obj.setTitle("str");
		obj.getTitle("str1");

	}

	
}
