package ex_20042024;

import java.util.Scanner;

public class Lab016 {

	public static void main(String[] args) {
		// TODO Max no. of 3 no. using turnary operator
		
		System.out.println("Enter value of a, b, c");
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		System.out.println("Your inputs are " +a+ " " +b+ " " +c);
		
		int max = (a>b && a>c) ? a : (b>c ? b : c);
		
		System.out.println("Max no. is  " +max);
		

	}

}
