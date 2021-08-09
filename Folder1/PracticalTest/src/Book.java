
abstract class Book {
	
	    String title = "Sample O/P: The title is: A tale of two cities";
	    
	    abstract void setTitle(String s);
	    
	    public String getTitle(String title){
	    	title = this.title;
	    	System.out.println(title);
	        return title;	    
	}

}
