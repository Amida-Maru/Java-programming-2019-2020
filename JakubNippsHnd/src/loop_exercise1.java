
public class loop_exercise1{
	public static void main(String[] args) {
	// Write a program using a while loop that prints out the numbers from 1 to 10
		//Write a program using a Do While loop that prints out the numbers from 1 to 10
		//Write a program using a For loop that prints out the numbers from 1 to 10//
		int i = 1;
		while (i < 11) {
			System.out.println(i);
			i++;
		}
		do_loop();	
		for_loop2();
	}
		
	
	public static void do_loop() {
		System.out.println("\n");
		int x = 1;

		do {
			System.out.println(x);
			x++;
		
		}
		while(x < 11);
		System.out.println("\n");
		
	}	

	
	
	public static void for_loop2() {
		
		for(int y = 1 ; y < 11 ; y ++ )
			System.out.println(+ y);
		
		
		
		
		
		
		
	}
	
	
	
}




		
	


