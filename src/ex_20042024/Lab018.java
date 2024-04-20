package ex_20042024;

public class Lab018 {

	public static void main(String[] args) {
		//x = 10, y = 12.4 , z = 56.78
		
		
		int x = 10;
		float y = 12.4f; 
		float z = 56.78f;
		
	
		double squareOfX = Math.pow(x, 2);
		double squareOfY = Math.pow(y, 2);
		
		System.out.println("Square of X is " +squareOfX + "  "+ "Square of Y is " +squareOfY);
		double sumsqrOfXnY = squareOfX + squareOfY;
		System.out.println("Sum of X*2 & Y*2 is  "+sumsqrOfXnY);
		
		double modOfZ = Math.abs(z);
		System.out.println("modOfZ is  " +modOfZ);
		
		double insideExp = squareOfX + squareOfY - modOfZ;
		System.out.println("insideExp is  " +insideExp);
		
		double result = Math.cbrt(insideExp);
		System.out.println("finalAns is  : " +result);


		
		

	}

}
