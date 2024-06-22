package ex_28052024.Collection;

import java.util.HashMap;
import java.util.Map;

public class Lab065 {

	public static void main(String[] args) {
		// TODO Word Frequency Count
		//Given a string, count the frequency of each word in the string. 
		//Input: "hello world hello" Output: {hello=2, world=1}
		
		
		String input = "hello world hello";
		
		Map<String, Integer> wordCount = countWordFrequency(input);
		
		System.out.println(wordCount);
		
		
		

	}
	
	public static Map<String, Integer>countWordFrequency(String input)
	{
		String[] words = input.split("\\s+");
		
		Map<String, Integer> wordCountMap = new HashMap();
		
		
		
		
		
		return wordCountMap;
		
		
		
	}
	

}
