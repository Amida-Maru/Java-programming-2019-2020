import java.util.*;

public class task3_conditional {
	public static void main(String[] args) {
		Scanner Results = new Scanner(System.in);
		double ResultsMaths = Results.nextDouble();
		if((double) ResultsMaths % 2 == 0){
			System.out.println("The number you entered represents an even number!");
			
		}
		else {
			System.out.println("The number you entered represent an uneven number!");

		}
	}

}
