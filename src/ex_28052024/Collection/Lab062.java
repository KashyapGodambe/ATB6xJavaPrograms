package ex_28052024.Collection;

import java.util.HashSet;
import java.util.Set;

public class Lab062 {

	public static void main(String[] args) {
		// TODO Given an array of integers, return an array of unique elements.
//		ip : [1, 2, 3, 2, 4, 4, 5]
		
		int [] input =  {1, 2, 3, 2, 4, 4, 5};
		int [] ouput = new int[input.length];
		
		
		Set <Integer> uniqueSet = new HashSet();
		for(int num : input)
		{
			uniqueSet.add(num);
		}
		
		System.out.println(uniqueSet);

	}

}
