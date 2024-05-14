package ex_11052024;

public class Student {

		// TODO Auto-generated method stub
		
		//Attributes
		String studentName;
		int studentAge;
		int studentId;
		String studentAdd;
		boolean isAllowed;
		
				
				
		//behaviour
		//constructors
		Student()
		{
			System.out.println("From default constructor - for initializing!!!");
		}
		
		
		Student(String name, int age, int id, String address)
		{
			System.out.println("From parameterized constructor - for initializing!!!");
			studentName = name;
			studentAge = age;
			studentId = id;
			studentAdd = address;
			
			
		}
		
		boolean hasAccess(boolean allowed)
		{
			System.out.println("Student is able to access the course!!!");
			return allowed ;
		}
		
		String readContent(String n)
		{
			System.out.println("Student is able to read the course content!!!");
			return n;
		}
		
		void play()
		{
			System.out.println("Student is able to Play the course..!!!");
			
		}
		
		boolean askDoubts(boolean allowed)
		{
			if(allowed)
			{
				System.out.println("Student is able to ask doubts..!!!");
				return allowed ;
			}
			else
			System.out.println("Student is not able to ask doubts..!!!");
			return false;
		}
		
		

	

}
