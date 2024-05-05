package ex_25042024;

public class Lab032 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		    *
//		   ***
//		  *****
//		 *******
//		*********

		int rows = 5; // Number of rows in the pyramid

		for (int i = 1; i <= rows; i++) 
		{
			// Print spaces before the stars
			for (int j = 1; j <= rows - i; j++) 
			{
				System.out.print("A");
			}
			// Print stars
			for (int k = 1; k <= 2 * i - 1; k++) 
			{
				System.out.print("*");
			}
			// Move to the next line
			System.out.println();
		}

	}

}
