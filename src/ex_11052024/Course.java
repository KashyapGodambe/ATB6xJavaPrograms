package ex_11052024;

public class Course {

	
		// TODO Auto-generated method stub
		
		//Attributes
		String courseName;
		int courseFees;
		String courseDuration;
		String courseType;
		boolean isPaid;
		
		
		//behaviour
		String download(String name)
		{
			System.out.println("Course can be downloaded!!!");
			return name ;
		}
		
		
		String play(String name)
		{
			System.out.println("Course can be Played!!!");
			return name ;
		}
		
		boolean share(boolean paid)
		{
			System.out.println("Course can be Played!!!");
			return paid ;
		}
		
		

	

}
