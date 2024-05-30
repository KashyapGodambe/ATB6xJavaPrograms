package ex_25052024.wrapperEnumException;

public class Lab051 {

	public static void main(String[] args) {
		// TODO Exception handling
		try
		{
			int a = 10;
			int res  = a/0;
			
			System.out.println(res);
			
			String ab = "Kashyap";
			char ab_res = ab.charAt(10);
			System.out.println(ab_res);
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}

	}

}
