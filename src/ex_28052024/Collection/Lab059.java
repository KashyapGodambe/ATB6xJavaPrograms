package ex_28052024.Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Lab059 {

	public static void main(String[] args) {
		// TODO Set >> HashSet
		
		Set  fruits = new HashSet();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Mango");
		fruits.add("Water Melon");
		fruits.add("Pomogranate");
		System.out.println(fruits);
		System.out.println(fruits.size()); 
		System.out.println(fruits.isEmpty()); 
		System.out.println(fruits.contains("Apple")); 
		System.out.println(fruits.remove("Apple")); 
		System.out.println(fruits);
		fruits.clear();
		System.out.println(fruits);
		
		fruits.add("Mango");
		fruits.add("Banana");
		fruits.add("Water Melon");
		System.out.println(fruits);
		
		System.out.println("___Using for loop___");
		for(Object o : fruits)
		{
			System.out.println(o);
		}
		
		System.out.println("---Using Iterator---");
		Iterator it = fruits.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}


	}

}
