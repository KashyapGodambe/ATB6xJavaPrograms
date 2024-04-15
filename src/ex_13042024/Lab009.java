package ex_13042024;

import java.util.Scanner;

public class Lab009 {

	public static void main(String[] args) {
		// TODO Switch statement
		

		System.out.println("Enter day : ");
		Scanner sc = new Scanner(System.in);
		int day = sc.nextInt();
		
		switch(day)
		{
		case 1:
			System.out.println("MON");
			break;
		case 2:
			System.out.println("TUE");
			break;
		case 3:
			System.out.println("WED");
			break;
		case 4:
			System.out.println("THU");
			break;
		case 5:
			System.out.println("FRI");
			break;
		case 6:
			System.out.println("SAT");
			break;
		case 7:
			System.out.println("SUN");
			break;
		default:
			System.out.println("Invalid day");
			
		}
		System.out.println("Out of the loop!!");

	}

}
