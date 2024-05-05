package ex_25042024;

import java.util.Scanner;

public class Lab029 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Program to Perform Arithmetic Operations
		Take a input from user, input1, input2 as int and ask the user what you want to do, 
		enter char +,*,/ ,%, - , you will share the result by using the switch.
		 */
		
		System.out.println("Enter Number1 & Number2: ");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		System.out.println("Enter the arithmetic operation you want to perform : ");
		char op = sc.next().charAt(0);
	
		
		
		switch(op)
		{
		case '+' :
			System.out.println(num1 + num2);
			break;
		case '-' :
			System.out.println(num1 - num2);
			break;
		case '/' :
			if(num2 !=0)
			{
			System.out.println(num1 / num2);
			break;
			}
			else
			{
				System.out.println("Can not divide by Zero");
			}
		case '*' :
			System.out.println(num1 * num2);
			break;
		default :
			System.out.println("Invalid operator");
			
		}
		

	}

}
