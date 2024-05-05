package ex_27042024;

public class VwoLogin {

	String email;
	String pass;

	{
		System.out.println("I am from Instance initialization block-1");
	}
	
	VwoLogin(){
		System.out.println("From Default constructor");
	}
	
	
	
	VwoLogin(String s, String p){
		this.email = s;
		this.pass = p;
		System.out.println("From Parameterized constructor");
	}
	
	 boolean rememberMe(){
		return true;
		
	}

}
