package ex_04052024;

public class Lab042 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * int[][] arr = {
							{1, 2, 3},
							{4, 5, 6},
							{7, 8, 9}
						 };
		    Write a Java method to transpose a given 2D array.
		 */
		
		int[][] arr = {
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9}
			 };
		
		int transposedArr[][] = transpose(arr);
		
		printArray(transposedArr);
		
		

	}
	
	public static int[][] transpose(int[][] arr)
	{	
		int[][] transposedArr = new int[arr.length][arr[0].length];

		for(int i=0; i < arr.length; i++)
		{
			for(int j=0; j < arr[i].length; j++)
			{
				transposedArr[i][j] = arr[j][i];
				
					 
			}
		}
		
		return transposedArr;
		
		
	}
	
	
	  public static void printArray(int[][] arr) {
	        for (int i = 0; i < arr.length; i++) {
	            for (int j = 0; j < arr[i].length; j++) {
	                System.out.print(arr[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }

}
