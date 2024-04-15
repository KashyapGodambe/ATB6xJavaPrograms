package ex_13042024;

import java.util.Scanner;

public class Lab006 {

	public static void main(String[] args) {
		// TODO Grade calculator
		
//		A : 90-100
//		B : 80-89
//		C : 70-79
//		D : 60-69
//		F : 0-59
		
		System.out.println("Enter your score");
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		char grade=0;
		
		if(score>=90 && score<=100)
		{
			grade='A';
			
		}
		else if(score>=80 && score<90)
		{
			grade='B';
			
		}
		else if(score>=70 && score<80)
		{
			grade='C';
			
		}
		else if(score>=60 && score<70)
		{
			grade='D';
			
		}
		else {
			grade='F';

		}
		
		
		System.out.println(grade);

	}

}
