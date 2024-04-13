package ex_11042024;

public class Lab003 {

	public static void main(String[] args) {
		// TODO  Search an index of an element in an array
		int a[] = {1,2,30,4};
		int search = 30;
		boolean flag = false;
		for(int i=1; i< a.length; i++)
		{
			if(a[i]==search)
			{
				System.out.println(a[i]);
				flag=true;
				break;
			}
//			if(!flag)
//			{
//				System.out.println("-1");
//			}
				
		}

	}

}
