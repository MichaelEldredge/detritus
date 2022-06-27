package com.revature.map;

import java.util.HashMap;
//import java.util.Hashtable;
import java.util.Map;
import java.util.Set;
//import java.util.TreeMap;

public class MapDemo {
	public static void main(String[] args) {
		//Map<String,Integer> myMap = new Hashtable<String, Integer>();
		Map<String,Integer> myMap = new HashMap<String, Integer>();
		
		myMap.put("Mike", 2500);
		myMap.put("Austin", 2500);
		myMap.put("Jem", 2501);
		myMap.put("Austin", 2600);
		myMap.put(null, null);
		
		System.out.println(myMap);
		System.out.println(myMap.get("Jem"));
		
		Set<String> myKeys = myMap.keySet();
		
		//System.out.println(myKeys);
		for (String s:myKeys)
			System.out.println(s+":"+myMap.get(s));
	}
}
