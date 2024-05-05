package ex_27042024;

public class Lab035 {

	public static void main(String[] args) {
		// TODO Constructor, IIB & object creation 
		//Runner class for VwoLogin class
		
		VwoLogin v = new VwoLogin();
		System.out.println(v.email);
		System.out.println(v.pass);
		System.out.println(v.rememberMe());
		
		System.out.println("_-------------------------------_");
		
		VwoLogin v2 = new VwoLogin("kashyap@gmail.com", "Kashyap@000");
		System.out.println(v2.email);
		System.out.println(v2.pass);
		System.out.println(v2.rememberMe());

	}

}
