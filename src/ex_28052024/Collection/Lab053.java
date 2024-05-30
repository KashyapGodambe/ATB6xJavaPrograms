package ex_28052024.Collection;

import java.util.ArrayList;
import java.util.List;

public class Lab053 {

	public static void main(String[] args) {
		// TODO List > ArrayList
		
		List <String>myCourses = new ArrayList();
		myCourses.add("ATB");
		myCourses.add("MTB");
		myCourses.add("API_Blueprint");
		myCourses.add("PyATB");
		myCourses.add("SQLBasic");
		
		System.out.println(myCourses);
		
		List numList = new ArrayList();
		numList.add(2);
		numList.add(5);
		numList.add(3);
		numList.add(7);
		
		
		
		myCourses.addAll(numList);
		System.out.println(myCourses);
		
		for(Object obj : myCourses)
		{
			System.out.println(obj);
		}
		

	}

}
