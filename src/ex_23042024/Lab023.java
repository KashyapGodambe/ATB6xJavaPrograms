package ex_23042024;

public class Lab023 {

	public static void main(String[] args) {
		// TODO Fizzbuzz
		/*
		 * a program that prints numbers from 1 to 100. 
		 * However, for multiples of 3, print "Fizz" instead of the number, and for multiples of 5,
		 * print "Buzz." For numbers that are multiples of both 3 and 5, print "FizzBuzz."
		 */
		
		for(int i=1; i<=100; i++)
		{
			if(i%3==0 && i%5==0)
			{
				System.out.println("FizzBuzz : "+i);
			}
			else if(i%3==0)
			{
				System.out.println("Fizzz : "+i);
			}
			else if(i%5==0)
			{
				System.out.println("Buzzz : "+i);
			}
			else
			{
				System.out.println(i);
			}
		}
	}

}
