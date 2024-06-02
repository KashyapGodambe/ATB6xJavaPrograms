package ex_28052024.Collection;

import java.util.Stack;

public class Lab057 {

	public static void main(String[] args) {
		// TODO Stack example
		
		Stack s = new Stack();
		s.push("A");
		s.push("B");
		s.push("C");
		s.push("Z");
		s.push("T");
		
		
		s.add("ABC");
		System.out.println(s);
		
		//s.pop();
		System.out.println(s.pop());
		System.out.println(s);
		System.out.println(s.peek());


	}

}
