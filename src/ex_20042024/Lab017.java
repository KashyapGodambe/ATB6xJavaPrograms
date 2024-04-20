package ex_20042024;

public class Lab017 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int a = 10; 
		 
		 System.out.println(++a + a++ + a++);
		 
		 /*
		  * a=11 exp=11
		  * a=12  exp=11
		  * a=13  exp=12
		  */
		 
		 int b = 10; 
		 
		 System.out.println(--b + b++ + ++b);
		 
		 /*
		  * exp=9 b=9
		  * exp=9 b=10
		  * exp=11 b=11
		  */

	}

}
