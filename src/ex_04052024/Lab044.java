package ex_04052024;

import java.util.Arrays;
import java.util.Scanner;

public class Lab044 {

	public static void main(String[] args) {
		
		// TODO To check if two strings are Anagram or not!!!
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two strings : ");
		String s1 = sc.next();
		String s2 = sc.next();
		
		s1 = s1.trim();
		s2 = s2.trim();
		
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		
		areAnagram(s1, s2);
		if(areAnagram(s1, s2))
		{
			System.out.println("Anagram");
		}
		else
		{
			System.out.println("Not an Anagram");
		}
		

	}
	
	static boolean areAnagram(String str1, String str2)
	{
		if(str1.length() != str2.length())
		{
			return false;
		}
		
		
		char[] charArray1 = str1.toCharArray();
		char[] charArray2 = str2.toCharArray();
		
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		
		return Arrays.equals(charArray1, charArray2);
		
		
		
	}

}
