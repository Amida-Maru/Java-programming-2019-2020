import java.util.*;
// jacek ty chuju

public class ifelse_further_exercise1 {
	public static void main(String[] args) {
		System.out.println("Welcome to the ATM simulator program! You will be shortly asked to enter your pin in order to access your bank account \nRemember that your pin number is '1234'. If you enter that pin number correctly you will get access to your bank account. \nHowever if you should enter your pin number incorectly 3 times your acount will be blocked.");
		
		int CorrectPin = 1234;
		int counter = 3;
		
		
		boolean flag = true;
		while (flag) {
			
			Scanner PinNumber = new Scanner(System.in);
			int PinNumberMaths = PinNumber.nextInt();
			
			if(PinNumberMaths == CorrectPin) {
				System.out.println("You have successfully logged into your bank account!");
				flag = false;		
			}
			else {
				counter = counter - 1;
				
				if(counter == 0) {
				System.out.println();
			}
				
				else{
					System.out.println("You entered the wrong pin!  " + counter + " Attempts left before we block your account... ");
				}
				
				
				
				if(counter == 0) {
					System.out.println("Your account has been blocked, please visit your branch in order to unlock it. ");
					flag = false;
						
				}	
				
					
			}
		
				
		}
		
			
	
			
		
				
			
		
	}

}
