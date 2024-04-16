package ex_16042024;

import java.util.Scanner;

public class Lab014 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter Num : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
//		*****
//		****
//		***
//		**
//		*
	
	for(int i=0; i<n; i++)
	{
		for(int j=0; j<n-i; j++)
		{
			System.out.print(" *");
		}
		System.out.println();
	}
	

	}

}
