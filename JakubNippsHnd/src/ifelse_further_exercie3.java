import java.util.Scanner;

public class ifelse_further_exercie3 {
		public static void main(String[] args) {
			
			//Methods//
			
			double x = CosFajne();  // It returns value from the user's input about saving account as a variable x 
			double o = CosFajne1(); // It returns value from the user's input about checking account as a variable o 
			
			//Variable
			
			boolean flag = true; // Used for loops as a condition for execution if true and for escaping from the loop if false
			
			
			//Transaction panel//
			
			System.out.println("Welcome to the main system, please specify the transaction type you would like to perform: \nPress 1 for Deposit \nPress 2 for Withdrawl \nPress 3 for Transfer  ");
			
			flag = true;
			while(flag == true) {
				Scanner Option = new Scanner(System.in);
				int MainOption = Option.nextInt();
				
				if(MainOption == 1) { //Funcionality only created for option number 1 (Desposit) - the rest of the functions to be implemented later // 
					System.out.println("\n \nWelcome to the deposit system, please specify what amount would you like to deposit (exmple 54 or 23.50),");
					while(flag ==true) {
						Scanner Deposit = new Scanner(System.in);
						double DepositMenu = Deposit.nextDouble();
						 
						if(DepositMenu >= 0 ) {
							System.out.println("\n \n \nYou are going to deposit " + DepositMenu + "$ please specify to which account you want to deposit that amount: \nPress 1 for Saving account \nPress 2 for Checking account" );
							Scanner DepositOption = new Scanner(System.in);
							int DepositAccountOption = Option.nextInt();
							if(DepositAccountOption == 1) {
								double c = DepositMenu + o;
								System.out.println("\n \n \nYou just deposited " + DepositMenu + "$ to your saving account. You total sum is:" + c);
								
							}
							else if(DepositAccountOption == 2) {
								double y = DepositMenu + x;
								System.out.println("\n \n \nYou just deposited " + DepositMenu + "$ to your checking account. Your total sum is:" + y);
							}	
							
					}
						else {
							System.out.println(" \n \n \nYou can deposit only positive value! " + DepositMenu +" It's not correct. Please try again!");
						}
					
				}
			
					
			}
			
			
			
		}
 
}
		static double CosFajne() { //This methods puts input from a user and associate it with SavingAccount//
			System.out.println("\n \nPlease enter the balance of your saving account (example 1345 or 302.53:)");
			boolean flag = true;
			while (flag == true){
				Scanner Saving = new Scanner(System.in);
				double SavingAccount = Saving.nextDouble();
				if(SavingAccount >= 0 ) {
					System.out.println("\n \n \nI can confirm that your balance for Saving Account is: " + SavingAccount + "$");
					flag = false;
					return SavingAccount;
					
					
				}
				else {
					System.out.println("\n \n \n \nYour Balance can not be negative, re-enter your balance: ");
					
				}
					
				
			}
			return 0;  // Changing the value of the return statement from the outer scope of this method does not change the final value returned by the method itself //
			
			
			
		}
		
		static double CosFajne1() {  //This methods puts input from a user and associate it with CheckingAccount//
			System.out.println("\n \n \nPlease enter the balance of your checking account (example 1345 or 302.53:)");
			boolean flag = true;
			while (flag == true){
				Scanner Checking = new Scanner(System.in);
				double CheckingAccount = Checking.nextDouble();
				if(CheckingAccount >= 0 ) {
					System.out.println("\n \n \n \n \n I can confirm that your balance for Checking Account is: " + CheckingAccount+ "$ Press any number to progress to Main Menu");
					Scanner Question = new Scanner(System.in);
					int Question1 = Question.nextInt();
					if(Question1 == 1) {
						flag =false;
					}
					return CheckingAccount;
					
					
				}
				else {
					System.out.println("\n \n \n \nYour Balance can not be negative, re-enter your balance: ");
					
				}
					
				
			}
			return 0;
			
			
			
		}
		
}
		



