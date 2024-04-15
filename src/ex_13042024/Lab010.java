package ex_13042024;

import java.util.Locale;
import java.util.Scanner;

public class Lab010 {

	public static void main(String[] args) {
		// TODO If vowel or not
		// aeiou
		System.out.println("Enter character : ");
		Scanner sc = new Scanner(System.in);
		String c = sc.next();
		c=c.toLowerCase(Locale.ROOT);
		
		switch(c)
		{
		case "a":
		case "e":
		case "i":
		case "o":
		case "u":
			System.out.println("It is vowel");
			break;
		default:
			System.out.println("Not a vowel");
			
		}

	}

}
