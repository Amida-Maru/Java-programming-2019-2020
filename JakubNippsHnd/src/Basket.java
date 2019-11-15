import java.util.*;


public class Basket {

	
	private ArrayList<Product> products;
	
	public Basket() {
		
		products = new ArrayList<Product>();
	}
	
	
	
	public void add(Product product) {
		
		
		
		products.add(product);
	}
	
	
	public double getTotalPrice() {
		
		
		double total = 0.0;
		
		for (Product product : products) {
			
			
			total = total + product.getPrice();
		}
		
		return total;
		
	}
		public String toString() {
			return products.toString() + " " + getTotalPrice();
			
			
		
			
			
			
			
		}
	}
	
	
	

