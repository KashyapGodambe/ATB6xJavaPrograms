package ex_23042024;

import java.util.Locale;
import java.util.Scanner;

public class Lab025 {

	public static void main(String[] args) {
		// TODO Program to Check if a Character is a Vowel or a Consonant.
		// aeiou
				System.out.println("Enter character : ");
				Scanner sc = new Scanner(System.in);
				char ch = sc.next().charAt(0);
				
				if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || 
						ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
				{
					System.out.println("Character is a Vowel");
				}
				else
				{
					System.out.println("Character is a Consonant");
				}

						
				
				

	}

}
