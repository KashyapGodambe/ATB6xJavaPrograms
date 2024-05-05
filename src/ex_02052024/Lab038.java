package ex_02052024;

import java.util.Scanner;

public class Lab038 {

	public static void main(String[] args) {
		// TODO Create a Program which takes arrays and print all the marks.
		
		Scanner sc = new Scanner(System.in);
		float marks [] = new float[5];
		
		System.out.println("Enter the marks of the Subject 1 to 5 : ");
		
		marks[0] = sc.nextFloat(); 
		marks[1] = sc.nextFloat(); 
		marks[2] = sc.nextFloat(); 
		marks[3] = sc.nextFloat(); 
		marks[4] = sc.nextFloat(); 
		
		for(int i=0; i<marks.length; i++)
		{	
			if(marks[i] < 30)
			{
				System.out.println("Failed in this subject  : -> " + marks[i]);
			}
			System.out.println(marks[i]);
		}
		
		
	}

}
