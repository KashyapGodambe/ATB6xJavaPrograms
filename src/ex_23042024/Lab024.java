package ex_23042024;

import java.util.Scanner;

public class Lab024 {

	public static void main(String[] args) {
		// TODO Program to Find the Largest Among Three Numbers
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a 3 numbers : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int max=0;
		
		if(a>b && a>c) {
			max=a;
			System.out.println("Max is "+max);
		}
		else if(b>a && b>c) {
			max=b;
			System.out.println("Max is "+max);
		}
		else {
			max=c;
			System.out.println("Max is "+max);
		}


	}

}
