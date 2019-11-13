import java.util.ArrayList;
import java.util.Scanner;


public class array_exercise3 {
	public static void main(String[] args) {
		
		// break keyword//
		System.out.println(user_input());
		}
		
	                              

	static ArrayList user_input(){
		System.out.println("type 'next' if you wanna add next candidate");
		String checking = "next";
		ArrayList<String> user_input = new ArrayList<String>();
		boolean flag = true;
		while(flag == true) {	
		Scanner start = new Scanner (System.in);
		String startAddingToArray = start.nextLine();
		
		
		if(!startAddingToArray.equals(checking)) {
			user_input.add(startAddingToArray);
			System.out.println(user_input);
		}
		{
			
			if(startAddingToArray.equals(checking)) {
				System.out.println("Please enter the details of next candidate");
				user_input.add("---->");
				continue;
				
				
					
			}
			
			
			
		}
		
		
		}
		return user_input;
	}
	
	
	
}

