package ex_28052024.Collection;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Lab055 {

	public static void main(String[] args) {
		// TODO LinkedList
		
		List myCourses = new LinkedList();
		myCourses.add("ATB");
		myCourses.add("MTB");
		myCourses.add("API_Blueprint");
		myCourses.add("PyATB");
		myCourses.add("SQLBasic");
		myCourses.add("java beginner");
		
		System.out.println(myCourses);
		
		
		
		System.out.println("____Using vectors____");
		Vector v =  new Vector();
		v.add("MTB");
		v.add("ATB");
		v.add("PythonATB");
		v.add("SQL");
		v.add("Appium");
		
		Enumeration e = v.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
		
		

	}

}
