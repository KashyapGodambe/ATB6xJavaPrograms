package ex_28052024.Collection;

import java.util.Collection;
import java.util.Collections;
import java.util.Vector;

public class Lab056 {

	public static void main(String[] args) {
		// TODO Vector example
		
		Vector v =  new Vector();
		v.add(20);
		v.add(45);
		v.add(9);
		v.add(220);
		v.add(59);
		
		Collections.sort(v);
		
		System.out.println(v);

	}

}
