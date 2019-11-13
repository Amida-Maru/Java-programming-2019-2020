import java.util.*;

public class exceptions_handling_verbatim_exercise {
	
	public static void main(String[] args) {
		
		int num1;
		int num2;
		
			/* We suspect that this block of statements can throw
			 * exception so we handled it by placing these statements
			 * inside try and handled the exception in catch block 
			 * */
		
		try {
		num1 = 0;
		num2 = 62 / num1;
		System.out.println(num2);
		System.out.println("Hey I am at the end of try block");
		}
		
		catch (ArithmeticException e) {
			/* This block will only execute if any arithmetic exception 
			* occurs in try block
			*/
			System.out.println("You should not divide a number by zero");
		}
		
		catch (Exception e) {
			/* This is a generic exception gandler which means it can handle
			 * all the exceptions. This will execture if the exception is not 
			 * handled by previous catch blocks 
			 */
			System.out.println("exception occured");
			}
		
		System.out.println("I am out of try-catch block in Java");
			
			 
	}
	
}
		
		
		
		
		
	



