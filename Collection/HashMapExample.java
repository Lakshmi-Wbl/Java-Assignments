package com.Collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class HashMapExample {
	public static void main(String[] args) {
		//declaring the hashmap.it doesn't maintain any order
		Map<Integer,String> hmap=new HashMap<Integer,String>();
		//adding key-value pair to it
		hmap.put(1, "Red");
		hmap.put(2, "Blue");
		hmap.put(3, "Green");
		hmap.put(4, "Yellow");
		hmap.put(5, "Pink");
		
		//displaying value of required key
		String value=hmap.get(5);
		System.out.println(value);
		
		
		// displaying all values of map
		for(Integer k:hmap.keySet()){
			String value1=hmap.get(k);
			System.out.println("key="+k+" value="+value1);
			
		}
		
		

	}

}
