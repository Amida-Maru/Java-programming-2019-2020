import java.util.*;
public class array_exercise1 {

	public static void main(String[] args) {		
		// TODO Auto-generated method stub
		System.out.println("Please enter 5 values to the array");
		Scanner input = new Scanner(System.in);
		int x = 0;
		int [] array0 = new int [5];
		int g = 0;
		
		
		for(x=0; x < 5; x++) {
			int input_number = input.nextInt();
			array0[x] = input_number;
			if (x < 5){
				g +=input_number;
				
			}
			
			
			
		
			
			
			
		
			
			
			
			
			
			
		}
		
		System.out.println("The sum of all elements in array0 = " + g);
		System.out.println("Your numbers in this array include " + Arrays.toString(array0));
		
		
	}
	

}
