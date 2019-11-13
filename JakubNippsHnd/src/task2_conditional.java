import java.util.Scanner;

public class task2_conditional {
	public static void main(String[] args) {
		double Pass = 40;
		System.out.println("Welcome to the program! Please provide me with your test results (example: 61 or 87.5) and I will tell you what grade you received.");
		Scanner Results = new Scanner(System.in);
		double ResultsMaths = Results.nextDouble();
		if((double)ResultsMaths >= 70) {
			System.out.println("You have passed your exam with a grade A.");
		}
		else if((double) ResultsMaths >= 60) {
			System.out.println("You have passed your exam with a grade B.");
			
		}
		else if((double) ResultsMaths >= 50) {
			System.out.println("You have passed your exam with a grade C.");
			
		}
		else if((double) ResultsMaths >= 40) {
			System.out.println("You have passed your exam with a grade D.");
		}
		else {
			System.out.println("You have failed your exam as you scored bellow " + Pass + "%.");
		}	
		
		
	}

}
