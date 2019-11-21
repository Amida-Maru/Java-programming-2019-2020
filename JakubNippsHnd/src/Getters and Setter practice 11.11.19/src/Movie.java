
public class Movie {

	
	private String title; // setting private does not allow Main to access this variable
							// setting private is procedure in order to set up getters
	private String director; //private means that it can only be access in this class 
								
	private  String rating;   // Setter is a method which will be used by Main in order to modify the rating attributes 
					 // Setter acts as a middle man between a person creating an object and the object itself

		
		
	// Setters methods bellow ( 3 in total)
	
	
	public void setRating(String rating) {
		
		
		if(rating.equals("Good")  || rating.equals("Bad") || rating.equals("Not rated")) {
			
		this.rating = rating;}
		
		else{

		
			this.rating = "Wrong rating";}
		
	}
	
public void setTitle(String title) { // no exception because user can put any title 
		
		this.title = title;
		
	}
	
public void setDirector(String director) { // no exception because user can put any title 
	
	this.director = director; 
	
}
	

// Getters bellow 3 in total - without those methods your Main class will not be able to use that


public String getRating() {
	
	return this.rating; // what is the reason of using .this ?
}


public String getTitle() {
	
	return this.title;
}


public String getDirector() {
	
	return this.director;
}





	
}
