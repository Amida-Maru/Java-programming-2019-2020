import java.util.Arrays;

public class array_exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [] [] Array1 = {
				{"Miss", "Anne-Marrie", "Docherty"},
				{"Mr","James","McLoughlin"},
				{"Mrs","Jane","Doe"}};
		
		for( int x=0; x < Array1.length; x++) {
			System.out.println("Your numbers in this array include " + Arrays.toString(Array1[x]));
			
		}

		
	}
	
	
	
		

}
