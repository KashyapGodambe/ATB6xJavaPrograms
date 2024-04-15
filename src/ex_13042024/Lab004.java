package ex_13042024;

import java.util.Scanner;

public class Lab004 {

	public static void main(String[] args) {
		// TODO Conditions & loops
		// TODO Largest among 3 no. 
		
		System.out.println("Enter value of a, b, c");
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		System.out.println("Your inputs are " +a+ " " +b+ " " +c);
		
		if(a>b && a>c) {
			System.out.println("Max is " +a);
		}
		if(b>a && b>c) {
			System.out.println("Max is " +b);
		}
		if(c>a && c>a) {
			System.out.println("Max is " +c);
		}
		

	}

}
