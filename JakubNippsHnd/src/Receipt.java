
public class Receipt {

	private Customer customer;
	private Basket basket;
	
	
	public Receipt(Customer customer, Basket basket) {
		
		setCustomer(customer);
		setBasket(basket);
		
		
	}
	
	public void setCustomer(Customer customer) {
		
		this.customer = customer; 
	}
	
	public Customer getCustomer() {
		
		return this.customer;
	}
	
	public Basket getBasket() {
		
		return this.basket;
		
	}
	
	public void setBasket(Basket basket) {
		
		this.basket = basket;
	}
	
	
	public String toString() {
	return getCustomer() + " " + getBasket();
	}
	
	
	
	
}
