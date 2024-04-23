package ex_23042024;

import java.util.Scanner;

public class Lab026 {

	public static void main(String[] args) {
		// TODO Program to Check if a Number is Positive, Negative, or Zero
		
		System.out.println("Enter Number : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if(num>0)
		{
			System.out.println("Positive Number");
		}
		else if(num<0)
		{
			System.out.println("Negative Number");
		}
		else
		{
			System.out.println("Number is Zero");
		}
		

	}

}
