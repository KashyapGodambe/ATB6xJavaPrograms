package ex_16042024;

import java.util.Scanner;

public class Lab015 {

	public static void main(String[] args) {
		// TODO Pyramid of stars
		
		
		System.out.println("Enter Num : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			// Print spaces before the stars
			for (int j = 1; j <= n - i; j++) {
			System.out.print(" ");
			}

			// Print stars
			for (int k = 1; k <= 2 * i - 1; k++) {
			System.out.print("*");
			}

			// Move to the next line
			System.out.println();
		
		
		
		}
	}

}
