package ex_28052024.Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Lab054 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List myCourses = new ArrayList();
		myCourses.add("ATB");
		myCourses.add("MTB");
		myCourses.add("API_Blueprint");
		myCourses.add("PyATB");
		myCourses.add("SQLBasic");
		myCourses.add("java beginner");
		myCourses.add(123);
		myCourses.add(true);
		
		System.out.println();
		System.out.println("----Using Iterator----");
		
		Iterator iterator = myCourses.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());

		}
		System.out.println();
		System.out.println("----Using ListIterator forward----");
		
		ListIterator lt = myCourses.listIterator();
		while(lt.hasNext())
		{
			System.out.println(lt.next());
		}
		
		System.out.println();
		System.out.println("----Using ListIterator reverse----");
		
		ListIterator lt2 = myCourses.listIterator(myCourses.size());
		while(lt2.hasPrevious())
		{
			//lt2.add("Gen AI");
			System.out.println(lt2.previous());
		}
		
		
	}

}
