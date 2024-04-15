package ex_13042024;

public class Lab005 {

	public static void main(String[] args) {
		// TODO If else
		int a = 10;
		int b = 20;
		int c = 30;
		int max=0;
		
		if(a>b && a>c) {
			max=a;
			System.out.println("Max is "+max);
		}
		else if(b>a && b>c) {
			max=b;
			System.out.println("Max is "+max);
		}
		else {
			max=c;
			System.out.println("Max is "+max);
		}

	}

}
