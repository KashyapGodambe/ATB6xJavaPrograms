package ex_28052024.Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Spliterator;

public class Lab052 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List myList = new ArrayList();
		
		myList.add("Kashyap");
		myList.add("Siddhi");
		myList.add("Meher");
		myList.add(123);
		myList.add(true);
		
		System.out.println(myList);
		
		System.out.println("----------Iterator----------");
		
		Iterator it = myList.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
		System.out.println("---------Advance for loop-----------");
		
		for(Object ob : myList)
		{
			System.out.println(ob);
		}
		
		
		System.out.println("----------Split Iterator----------");
		
		
		ArrayList <Integer>al = new ArrayList();
		al.add(1);
		al.add(2);
		al.add(4);
		al.add(6);
		al.add(8);
		
		Spliterator<Integer> splitr = al.spliterator();
		
		System.out.println("___Using List Iterator___");
		
		ListIterator ls = myList.listIterator();
		while(ls.hasNext())
		{
			System.out.println(ls.hasNext());
			
		}
		
		
		
		
		
		
		

	}

}
