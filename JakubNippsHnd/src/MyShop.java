import java.time.LocalDate;

public class MyShop{

	public static void main(String[] args) {

		try {
	
	Customer myCustomer = new Customer("Anne-Marie", LocalDate.parse("1971-04-09"));
	Payment defaultPayment = new Payment("1","0322","221","4422");
	Basket myBasket = new Basket();
	
	myBasket.add(new Product("Card1", "Great card 1 ", 2));
	myBasket.add(new Product("Card2", "Great card 2 ", 4));
	myBasket.add(new Product("Card3", "Great card 3 ", 5));

	System.out.println("Total Price:" + myBasket.getTotalPrice());
	
	Receipt myReceipt = new Receipt(myCustomer, myBasket);
	System.out.println("Card details: " + defaultPayment);
	System.out.println("Receipt:" + myReceipt);
}


catch (InputValidationException e) {
e.printStackTrace();	
}


	}

}




	

