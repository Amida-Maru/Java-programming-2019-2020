import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
public class input_to {

	public static void main(String[] args) {
		
	File something = new File("mojtestowy.txt");
	
	// write to the file
	
	
	
	try {
	PrintWriter nazwa = new PrintWriter(something);
	
	nazwa.println("Jakub Nipps");
	nazwa.println(24 );
	nazwa.close(); // you have to close the handle to the file otherwise java will not be able to access this file
	
	
	}catch(IOException ex) {
		System.out.printf("%s%n", ex);
	}
	
	try {
	Scanner zpliku = new Scanner(something);
	String nazwa1 = zpliku.nextLine();
	int nazwa2 = zpliku.nextInt();
	
	System.out.printf(" %s Age %s\n", nazwa1, nazwa2);
	}
	catch(Exception ex1) {
		System.out.print("zz,ex1");
	}
	}

} // end of input_to class
