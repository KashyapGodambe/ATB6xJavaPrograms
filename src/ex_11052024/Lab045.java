package ex_11052024;

public class Lab045 {

	public static void main(String[] args) {
		// TODO Runner-class for Course, student, payment
		
		//Student 1 object
		Student ananya = new Student();
		ananya.studentName = "Ananya";
		ananya.studentAge = 25;
		ananya.studentId = 001;
		ananya.studentAdd = "35/D, Room no. 12, Tiruanantapuram";
		System.out.println("Student 1's name is : " +ananya.studentName);
		System.out.println("Student 1's age is : " +ananya.studentAge);
		System.out.println("Student 1's Id is : " +ananya.studentId);
		System.out.println("Student 1's Address is : " +ananya.studentAdd);
		
		ananya.askDoubts(true);
		
		
		
		System.out.println(" ");
		
		
		//Student 2 object
		Student mayur = new Student();
		mayur.studentName = "Mayur";
		mayur.studentAge = 29;
		mayur.studentId = 002;
		mayur.studentAdd = "003/Y, Room no. 1003, Sawarde";
		System.out.println("Student 2's name is : " +mayur.studentName);
		System.out.println("Student 2's age is : " +mayur.studentAge);
		System.out.println("Student 2's Id is : " +mayur.studentId);
		System.out.println("Student 2's Address is : " +mayur.studentAdd);
		
		mayur.askDoubts(false);
		
		System.out.println(" ");
		//Student 3 object
		Student mariyam = new Student();
		mariyam.studentName = "Mariyam";
		mariyam.studentAge = 32;
		mariyam.studentId = 003;
		mariyam.studentAdd = "420/Z, Room no. 111, Alibaug";
		System.out.println("Student 3's name is : " +mariyam.studentName);
		System.out.println("Student 3's age is : " +mariyam.studentAge);
		System.out.println("Student 3's Id is : " +mariyam.studentId);
		System.out.println("Student 3's Address is : " +mariyam.studentAdd);
				
		mariyam.askDoubts(true);
		
		
		

	}

}
