package ex_28052024.Collection;

import java.util.HashMap;
import java.util.Map;

public class Lab063 {

	public static void main(String[] args) {
		// TODO Map >> HashMap
		
		Map <String, Object>studentMap = new HashMap();
		
		studentMap.put("firstname", "Kashyap");
		studentMap.put("age", 29);
		studentMap.put("roll", 1);
		studentMap.put("course", "ATB");
		studentMap.put("lasttname", "Godambe");
		
		
		System.out.println(studentMap);
		System.out.println(studentMap.get("firstname"));
		System.out.println(studentMap.isEmpty());
		System.out.println(studentMap.keySet());
		System.out.println(studentMap.containsKey("age"));
		System.out.println(studentMap.containsValue("ATB"));
		System.out.println(studentMap.values());
		System.out.println();
		
		for(Map.Entry<String, Object> item : studentMap.entrySet())
		{
			System.out.println(item.getKey() + " : " + item.getValue());
		}
		
		//Iterator it = studentMap.i

	}

}
