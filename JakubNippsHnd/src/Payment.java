import java.time.LocalDate;

public class Payment {

	//private String methode;
	private String cardNumber; // Since the card format xxxx xxxx xxxx xxxx
	private String expiryDate;
	private String cvcCode;
	private String pinNumber;
	
	// Constructor 
	public Payment(String cardNumber,String expiryDate, String cvcCode, String pinNumber) {
		
		this.cardNumber = cardNumber;
		this.expiryDate = expiryDate;
		this.cvcCode = cvcCode;
		this.pinNumber = pinNumber;
		
		}
	// Getter methods
	
	public String CardNumber() {
		return this.cardNumber;
	}
	
	public String expiryDate() {
		return this.expiryDate;
	}
	
	public String cvcCode() {
		return this.cvcCode;
	}
	
	public String pinNumber() {
		return this.pinNumber;
	}
	
	
	// Setters methods
	
	 public void  setcardNumber(String cardNumber) throws InputValidationException { 									
		if (cardNumber.matches("(\\p{ASCII}){8,100}")) {
			this.cardNumber = cardNumber; 
		}
		
		else {
			throw new InputValidationException();
		}

			
	}
	
	public void  setexpiryDate(String expiryDate) throws InputValidationException{
	
		if (expiryDate.matches("(\\p{ASCII}){4,4}")) {
			
			this.expiryDate = expiryDate; 
			
		}
			
		else {
			throw new InputValidationException();
		}
		
		
		
	}
	
	
	
	
	
	public void  setcvcCode(String cvcCode) throws InputValidationException {
		
		if (cvcCode.matches("(\\p{ASCII}){3,3}")) {
			
			this.cvcCode = cvcCode; 
			
		}
		else {
			throw new InputValidationException();
		}
			
		
		
	}
	
	public void  setpinNumber(String pinNumber) throws InputValidationException {
		
		if (pinNumber.matches("(\\p{ASCII}){4,4}")) { 
			
			this.pinNumber = pinNumber; 
			
		}
		else {
			throw new InputValidationException();
		}
			
		
		
	}
	
	
public String toString() {
		
		return CardNumber() + " expiry date: " + expiryDate() + " security code: " + cvcCode() + " pin number: " + pinNumber() ;	
		}
	
	
}
