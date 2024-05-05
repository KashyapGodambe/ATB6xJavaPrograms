package ex_04052024;

public class Lab041 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * int[][] arr = {
							{1, 2, 3},
							{4, 5, 6},
							{7, 8, 9}
						 };
		    Write a Java method to check if a given element exists in a 2D array. ( element =8) , true
		 */
		
		int[][] arr = {
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9}
			 };
		
		int Target_Element =9;
		
		boolean exists = elementExist(arr, Target_Element);
		
		if(exists)
		{
			System.out.println("The target element " +Target_Element+ " does exists");
		}
		else
		{
			System.out.println("The target element " +Target_Element+ " does not exists");
		}
		
		
		
		

	}
	
	public static boolean elementExist(int[][] arr ,int Target_Element)
	{
		for(int i=0; i < arr.length; i++)
		{
			for(int j=0; j < arr[i].length; j++)
			{
				if(arr[i][j] == Target_Element)
					return true; 
			}
		}
		return false;
		
	}
	
	

}
