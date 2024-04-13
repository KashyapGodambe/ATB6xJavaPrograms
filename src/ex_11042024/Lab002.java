package ex_11042024;

public class Lab002 {

	public static void main(String[] args) {
		// TODO Find Max value in an array elements  OR Arrays.sort(a);
				int [] a = {1,2,30,4};
				int ans = a[0];
				for(int i=1; i< a.length; i++)
				{
					if(ans<a[i])
					{
						ans= a[i];
					}
				}
				System.out.println(ans);
	}

}
