package ex_23042024;

import java.util.Scanner;

public class Lab027 {

	public static void main(String[] args) {
		// TODO Prime number checker
		
		System.out.println("Enter Number : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
        if (isPrime(num)) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }

	}
	
	public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }


}
