package ex_11042024;

public class Lab001 {

	public static void main(String[] args) {
		// TODO sum of elements of array
		int [] a = {1,2,3,4};
		int sum = 0;
		for(int i=0; i<a.length;i++)
		{
			sum=sum+a[i];
		}
		System.out.println(sum);
	}

}
