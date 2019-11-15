import java.time.*;
public class Customer {

	private String name;
	private LocalDate dateOfBirth;
	
	
	public Customer(String name, LocalDate dateOfBirth) throws InputValidationException{
		
		setName(name);
		setDateofBirth(dateOfBirth);
		
	}
	
	
	public String getName() {
		
		return this.name;
		
	}
	
	public void setName(String name) throws InputValidationException{
		
		if (name.matches("(\\p{ASCII}){2,20}")) {
			
	
		}
			this.name = name; 
	
			
			
			
			
	}
	
	
	
	public LocalDate getDateOfBirth() {
		
		
		
		return this.dateOfBirth;
		
		
	}
	
	public void setDateofBirth(LocalDate dateOfBirth) throws InputValidationException{
		
		if (dateOfBirth.isBefore(LocalDate.now())) {
			
			this.dateOfBirth = dateOfBirth;
			
			
		}
		else {
			throw new InputValidationException();
		}
		
	}
	
	
	public String toString() {
		
		return getName() + " " + getDateOfBirth();	
		}
	
	
	
}
