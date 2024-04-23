package ex_20042024;

import java.util.Scanner;

public class Lab021 {

	public static void main(String[] args) {
		// TODO Reverse a string
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		
		StringBuilder sb1;
		sb1 = new StringBuilder(sc.next());
		sb1.reverse();
		
		System.out.println(sb1);
		

	}

}
