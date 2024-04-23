package ex_20042024;

public class Lab020 {

	public static void main(String[] args) {
		// TODO String Buffer
		
		StringBuffer sb1 = new StringBuffer("TTA");
		
		StringBuffer sb2 = new StringBuffer("TTA");
		
		System.out.println(sb1.equals(sb2)); // This is not allowed in case of String buffer But can be used with String.
		
//		instead we can use following:
		
		System.out.println(sb1.toString().contentEquals(sb2.toString()));
		

	}

}
