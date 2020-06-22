package com.manipal.demo.day9;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
		TreeMap<Integer, String> countryMap = new TreeMap<>();
		
		//key - unique entry - country code
		//value - country name
		
		countryMap.put(91, "India");
		countryMap.put(1, "US");
		countryMap.put(93, "Afganistan");
		countryMap.put(20, "Egypt");
		countryMap.put(56, "Chile");
	
		
		System.out.println(countryMap);
		countryMap.put(1, "USA");
		System.out.println(countryMap);
		
		
		System.out.println(countryMap.firstKey());
		System.out.println(countryMap.get(91));
		System.out.println(countryMap.firstEntry());
		System.out.println(countryMap.entrySet());
		
		
		for(Map.Entry<Integer,String> entry : countryMap.entrySet() ){
			System.out.println("Key : " + entry.getKey()+"\t" + "Value : " + entry.getValue().toUpperCase());
		}

		for(Integer code:countryMap.keySet()) {
			System.out.println(code);
		}
		
		
		for(String name	:countryMap.values()) {
			System.out.println(name);
		}
		
		//Iterator
		
		System.out.println("Using Iterator-------------------------");
		
		Iterator<Map.Entry<Integer,String>> iterator = countryMap.entrySet().iterator();
		
		while(iterator.hasNext()) {
			Map.Entry<Integer,String> entry = iterator.next();
			System.out.println(entry.getKey() + "\t" + entry.getValue());
		}
		
		
		
		

		
		
		
		
		
		
		
		
		
		
	}

}
