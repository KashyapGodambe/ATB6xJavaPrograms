package ex_28052024.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Lab058_RC_Student {

	public static void main(String[] args) {
		// TODO Runner class for Student class
		
		Student student1 = new Student(10, "Kashyap");
		Student student2 = new Student(3, "Siddhi");
		Student student3 = new Student(6, "Mayank");
		
		
		List <Student>student = new ArrayList();
		student.add(student1);
		student.add(student2);
		student.add(student3);
		
		System.out.println(student);
		Collections.sort(student, new SortByNameAsc());
		System.out.println(student);

	}

}
