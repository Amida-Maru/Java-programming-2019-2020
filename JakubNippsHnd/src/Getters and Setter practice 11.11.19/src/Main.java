
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Movie movie1 = new Movie(); // new way - because of getters we are not able to see private variables
									// directly from a constructor we need to getters class
		//Movie movie2 = new Movie("Step Brtohers", "Adam Ronald", "R"); // old way without getters and setters - values
																		// directly entered to a constructor

								// without getters and setters the user can write 
								// wrong things not related to
								// the rating!
								// One of the things getters and setters can do is to create set of rules
								// for the data which can only be entered
		
		
		// Using setters method in order to assign values to an object of a Movie class
		
		movie1.setRating("G"); // setRating means accessing setter (the middle man)
		movie1.setDirector("Gandalf");
		movie1.setRating("NR");
		movie1.setTitle("Magic");
		
		
		// G,PG,PG-13,R, NR
		System.out.println(movie1.getRating());
		System.out.println(movie1.getDirector());
		System.out.println(movie1.getTitle());

		
		
		
	}

	private static void end() {
		// TODO Auto-generated method stub
		
	}

}
