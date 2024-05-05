package ex_02052024;

public class Lab037 {

	public static void main(String[] args) {
		// TODO Arrays practise
		int j;
		int student_salaries[]  = {30, 20, 53, 61, 28, 70};
		int double_std_salary [] = new int[student_salaries.length];
		
		for(j=0; j<student_salaries.length; j++)
		{
			double_std_salary [j] = student_salaries[j]*2;
			
		}
		System.out.println();
//		for(int k=0;k<double_std_salary.length;k++) {
//		System.out.print(double_std_salary[k]+" ");
//		}
//		System.out.println();
		printArray(double_std_salary);

	}
	
	public static void printArray(int[] arr) {
        for (int i=0; i< arr.length; i++) 
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
	
//	public static void printArray(int[] arr) {
//        for (int num : arr) {
//            System.out.print(num + " ");
//        }
//        System.out.println();
//    }


}
