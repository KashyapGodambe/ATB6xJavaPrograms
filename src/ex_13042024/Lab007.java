package ex_13042024;

import java.util.Scanner;

public class Lab007 {

	public static void main(String[] args) {
		// TODO Leap year
//		Leap year is divisible by 4
//		but not by 100 unless it is also divisible by 400
		
		System.out.println("Enter year : ");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		
		if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
		{
			System.out.println("Leap year");
		}
		else {
			System.out.println("Not a Leap year");
		}

	}

}
