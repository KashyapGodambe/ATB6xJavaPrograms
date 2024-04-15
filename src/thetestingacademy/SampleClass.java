package thetestingacademy;

public class SampleClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int a=20;
//		char b='B';
//		
//		System.out.println(a+b);
		
		for(int i=0; i<4; i++)
		{
			System.out.println("i = " +i+ "\n");
			for(int j=0; j<3; j++)
			{
				System.out.println("j = " +j);
				if(j==1)
				{
					break;
				}
				for(int k=0; k<2; k++)
				{
					System.out.println("k = " +k);
				}
			}
		}

	}

}
