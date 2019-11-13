import java.util.Scanner;
public class loops 
{
	public static void main(String[] args) 
	
	{	System.out.println("Give me number smaller than 10!");
		Scanner zmienna = new Scanner(System.in);
		int zmienna1 = zmienna.nextInt();
		int zmienna2 = zmienna1;
		
		for(zmienna1 = zmienna1; zmienna1 > -10 && zmienna1 <10; System.out.println())
		{     if(zmienna1 == 9)
			  {
			  System.out.printf("The value you entered is closing the loop: " + zmienna1);
			  
			  }		
			  else
			  {
			  System.out.printf("The value you entered is: " + zmienna2 + " , this value has been encreased now to: " + zmienna1 + "\n");  
			  }
		  	  zmienna1 ++;
		  	  if(zmienna1 >=6 && zmienna1 <9) 
		  		  
		  	  {	System.out.println("You are just about to exit the loop, please type 0 if you wanna stay here, or 1 if you wanna leave");
		  		  Scanner question = new Scanner(System.in);
				int question1 = question.nextInt();		
		  	  	
					if(question1 == 1)
			  	  	{	System.out.printf("You just escaped the loop!");	
			  	  	 	break;		
			  	  	}
		  	  	
		  	  		
		  	  }
		  	  
		  		  
		 }
		  	  
		  	 
		  		  
		  	  

		
	
			
		
	}

}
