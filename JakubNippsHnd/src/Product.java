
public class Product {

	private String name;
	private String description;
	private double price;
	
	
	public Product(String name, String description, double price) throws InputValidationException{
		
		setName(name);
		setDescription(description);
		setPrice(price);
		
		
		
	}
	
	
	public String getName() {
		
		
		return this.name;
		
	}
	
	public void setName(String name) throws InputValidationException {
		
		if (name.matches("(\\p{ASCII}){2,100}")) { // this regex check for error (awesome)
			this.name = name;
		}
		
	
		else {
		
		throw new InputValidationException();
		
	}
}


public String getDescription() {
	
	return this.description;
}


public void setDescription(String description) throws InputValidationException{
	if (description.matches("(\\p{ASCII}){5,250}")) {
		this.description = description;
		
	}
	else {
	throw new InputValidationException();
		}
	
	
	
}


public double getPrice() {
 return this.price;
}



public void setPrice(double price) throws InputValidationException{
	if (price > 0.0 && price < 99999.99) {
		this.price = price;}
		
	
	else {
		throw new InputValidationException();}
	
	

}
		
public String toString() {
	
	return getName() + " " + getDescription() + "" + getPrice();	
	}











}
