package ex_13042024;

import java.util.Scanner;

public class Lab011 {

	public static void main(String[] args) {
		// TODO Traffic light simulator
		
//		write a code that takes an integer representing the cuurent state of the
//		traffic light & print the enxt state (using switch case)
		
		System.out.println("Enter the 1-3 which sate you are in : ");
		Scanner sc = new Scanner(System.in);
		int state = sc.nextInt();
		
		switch(state)
		{
			case 1: System.out.println("Next will be Yellow");
					break;
			case 2: System.out.println("Next will be Green");
					break;
			case 3: System.out.println("Next will be Red");
					break;
			default: System.out.println("Invalid state");
				
		}
		
		
		
		

	}

}
