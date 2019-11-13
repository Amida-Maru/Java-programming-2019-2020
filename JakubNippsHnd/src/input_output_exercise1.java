import java.io.*;
import java.util.*;

public class input_output_exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("test.txt"); // The same like you would do with standard scanner class
		//Writes to the file 
		try {
			PrintWriter output = new PrintWriter(file);
			output.println("Jakub Nipps");
			output.println(42);
			output.close();
		} catch (IOException ex) {
			System.out.println("Something went wrong");
	
		//Reads from the file 
		}
		try {
		Scanner input =new Scanner(file);
		String name = input.nextLine();
		int age = input.nextInt();
		System.out.printf("Name: %s Age %d\n", name,age);
		}catch (IOException ex) {
			System.out.println("Someting went wrong when trying to read a file");
		}
	
	
	
	
	}
	
	
	

}
