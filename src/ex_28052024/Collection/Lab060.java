package ex_28052024.Collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Lab060 {

	public static void main(String[] args) {
		// TODO Set >> LinkedHashSet
		
		Set  fruits = new LinkedHashSet(10, 3);
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Mango");
		fruits.add("Water Melon");
		fruits.add("Pomogranate");
		System.out.println(fruits);

	}

}
