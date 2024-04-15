package ex_13042024;

import java.util.Scanner;

public class Lab008 {

	public static void main(String[] args) {
		// TODO triangle classifier
//		user will provide lengths of the triangle
//		and from that determine if triangle is a
//		equilateral, isoscales or scelene triangle
		
		System.out.println("Enter sides of a triangle : ");
		Scanner sc = new Scanner(System.in);
		int side1 = sc.nextInt();
		int side2 = sc.nextInt();
		int side3 = sc.nextInt();
		
		if(side1 == side2 && side2 == side3)
		{
			System.out.println("Equilateral triangle");
		}
		else if(side1 == side2 || side2 == side3 || side1 == side3)
		{
			System.out.println("Isoscales triangle");
		}
		else
		{
			System.out.println("Scalene triangle");
		}

	}

}
