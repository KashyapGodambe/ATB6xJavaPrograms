package ex_25042024;

import java.util.Scanner;

public class Lab030 {

	public static void main(String[] args) {
		// TODO Factorial
		
		System.out.println("Enter a Number : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int op=1;
		
		for(int i=1; i<=num; i++)
		{
			op= op * i;
		}
		
		System.out.println("Factorial is : "+op);
	

	}

}
