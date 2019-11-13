

public class twod_arrays {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub

		
		int [][] myArray = new int[4][3]; // 1 sposob, 3 rows each has 10 values - 1 way of doing 2d array
		
		int[][] numberGrid = { // 2 sposob na 2 d array
				
				{1,2,3}, // 1 row index 0 and this index 0 has 3 more indexes for columns
				{4,5,6}, // 2 row index 1 remember its an array within array 
				{7,8,9}, // 3 row index 2 
				{0}		 // 4 row index 3
		
		};
		
		
		/*create a for loop with x = 0 ; and x < 4 ; x++
				create a loop within this lopp which will do for each index of x 3 indexes of y
				 so y = 0 ; and y < 3 ; y ++*/
		
		for(int i = 0; i < numberGrid.length ; i++) {
			System.out.println("");
			for(int y = 0; y < numberGrid[i].length; y++) {	
			System.out.print(numberGrid[i][y]);
		}}
			
		
		
		
	
	}

}
