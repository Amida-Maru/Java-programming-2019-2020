import java.util.*;
public class piramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter number of blocks to build your piramid");
		Scanner name1 = new Scanner(System.in);
		int name = name1.nextInt();
		int suma = 0;
		int y = 0;
		int x =  0;
		int counter = 0;
		int reps =0;
		
		for( x = name; x > 0 ; System.out.println()) { 
		counter++;
		y = counter + y;
		reps++;
		if(y > name) {
			suma = y - name;
			
			
			if(suma != 0) {
				System.out.println("You are short of " + suma + " blocks to build the next level of your piramid!");
			}
				
			System.out.println("Your piramind therfore will have only level: " + (reps-1));
			break;
		}
		
		 
		}
		
		
		
		
		
		
		
		
			
	
		
	}
	
		

}
		
