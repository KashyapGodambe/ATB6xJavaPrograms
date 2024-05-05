package ex_04052024;

public class Lab040 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * int[][] arr = {
							{1, 2, 3},
							{4, 5, 6},
							{7, 8, 9}
						 };
		    Write - Java method to find the maximum value in a 2D array
		 */
		int[][] arr = {
				{1, 2, 3},
				{4, 10, 6},
				{7, 8, 9}
			 };
		
		int MaxNo = MaxValue(arr);
		System.out.println("maximum value in a 2D array is -> "+MaxNo);
		

	}
	
	
	public static int MaxValue(int[][] arr)
	{	
		int Max = Integer.MIN_VALUE;
		
		for(int i=0; i < arr.length; i++)
		{
			for(int j=0; j < arr[i].length; j++)
			{
				if(arr[i][j] > Max)
				{
					Max = arr[i][j];
				}
			}
		}
		return Max;
		
	}

}
