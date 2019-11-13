import java.util.Scanner;

public class itelse_further_exercise2 {
	public static void main(String[] args) {
		
		//Variables//
		double Calculation = 0;
		
		System.out.println("Please enter the cost of your dinner for example (32.41 or 50)");
		Scanner Cost = new Scanner(System.in);
		double CostDinner = Cost.nextDouble();
		System.out.println("\n \n \n \n \n \n \n \n \n \n");
		
		System.out.println("Please enter your satisfaction level: \nPress 1 if you are Totally Satisfied with your service. \nPress 2 if you are Just Satisfied with your service. \nPress 3 if you are Not Satisfied with your service.  ");
		Scanner Satisfaction = new Scanner(System.in);
		int SatisfactionLevel = Satisfaction.nextInt();
		
		if(SatisfactionLevel == 1) {
			System.out.println("\n \n \nThank you for your feedback!, We will add now 20% of the service charge to your dinner bill");
			Calculation = CostDinner * 1.2;
			System.out.println("The cost of you dinner: " + Calculation + "$. You satisfaction today: Totally Satisfied");
				
		}
		else if(SatisfactionLevel == 2) {
			System.out.println("\n \n \nThank you for your feedback!, We will add now 15% of the service charge to your dinner bill");
			Calculation = CostDinner * 1.15;
			System.out.println("The cost of you dinner: " + Calculation + "$. You satisfaction today: Satisfied ");
			
		}
		
	
		else if(SatisfactionLevel == 3) {
			System.out.println(" \n \n \nThank you for your feedback!, We will add now 10% of the service charge to your dinner bill");
			Calculation = CostDinner * 1.10;
			System.out.println("The cost of you dinner: " + Calculation + "$. You satisfaction today: Disatisfied");
			
		
	}
		
		
	}

}
