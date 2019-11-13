import java.util.Scanner;


public class task1_conditional {
	public static void main(String[] args) {
		System.out.println("Welcome to the program! Please provide your exam results (example: 55 or 75.2) in order to find out that you passed.");
		Scanner Score = new Scanner(System.in);
		double ScoreMaths = Score.nextDouble();
		if((double)ScoreMaths >= 60) {
			System.out.println("Congratulations! You have passed your exam.");
		}
		else {
			System.out.println("I am sorry, you have failed your exam. The score you obtained: " + ScoreMaths + "% is bellow the pass treshold of 60%.");
		}
	}

}
